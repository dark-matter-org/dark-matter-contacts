package com.google.gwt.sample.contacts.client.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:76)
import com.google.gwt.event.shared.EventBus;                                                                // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                         // Used by placeController
import com.google.gwt.sample.contacts.client.extended.presenters.ContactListPresenter;                      // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.generated.mvw.ContactsRunContextIF;                            // Contacts run context
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEvent;                          // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEventHandler;                   // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEvent;                // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEventHandler;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEvent;                         // Required by EditContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEventHandler;                  // Required by EditContactEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                      // Required type
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                // Mvw run context
import org.dmd.mvw.client.mvwcomms.CentralDMPErrorHandlerIF;                                                // Is the central DMP error handler
import org.dmd.mvw.client.mvwcomms.CentralRPCErrorHandlerIF;                                                // Is the central RPC error handler

abstract public class ContactAppControllerBaseImpl implements CentralDMPErrorHandlerIF, CentralRPCErrorHandlerIF {

    private ContactListPresenter ContactListPresenterRCI;
    protected final EventBus eventBus;
    protected final PlaceController placeController;

    MvwRunContextIF runcontext;

    public ContactAppControllerBaseImpl(MvwRunContextIF rc){
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;


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


    }

    public ContactListPresenter getContactListPresenterRCI(){
        if (ContactListPresenterRCI == null)
            ContactListPresenterRCI = ((ContactsRunContextIF)runcontext).getContactListPresenterRCI();
        return(ContactListPresenterRCI);
    }

    abstract protected void onAddContactEvent();

    abstract protected void onEditContactCancelledEvent();

    abstract protected void onEditContactEvent(ContactDMO Contact);

}

