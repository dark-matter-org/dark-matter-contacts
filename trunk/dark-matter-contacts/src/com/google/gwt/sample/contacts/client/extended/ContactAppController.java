package com.google.gwt.sample.contacts.client.extended;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppRunContext;
import com.google.gwt.sample.contacts.client.generated.mvw.controllers.ContactAppControllerBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;

public class ContactAppController extends ContactAppControllerBaseImpl {

	public ContactAppController(ContactAppRunContext rc) {
		super(rc);
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

}
