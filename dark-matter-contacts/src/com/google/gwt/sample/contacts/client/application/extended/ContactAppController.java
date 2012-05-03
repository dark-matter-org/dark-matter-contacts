package com.google.gwt.sample.contacts.client.application.extended;

import java.util.logging.Logger;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;

import com.extjs.gxt.ui.client.widget.MessageBox;
import com.google.gwt.sample.contacts.client.application.generated.mvw.ContactAppRunContext;
import com.google.gwt.sample.contacts.client.application.generated.mvw.controllers.ContactAppControllerBaseImpl;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.EditPlace;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;

public class ContactAppController extends ContactAppControllerBaseImpl {
	
	Logger logger = Logger.getLogger("dmcontacts");

	public ContactAppController(ContactAppRunContext rc) {
		super(rc);
				
		// For the purposes of this example, we turn on message tracking throughout the system.
		// All messages that are sent will be tracked via logging messages
		commsController.setGlobalMessageTracking(true);
	}
	
	@Override
	protected void onAddContactEvent() {
		placeController.goTo(new EditPlace(""));
	}

	@Override
	protected void onEditContactCancelledEvent() {
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void onEditContactEvent(ContactDMO contact) {
		placeController.goTo(new EditPlace(contact.getObjectName().getNameString()));
	}

	@Override
	protected void onLoginCompleteEvent() {
		placeController.goTo(new ListContactsPlace(""));
	}
		
	@Override
	public void handleRPCFailureCentrally(Throwable caught, RequestDMO request) {
		MessageBox.alert("GWT RPC Error","A GWT RPC error has occurred while handling this request: " + request.toOIF(), null);
		placeController.goTo(new LoginPlace(""));
	}


}
