package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:227)
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;         // View import
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required by DeleteContactsEvent
import java.util.List;                                                         // Required by DeleteContactsEvent

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:23)
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

