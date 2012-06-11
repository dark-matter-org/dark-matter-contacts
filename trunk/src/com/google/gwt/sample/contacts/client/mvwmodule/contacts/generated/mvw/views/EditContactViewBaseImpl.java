package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:278)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;         // Required by EditContactCancelledEvent - (Event.java:190)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                                  // Required by ContactUpdatedEvent - (View.java:162)
import com.google.gwt.user.client.ui.IsWidget;                                                                          // Implements IsWidget - (View.java:168)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                              // Used by eventBus - (RunContextItem.java:335)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                            // Using run context items - (View.java:146)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:68)
abstract public class EditContactViewBaseImpl implements EditContactViewIF, IsWidget {

    protected EditContactViewPresenterIF presenter;

    protected final MvwEventBus eventBus;

    protected EditContactViewBaseImpl(EditContactViewPresenterIF p, MvwRunContextIF rc){
        presenter = p;

        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:157)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:332)
    protected void fireContactUpdatedEvent(ContactDMO modrec){
        presenter.onContactUpdatedEvent(modrec);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:157)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:332)
    protected void fireNewContactEvent(ContactDMO contact){
        presenter.onNewContactEvent(contact);
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:192)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewBroadcastOnlyMethod(Event.java:395)
    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

}

