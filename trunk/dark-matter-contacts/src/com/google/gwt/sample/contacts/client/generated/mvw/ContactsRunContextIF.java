package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:37)
import com.google.gwt.sample.contacts.client.extended.ContactAppController;                             // Used by ContactAppControllerRCI
import com.google.gwt.sample.contacts.client.extended.edit.EditContactView;                             // Used by EditContactViewRCI
import com.google.gwt.sample.contacts.client.extended.listing.ContactListPresenter;                     // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.extended.listing.ContactListView;                          // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.extended.login.LoginView;                                  // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.generated.mvw.places.ContactAppPlaceHistoryMapper;         // Used by historyMapper
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListViewIF;                     // The ContactListView
import com.google.gwt.sample.contacts.client.generated.mvw.views.EditContactViewIF;                     // The EditContactView
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginViewIF;                           // The LoginView
import com.google.gwt.sample.contacts.client.resources.Images;                                          // Used by images


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:40)
public interface ContactsRunContextIF {

    public Images                       getImages();
    public LoginView                    getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter);
    public ContactListView              getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);
    public ContactListPresenter         getContactListPresenterRCI();
    public EditContactView              getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter);
    public ContactAppController         getContactAppControllerRCI();
    public ContactAppPlaceHistoryMapper getHistoryMapper();
}

