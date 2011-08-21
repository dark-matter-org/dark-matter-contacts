package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:233)
import com.google.gwt.event.shared.EventBus;                                                // Used by eventBus
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;                      // View import
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEvent;          // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEvent;         // Required by EditContactEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                      // Required by DeleteContactsEvent
import com.google.gwt.user.client.ui.IsWidget;                                              // Implements IsWidget
import java.util.List;                                                                      // Required by DeleteContactsEvent
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                // Using run context items

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:53)
abstract public class ContactListViewBaseImpl implements ContactListView, IsWidget {

    protected ContactListViewPresenter presenter;

    protected final EventBus eventBus;

    protected ContactListViewBaseImpl(MvwRunContextIF rc){
        presenter = null;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    public void setPresenter(ContactListViewPresenter p){
        presenter = p;
    }
    
    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:112)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:244)
    protected void fireDeleteContactsEvent(List<ContactDMO> deletedContacts){
        presenter.onDeleteContactsEvent(deletedContacts);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:147)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:307)
    protected void fireAddContactEvent(){
        eventBus.fireEvent(new AddContactEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:147)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:307)
    protected void fireEditContactEvent(ContactDMO contact){
        eventBus.fireEvent(new EditContactEvent(contact));
    }

}

