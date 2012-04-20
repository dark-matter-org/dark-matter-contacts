package com.google.gwt.sample.contacts.client.extended;

import java.util.TreeMap;

import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.types.ClassFilter;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

import com.google.gwt.sample.contacts.client.extended.activities.ListContactsActivity;
import com.google.gwt.sample.contacts.client.extended.presenters.ContactListPresenter;
import com.google.gwt.sample.contacts.client.extended.views.ContactListView;
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;
import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppRunContext;
import com.google.gwt.sample.contacts.client.generated.mvw.controllers.ContactAppControllerBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;

public class ContactAppController extends ContactAppControllerBaseImpl {
	
	// The collection of contacts being managed
	TreeMap<DmcObjectName,ContactGXT>	contacts;
	boolean								haveContacts;
	
	ContactListPresenter				contactsPresenter;
	ContactListView						contactsView;
	

	public ContactAppController(ContactAppRunContext rc) {
		super(rc);
		
		contacts 		= new TreeMap<DmcObjectName, ContactGXT>();
		
		// JUST TEMPORARY
		haveContacts 	= true;
		
		contactsPresenter = getNewContactListPresenter();
		contactsView = getNewContactListView(contactsPresenter);
		
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
		if (!haveContacts){
			contactsView.displayFeedback("Retrieving contacts...");
			GetRequestDMO request = getGetContactRequest();
			request.setClassFilter(new ClassFilter(ContactsDMSAG.__Contact));
			sendGetContactRequest(request);
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
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRPCFailure(Throwable caught, RequestDMO request) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void handleDeleteContactResponse(DeleteResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleGetContactResponse(GetResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleGetContactResponseError(GetResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleResponse(ResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleEventFromGetContact(DMPEventDMO event) {
		// TODO Auto-generated method stub
		
	}

}
