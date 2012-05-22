package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:254)
import com.google.gwt.event.shared.EventBus;                                                                   // Used by eventBus - RunContextItem.java:316
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;                                         // Required by DeleteContactsEvent - View.java:138
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;            // Contacts run context - RunContextItem.java:306
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEvent;          // Required by AddContactEvent - Event.java:175
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEvent;         // Required by EditContactEvent - Event.java:175
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.resources.Images;                              // Used by images - RunContextItem.java:316
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                         // Required type
import com.google.gwt.user.client.ui.IsWidget;                                                                 // Implements IsWidget - View.java:144
import java.util.HashMap;                                                                                      // View import - View.java:180
import java.util.List;                                                                                         // Required by DeleteContactsEvent - View.java:138
import org.dmd.dmc.DmcObjectName;                                                                              // View import - View.java:180
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                                                                  // View import - View.java:180
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                   // Using run context items - View.java:122
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEvent;                                           // Required by LogoutEvent - Event.java:175

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:53)
abstract public class ContactListViewBaseImpl implements ContactListViewIF, IsWidget {

    protected ContactListViewPresenterIF presenter;

    protected final EventBus eventBus;
    protected final Images images;

    protected ContactListViewBaseImpl(ContactListViewPresenterIF p, MvwRunContextIF rc){
        presenter = p;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
        images = ((ContactsRunContextIF)rc).getImages();
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:133)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:317)
    protected void fireDeleteContactsEvent(List<ContactGXT> deletedContacts){
        presenter.onDeleteContactsEvent(deletedContacts);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:168)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:380)
    protected void fireAddContactEvent(){
        eventBus.fireEvent(new AddContactEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:168)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:380)
    protected void fireEditContactEvent(ContactDMO contact){
        eventBus.fireEvent(new EditContactEvent(contact));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:168)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:380)
    protected void fireLogoutEvent(){
        eventBus.fireEvent(new LogoutEvent());
    }

}

