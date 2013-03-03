package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:301)
import com.google.gwt.user.client.ui.IsWidget;                                                            // Implements IsWidget - (View.java:191)
import java.util.List;                                                                                    // Required by DeleteContactsEvent - (View.java:185)
import org.dmd.examples.contacts.client.generated.gxt.ContactGXT;                                         // Required by DeleteContactsEvent - (View.java:185)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;            // Contacts run context - (RunContextItem.java:405)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEvent;          // Required by AddContactEvent - (Event.java:190)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEvent;         // Required by EditContactEvent - (Event.java:190)
import org.dmd.examples.contacts.client.mvwmodule.contacts.resources.Images;                              // Used by images - (RunContextItem.java:428)
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;                                         // Required type - (Event.java:67)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                // Used by eventBus - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                              // Using run context items - (View.java:169)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEvent;                                      // Required by LogoutEvent - (Event.java:190)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:67)
abstract public class ContactListViewBaseImpl implements ContactListViewIF, IsWidget {

    protected ContactListViewPresenterIF presenter;

    protected final MvwEventBus eventBus;
    protected final Images images;

    protected ContactListViewBaseImpl(ContactListViewPresenterIF p, MvwRunContextIF rc){
        presenter = p;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
        images = ((ContactsRunContextIF)rc).getImages();
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:180)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:332)
    protected void fireDeleteContactsEvent(List<ContactGXT> deletedContacts){
        presenter.onDeleteContactsEvent(deletedContacts);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:215)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:395)
    protected void fireAddContactEvent(){
        eventBus.fireEvent(new AddContactEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:215)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:395)
    protected void fireEditContactEvent(ContactDMO contact){
        eventBus.fireEvent(new EditContactEvent(contact));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:215)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:395)
    protected void fireLogoutEvent(){
        eventBus.fireEvent(new LogoutEvent());
    }

}

