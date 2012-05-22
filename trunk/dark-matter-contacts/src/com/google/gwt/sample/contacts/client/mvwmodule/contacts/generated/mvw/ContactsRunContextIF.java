package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:37)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                                // Used by EditContactViewRCI - RunContextItem.java:281
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListPresenter;                        // Used by ContactListPresenterRCI - RunContextItem.java:281
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                             // Used by ContactListViewRCI - RunContextItem.java:281
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;         // Asynchronous creation of ContactListPresenter - RunContextItem.java:286
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                        // The ContactListView - RunContextItem.java:283
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                        // The EditContactView - RunContextItem.java:283
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.resources.Images;                                             // Used by images - RunContextItem.java:281


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:40)
public interface ContactsRunContextIF {

    public Images                  getImages();
    public ContactListView         getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);
    public void                   getContactListPresenterRCI(ContactListPresenterAsyncIF requester);
    public EditContactView         getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter);
}

