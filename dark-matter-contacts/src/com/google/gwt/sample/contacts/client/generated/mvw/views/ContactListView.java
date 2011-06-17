package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:372)
import com.google.gwt.sample.contacts.client.generated.dmw.ContactDMW;         // View import
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required by EditContactEvent
import java.util.List;                                                         // View import

public interface ContactListView {

    public interface ContactListViewPresenter {

        public void onDeleteContactsEvent(List<ContactDMO> deletedContacts);

    }

    public void setPresenter(ContactListViewPresenter presenter);

    public void displayContacts(List<ContactDMW> contacts);

    public void deleteContact(ContactDMW contact);

    public void addContact(ContactDMW contact);

    public void updateContact(ContactDMW contact);

}

