package com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit;

import java.util.logging.Logger;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.UUIDName;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.extjs.gxt.ui.client.widget.MessageBox;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities.EditContactActivityBaseImpl;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.EditPlace;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class EditContactActivity extends EditContactActivityBaseImpl {
	
	AcceptsOneWidget	panel;
	EditContactView		view;

	public EditContactActivity(MvwRunContextIF rc) {
		super(rc);
	}

	@Override
	public void start(AcceptsOneWidget p, EventBus eventBus) {
		if (commsController.isLoggedIn()){
			Logger logger = Logger.getLogger("EditContactActivity");
			EditPlace place = (EditPlace) placeController.getWhere();
			logger.info("EditPlace token: " + place.getToken());
			
			// Hang on to the panel
			panel = p;
			
			// Asynchronously instantiate the view - we'll be called back at asyncEditContactViewReady()
			getEditContactViewAsync();
			
//			// Instantiate the view
//			view = getNewEditContactView(this);
//			panel.setWidget(view);
//
//			if (place.getToken().length() > 0){
//				// We have a contact key UUID, retrieve the details
//				GetRequestDMO request = getGetContactRequest();
//				try {
//					request.addTargets(new UUIDName(place.getToken()));
//				} catch (DmcValueException e) {
//					MessageBox.alert("Internal error", "Couldn't construct name for contact retrieval:\n" + e.toString(), null);
//					placeController.goTo(new ListContactsPlace(""));
//				}
//				
//				sendGetContactRequest(request);
//			}
//			else{
//				// We construct a new contact to edit
//				view.setContact(new ContactDMO());
//			}
		}
		else{
			// We're not logged in, goto login
			placeController.goTo(new LoginPlace(""));
		}

	}
	
	///////////////////////////////////////////////////////////////////////////

	@Override
	public void asyncEditContactViewReady(EditContactView v) {
		view = v;
		panel.setWidget(view);

		EditPlace place = (EditPlace) placeController.getWhere();
		if (place.getToken().length() > 0){
			// We have a contact key UUID, retrieve the details
			GetRequestDMO request = getGetContactRequest();
			try {
				request.addTargets(new UUIDName(place.getToken()));
			} catch (DmcValueException e) {
				MessageBox.alert("Internal error", "Couldn't construct name for contact retrieval:\n" + e.toString(), null);
				placeController.goTo(new ListContactsPlace(""));
			}
			
			sendGetContactRequest(request);
		}
		else{
			// We construct a new contact to edit
			view.setContact(new ContactDMO());
		}
	}

	///////////////////////////////////////////////////////////////////////////
	
	@Override
	protected void handleGetContactResponseError(GetResponseDMO response) {
		MessageBox.alert("Error", "Couldn't retrieve contact:\n" + response.getResponseText(), null);
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void handleGetContactResponse(GetResponseDMO response) {
		if (response.isLastResponse()){
			ContactDMO contact = (ContactDMO) response.getNthObjectList(0);
			view.setContact(contact);
		}
	}

	///////////////////////////////////////////////////////////////////////////

	@Override
	public void onNewContactEvent(ContactDMO contact) {
		CreateRequestDMO request = getCreateContactRequest(contact);
		sendCreateContactRequest(request);
	}

	@Override
	protected void handleCreateContactResponseError(CreateResponseDMO response) {
		MessageBox.alert("Contact creation failed ", "An error occurred while trying to create a contact:\n" + response.getResponseText(), null);
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void handleCreateContactResponse(CreateResponseDMO response) {
		// The first response we receive will probably be the acknowledgement
		// reponse which has lastResponse = false. We don't really do anything
		// with that response. However, the last response will have the newly
		// created contact in it.
		if (response.isLastResponse()){
			ContactDMO contact = (ContactDMO) response.getNthObjectList(0);
			fireAddContactCompleteEvent(contact.getObjectName());
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////

	@Override
	public void onContactUpdatedEvent(ContactDMO modrec) {
		SetRequestDMO request = getSetContactRequest(modrec);
		sendSetContactRequest(request);
	}

	@Override
	protected void handleSetContactResponseError(SetResponseDMO response) {
		MessageBox.alert("Contact modification failed ", "An error occurred while trying to modify a contact:\n" + response.getResponseText(), null);
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void handleSetContactResponse(SetResponseDMO response) {
		// We don't actually need to do anything with the response, since
		// the ContactListPresenter will receive the modification event
		// and update the contact accordingly. We just fire the completion event.
		fireEditContactCompleteEvent(response.getTarget().getName());
	}
	
	///////////////////////////////////////////////////////////////////////////

	@Override
	public void cancelEdit() {
		fireEditContactCancelledEvent();
	}
	

}
