package com.google.gwt.sample.contacts.client.extended.activities;

import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.sample.contacts.client.generated.mvw.activities.EditContactActivityBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class EditContactActivity extends EditContactActivityBaseImpl {

	public EditContactActivity(MvwRunContextIF rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleContactResponse(GetResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleContactResponse(SetResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onContactUpdatedEvent(ContactDMO updatedContact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		// TODO Auto-generated method stub
		
	}


}