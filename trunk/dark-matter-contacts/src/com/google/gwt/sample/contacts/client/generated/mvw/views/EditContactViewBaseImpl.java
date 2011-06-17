package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:216)
import com.google.gwt.event.shared.EventBus;                                                                // Used by eventBus
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEvent;                // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEventHandler;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                      // View import
import com.google.gwt.user.client.ui.IsWidget;                                                              // Implements IsWidget
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                // Mvw run context

abstract public class EditContactViewBaseImpl implements EditContactView, IsWidget {

    EditContactViewPresenter presenter;

    protected final EventBus eventBus;

    protected EditContactViewBaseImpl(MvwRunContextIF rc){
        presenter = null;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    public void setPresenter(EditContactViewPresenter p){
        presenter = p;
    }
    
    protected void fireContactUpdatedEvent(ContactDMO updatedContact){
        presenter.onContactUpdatedEvent(updatedContact);
    }

    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

}

