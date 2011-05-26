package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:374)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // View import
import java.util.List;                                                         // View import

public interface ContactListView {

    public interface ContactListViewPresenter {

        public void onDeleteContactsEvent(List<ContactDMO> deletedContacts);

    }

    public void setPresenter(ContactListViewPresenter presenter);

    public void displayContacts(List<ContactDMO> contacts);

    public void deleteContact(ContactDMO contact);

    public void addContact(ContactDMO contact);

    public void updateContact(ContactDMO contact);

}

