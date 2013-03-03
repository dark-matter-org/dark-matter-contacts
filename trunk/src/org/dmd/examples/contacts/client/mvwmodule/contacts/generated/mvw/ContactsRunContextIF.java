package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:52)
import org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                             // Used by ContactListViewRCI - (RunContextItem.java:371)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;         // Asynchronous creation of ContactListPresenter - (RunContextItem.java:376)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                        // The ContactListView - (RunContextItem.java:366)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewAsyncIF;                   // Asynchronous creation of EditContactView - (RunContextItem.java:369)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                        // The EditContactView - (RunContextItem.java:366)
import org.dmd.examples.contacts.client.mvwmodule.contacts.resources.Images;                                             // Used by images - (RunContextItem.java:382)


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:55)
public interface ContactsRunContextIF {

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public Images                  getImages();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:200)
    public ContactListView         getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:207)
    public void                    getContactListPresenterRCI(ContactListPresenterAsyncIF requester);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:196)
    public void                    getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter, EditContactViewAsyncIF requester);

}

