package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:381)
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEvent;                 // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEventHandler;          // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEvent;                // Required by EditContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEventHandler;         // Required by EditContactEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                             // View import
import com.google.web.bindery.event.shared.EventBus;                                               // Used by eventBus
import java.util.List;                                                                             // View import
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                       // Mvw run context

abstract public class ContactListViewBaseImpl implements ContactListView {

    ContactListViewPresenter presenter;

    protected final EventBus eventBus;

    protected ContactListViewBaseImpl(MvwRunContextIF rc){
        presenter = null;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    public void setPresenter(ContactListViewPresenter p){
        presenter = p;
    }
    
    protected void fireDeleteContactsEvent(List<ContactDMO> deletedContacts){
        presenter.onDeleteContactsEvent(deletedContacts);
    }

    protected void fireAddContactEvent(){
        eventBus.fireEvent(new AddContactEvent());
    }

    protected void fireEditContactEvent(ContactDMO contact){
        eventBus.fireEvent(new EditContactEvent(contact));
    }

}
