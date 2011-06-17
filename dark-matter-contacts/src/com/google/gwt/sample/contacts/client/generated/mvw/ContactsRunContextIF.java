package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:33)
import com.google.gwt.sample.contacts.client.extended.ContactAppController;                             // Used by ContactAppControllerRCI
import com.google.gwt.sample.contacts.client.extended.presenters.ContactListPresenter;                  // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.extended.views.ContactListView;                            // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.extended.views.EditContactView;                            // Used by EditContactViewRCI
import com.google.gwt.sample.contacts.client.extended.views.LoginView;                                  // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.generated.mvw.places.ContactAppPlaceHistoryMapper;         // Used by historyMapper


public interface ContactsRunContextIF {

    public LoginView getLoginViewRCI(LoginView.LoginViewPresenter presenter);
    public ContactListView getContactListViewRCI(ContactListView.ContactListViewPresenter presenter);
    public ContactListPresenter getContactListPresenterRCI();
    public EditContactView getEditContactViewRCI(EditContactView.EditContactViewPresenter presenter);
    public ContactAppController getContactAppControllerRCI();
    public ContactAppPlaceHistoryMapper getHistoryMapper();
}

