package com.google.gwt.sample.contacts.client.application.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:134)
import com.google.gwt.event.shared.EventBus;                                                                                   // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                                            // Used by placeController
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEvent;                          // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEventHandler;                   // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;                // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEventHandler;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEvent;                         // Required by EditContactEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEventHandler;                  // Required by EditContactEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                                         // Required type
import org.dmd.dmp.client.CentralRPCErrorHandlerIF;                                                                            // Is the central RPC error handler
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                         // Mvwcomms run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;                                                    // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEventHandler;                                             // Required by LoginCompleteEvent

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:24)
abstract public class ContactAppControllerBaseImpl implements CentralRPCErrorHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;
    protected final PlaceController placeController;

    public ContactAppControllerBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        placeController = ((MvwRunContextIF)rc).getPlaceController();


        eventBus.addHandler(AddContactEvent.TYPE,
            new AddContactEventHandler() {
                public void handleAddContactEvent(AddContactEvent event) {
                    onAddContactEvent();
                }
            });

        eventBus.addHandler(EditContactCancelledEvent.TYPE,
            new EditContactCancelledEventHandler() {
                public void handleEditContactCancelledEvent(EditContactCancelledEvent event) {
                    onEditContactCancelledEvent();
                }
            });

        eventBus.addHandler(EditContactEvent.TYPE,
            new EditContactEventHandler() {
                public void handleEditContactEvent(EditContactEvent event) {
                    onEditContactEvent(event.getContact());
                }
            });

        eventBus.addHandler(LoginCompleteEvent.TYPE,
            new LoginCompleteEventHandler() {
                public void handleLoginCompleteEvent(LoginCompleteEvent event) {
                    onLoginCompleteEvent();
                }
            });


    }

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onAddContactEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactCancelledEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactEvent(ContactDMO contact);

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onLoginCompleteEvent();

}

