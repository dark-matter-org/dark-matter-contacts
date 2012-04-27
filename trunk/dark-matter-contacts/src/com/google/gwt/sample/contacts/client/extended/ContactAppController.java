package com.google.gwt.sample.contacts.client.extended;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.mvw.client.gxt.cache.GxtCache;
import org.dmd.mvw.client.gxt.cache.GxtCacheIndexListenerIF;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

import com.google.gwt.sample.contacts.client.extended.listing.ContactListPresenter;
import com.google.gwt.sample.contacts.client.extended.listing.ContactListView;
import com.google.gwt.sample.contacts.client.extended.listing.ListContactsActivity;
import com.google.gwt.sample.contacts.client.generated.ContactsGxtWrapperFactory;
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;
import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppRunContext;
import com.google.gwt.sample.contacts.client.generated.mvw.controllers.ContactAppControllerBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;
import com.google.gwt.user.client.Timer;

public class ContactAppController extends ContactAppControllerBaseImpl implements GxtCacheIndexListenerIF {
	
	// The collection of contacts being managed
	GxtCache							cache;
	boolean								haveContacts;
	
	ContactListPresenter				contactsPresenter;
	ContactListView						contactsView;
	
	Logger logger = Logger.getLogger("dmcontacts");

	public ContactAppController(ContactAppRunContext rc) {
		super(rc);
		
		cache		= new GxtCache();
		cache.addIndex(ContactsDMSAG.__Contact);
		cache.addWrapperFactory(ContactsGxtWrapperFactory.instance());
		
		// JUST TEMPORARY
		haveContacts 	= false;
		
//		contactsPresenter = getNewContactListPresenter();
//		contactsView = getNewContactListView(contactsPresenter);
		
		// For the purposes of this example, we turn on message tracking throughout the system.
		// All messages that are sent will be tracked via logging messages
		commsController.setGlobalMessageTracking(true);
	}
	
	/**
	 * When the ListContactsActivity is started, it asks us for the contacts view. If we
	 * haven't yet retrieved it, we return null and tell the activity when the view is ready.
	 * @param activty
	 * @return
	 */
	public ContactListView getContactsListView(ListContactsActivity activty){
//		if (!haveContacts){
//			contactsView.displayFeedback("Retrieving contacts...");
//			GetRequestDMO request = getGetContactRequest();
//			request.setClassFilter(new ClassFilter(ContactsDMSAG.__Contact));
//			sendGetContactRequest(request);
//		}
		
		if (contactsView == null){
			contactsPresenter = getNewContactListPresenter();
			contactsView = getNewContactListView(contactsPresenter);
		}
		
		return(contactsView);
	}

	@Override
	protected void onAddContactEvent() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onEditContactCancelledEvent() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onEditContactEvent(ContactDMO Contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleDMPError(ResponseDMO response) {
		System.out.println("DMP error");

	}

//	@Override
//	public void handleRPCFailure(Throwable caught, RequestDMO request) {
//		System.out.println("RPC error");
//		caught.printStackTrace(System.out);
//	}

	@Override
	protected void handleDeleteContactResponse(DeleteResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleGetContactResponse(GetResponseDMO response) {
		logger.log(Level.INFO, response.toOIF());
		
		if (response.getObjectListSize() > 0){
			Iterator<DmcObject> objList = response.getObjectList();
			while(objList.hasNext()){
				cache.addObject(objList.next());
			}
		}
		
		if (response.isLastResponse()){
			logger.fine("Have the last response - populating the view");
			
			HashMap<DmcObjectName, GxtWrapper> contacts = cache.addIndexListener(ContactsDMSAG.__Contact, this);
			contactsView.displayContacts(contacts);
			contactsView.displayFeedback("");
		}
	}

	@Override
	protected void handleGetContactResponseError(GetResponseDMO response) {
		// TODO Auto-generated method stub
		System.out.println(response.toOIF());
		
	}

//	@Override
//	public void handleResponse(ResponseDMO response) {
//		logger.log(Level.INFO, response.toOIF());
//		
//	}

	@Override
	protected void handleEventFromGetContact(DMPEventDMO event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLoginCompleteEvent() {
		Timer timer;
		
		timer = new Timer(){

			@Override
			public void run() {
				logger.log(Level.INFO,"Timer triggered...");
				retrieveContacts();
			}
			
		};
		
		timer.schedule(1000);
		
//		contactsView.displayFeedback("Retrieving contacts...");
//		GetRequestDMO request = getGetContactRequest();
//		request.setFilter(ContactsDMSAG.__Contact.name);
////		request.setClassFilter(new ClassFilter(ContactsDMSAG.__Contact));
//		sendGetContactRequest(request);
	}
	
	void retrieveContacts(){
		contactsView.displayFeedback("Retrieving contacts...");
		GetRequestDMO request = getGetContactRequest();
		request.setFilter(ContactsDMSAG.__Contact.name);
//		request.setClassFilter(new ClassFilter(ContactsDMSAG.__Contact));
		sendGetContactRequest(request);
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// GxtCacheIndexListenerIF implementation

	@Override
	public void objectAdded(DmcClassInfo index, GxtWrapper object, DMPEventDMO event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectDeleted(DmcClassInfo index, GxtWrapper object, DMPEventDMO event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectModified(DmcClassInfo index, GxtWrapper object, DMPEventDMO event) {
		// TODO Auto-generated method stub
		
	}

}
