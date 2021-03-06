package org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.examples.contacts.client.generated.ContactsGxtWrapperFactory;
import org.dmd.examples.contacts.client.generated.gxt.ContactGXT;
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterBaseImpl;
import org.dmd.examples.contacts.shared.generated.dmo.ContactsDMSAG;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.extjs.gxt.ui.client.widget.MessageBox;

/**
 * The ContactListPresenter is designated as a singleton so that it will "live"
 * through the entire lifetime of the application. It is responsible for managing
 * the set of Contact entries displayed by the ContactListView. The Contacts are 
 * maintained in a GxtCache (imported from the gxt module) which handles wrapping
 * the objects added to it for use with the GXT widgets (such as Grids).
 * <p/>
 * This class also manages the ContactListView which is instantiated only once.
 * The ListContactsActivity simple asks for the view when it's started.
 * <p/>
 * 
 */
public class ContactListPresenter extends ContactListPresenterBaseImpl {
	
	ContactListView	view;
	
	Logger logger = Logger.getLogger("ContactListPresenter");

	public ContactListPresenter(MvwRunContextIF rc){
		super(rc);
		
		logger.fine("being instantiated...");
		
		// Indicate that we wish to maintain an index of Contact objects
		gxtCache.addIndex(ContactsDMSAG.__Contact);
		
		// Indicate to the cache how to wrap objects form the Contacts schema
		gxtCache.addWrapperFactory(ContactsGxtWrapperFactory.instance());
		
		// SYNCHRONOUS
		
		// We've indicated that we both manage and instantiate the ContactListView, so
		// we instantiate it and pass ourselves in as the presenter
		view = getNewContactListView(this);
		
		view.displayFeedback("Waiting for comms session...");
	}
	
	public ContactListView getView(){
		return(view);
	}

	/**
	 * We receive this event when the CommsController has established full asynchronous
	 * communications with the server - we can now request the contacts.
	 */
	@Override
	protected void onCommsSessionReady() {
		view.displayFeedback("Retrieving contacts...");
		
		// The getGetContactRequest() is generated automatically in conjunction
		// with the following line on contacts.dmw:
		// sendsRequest			GetRequest getContact DMPERRORS EVENTS
		// This method makes use of the commsController to initialize the request
		// with information that allows the commsController to route responses
		// and, in this case, events back to this component.
		GetRequestDMO request = getGetContactRequest();
		request.setFilter(ContactsDMSAG.__Contact.name);
		sendGetContactRequest(request);
	}

	///////////////////////////////////////////////////////////////////////////
	// The following methods are generated as abstract methods in our base class,
	// they result from the following line on contacts.dmw:
	// sendsRequest			GetRequest getContact DMPERRORS EVENTS

	/**
	 * This is just the normal method that must be overloaded to handle successful
	 * responses to our GetRequest.
	 */
	@Override
	protected void handleGetContactResponse(GetResponseDMO response) {
		logger.log(Level.INFO, response.toOIF());

		if (response.getObjectListSize() > 0){
			Iterator<DmcObject> objList = response.getObjectList();
			while(objList.hasNext()){
				gxtCache.addObject(objList.next());
			}
		}
		
		if (response.isLastResponse()){
			logger.fine("Have the last response - populating the view");
			HashMap<DmcObjectName, GxtWrapper> contacts = gxtCache.getIndex(ContactsDMSAG.__Contact);
			view.displayContacts(contacts);
			view.displayFeedback("");
		}
	}

	/**
	 * This method must be overloaded because we specified that we wanted DMPERRORS.
	 */
	@Override
	protected void handleGetContactResponseError(GetResponseDMO response) {
		MessageBox.alert("Data retrieval error", "Contact information retrieval failed:\n" + response.getResponseText(), null);
	}

	/**
	 * This method must be overloaded because we specified that we wanted EVENTS.
	 */
	@Override
	protected void handleEventFromGetContact(DMPEventDMO event) {
		logger.fine("Received Contact event:\n" + event.toOIF());
		
		// When contacts are added, deleted or modified, we get events to indicate this.
		// Modification events are applied directly to our cached objects and will be
		// automatically reflected in objects that are displayed in things like grids.
		// This is facilitated by the base GxtWrapper class that makes use of Sencha's
		// GXT com.extjs.gxt.ui.client.data.Model mechanisms. 
		ContactGXT contact = (ContactGXT) gxtCache.handleEvent(event);
		
		if (contact == null){
			logger.severe("Cache was unable to process event properly:\n" + event.toOIF());
			return;
		}
		
		if (event.getEventTypeDMP() == DMPEventTypeEnum.CREATED){
			view.addContact(contact);
		}
		else if (event.getEventTypeDMP() == DMPEventTypeEnum.DELETED){
			view.deleteContact(contact);
		}
		
		// We don't have to do anything with MODIFIED events
	}
	
	///////////////////////////////////////////////////////////////////////////
	// The following method is implied by our base class' implementation of
	// the ContactListViewPresenterIF
	
	@Override
	public void onDeleteContactsEvent(List<ContactGXT> deletedContacts) {
		DeleteRequestDMO request = getDeleteContactRequest();

		for(ContactGXT contact: deletedContacts){
			request.addTargets(contact.getObjectName());
		}

		sendDeleteContactRequest(request);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// The following methods are generated as abstract methods in our base class,
	// they result from the following line on contacts.dmw:
	// sendsRequest			DeleteRequest deleteContact

	@Override
	protected void handleDeleteContactResponseError(DeleteResponseDMO response) {
		MessageBox.alert("Contact deletion failed ", "An error occurred while trying to delete a contact:\n" + response.getResponseText(), null);
	}

	@Override
	protected void handleDeleteContactResponse(DeleteResponseDMO response) {
		// We don't actually have to do anything with the response here.
		// When the contact is deleted on the server, we'll receive an
		// event that will be handled in handleEventFromGetContact().
	}

	@Override
	protected void onLogoutCompleteEvent() {
		// Wipe the data from the view
		view.resetToEmpty();
	}

	@Override
	protected void onAddContactCompleteEvent(DmcObjectName name) {
		ContactGXT contact = (ContactGXT) gxtCache.getObject(name);
		if (contact != null){
			view.displayFeedback(contact.getFirstName() + " " + contact.getLastName() + " has been added as a contact.");
		}
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void onEditContactCompleteEvent(DmcObjectName name) {
		ContactGXT contact = (ContactGXT) gxtCache.getObject(name);
		if (contact != null){
			view.displayFeedback(contact.getFirstName() + " " + contact.getLastName() + " has been updated.");
		}
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	public void exampleMethod(Date date) {
		// TODO Auto-generated method stub
		
	}

// Hiding the override so that we can split/unsplit the view for code generation testing purposes
//	@Override
	public void asyncContactListViewReady(ContactListView v) {
		view = v;
		view.displayFeedback("Waiting for comms session...");
	}

}
