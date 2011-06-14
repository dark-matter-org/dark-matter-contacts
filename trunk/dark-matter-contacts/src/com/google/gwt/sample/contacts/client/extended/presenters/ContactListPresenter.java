package com.google.gwt.sample.contacts.client.extended.presenters;

import java.util.List;

import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.sample.contacts.client.generated.mvw.presenters.ContactListPresenterBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;

public class ContactListPresenter extends ContactListPresenterBaseImpl {

	public ContactListPresenter(MvwRunContextIF rc) {
		super(rc);
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
	protected void handleGetContactResponseRPCError(Throwable caught,
			GetRequestDMO request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDeleteContactsEvent(List<ContactDMO> deletedContacts) {
		// TODO Auto-generated method stub

	}

}
