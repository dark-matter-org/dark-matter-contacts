package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:210)
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;         // View import
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required by EditContactEvent
import java.util.List;                                                         // View import

public interface ContactListView {

    public interface ContactListViewPresenter {

        public void onDeleteContactsEvent(List<ContactDMO> deletedContacts);

    }

    public void setPresenter(ContactListViewPresenter presenter);

    public void displayContacts(List<ContactGXT> contacts);

    public void deleteContact(ContactGXT contact);

    public void addContact(ContactGXT contact);

    public void updateContact(ContactGXT contact);

    public void displayFeedback(String info);

    public void displayError(String info);

}

