package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:238)
import com.google.gwt.event.shared.EventBus;                                                         // Used by eventBus
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEvent;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                               // Required by ContactUpdatedEvent
import com.google.gwt.user.client.ui.IsWidget;                                                       // Implements IsWidget
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                         // Using run context items

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:53)
abstract public class EditContactViewBaseImpl implements EditContactViewIF, IsWidget {

    protected EditContactViewPresenterIF presenter;

    protected final EventBus eventBus;

    protected EditContactViewBaseImpl(EditContactViewPresenterIF p, MvwRunContextIF rc){
        presenter = p;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:117)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:244)
    protected void fireContactUpdatedEvent(ContactDMO updatedContact){
        presenter.onContactUpdatedEvent(updatedContact);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:152)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:307)
    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

}

