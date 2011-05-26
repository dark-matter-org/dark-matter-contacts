package com.google.gwt.sample.contacts.client.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:31)
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEvent;                   // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEvent;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEvent;                  // Required by EditContactEvent
import com.google.web.bindery.event.shared.EventBus;                                                 // Used by eventBus
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                         // Mvw run context

public class ContactAppControllerBaseImpl {

    protected final EventBus eventBus;

    public ContactAppControllerBaseImpl(MvwRunContextIF rc){
        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

}

