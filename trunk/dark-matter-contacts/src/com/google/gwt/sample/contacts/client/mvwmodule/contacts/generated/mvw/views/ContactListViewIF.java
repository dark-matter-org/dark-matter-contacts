package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:247)
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;         // Required by DeleteContactsEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required by EditContactEvent
import java.util.HashMap;                                                      // View import
import java.util.List;                                                         // Required by DeleteContactsEvent
import org.dmd.dmc.DmcObjectName;                                              // View import
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                                  // View import

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:23)
public interface ContactListViewIF {

    public interface ContactListViewPresenterIF {

        public void onDeleteContactsEvent(List<ContactGXT> deletedContacts);

    }

    public void displayContacts(HashMap<DmcObjectName, GxtWrapper> contacts);

    public void deleteContact(ContactGXT contact);

    public void addContact(ContactGXT contact);

    public void resetToEmpty();

    public void contactsSelected(List<ContactGXT> contacts);

    public void displayFeedback(String info);

    public void displayError(String info);

}

