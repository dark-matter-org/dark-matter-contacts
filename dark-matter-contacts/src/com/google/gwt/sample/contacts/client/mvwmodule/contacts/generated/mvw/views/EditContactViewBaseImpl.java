package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:254)
import com.google.gwt.event.shared.EventBus;                                                                            // Used by eventBus - RunContextItem.java:316
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;         // Required by EditContactCancelledEvent - Event.java:175
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                                  // Required by ContactUpdatedEvent - View.java:138
import com.google.gwt.user.client.ui.IsWidget;                                                                          // Implements IsWidget - View.java:144
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                            // Using run context items - View.java:122

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:53)
abstract public class EditContactViewBaseImpl implements EditContactViewIF, IsWidget {

    protected EditContactViewPresenterIF presenter;

    protected final EventBus eventBus;

    protected EditContactViewBaseImpl(EditContactViewPresenterIF p, MvwRunContextIF rc){
        presenter = p;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:133)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:317)
    protected void fireContactUpdatedEvent(ContactDMO modrec){
        presenter.onContactUpdatedEvent(modrec);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:133)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:317)
    protected void fireNewContactEvent(ContactDMO contact){
        presenter.onNewContactEvent(contact);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:168)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:380)
    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

}

