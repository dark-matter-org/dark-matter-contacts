package com.google.gwt.sample.contacts.client.extended.presenters;

import java.util.List;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.sample.contacts.client.generated.mvw.presenters.ContactListPresenterBaseImpl;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;

public class ContactListPresenter extends ContactListPresenterBaseImpl {

	public ContactListPresenter(MvwRunContextIF rc) {
		super(rc);
	}

	@Override
	public void onDeleteContactsEvent(List<ContactDMO> deletedContacts) {
		// TODO Auto-generated method stub

	}

}
