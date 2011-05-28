package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:87)
import com.google.gwt.core.client.GWT;                                         // Used by dmpConnection
import com.google.web.bindery.event.shared.EventBus;                           // Used by eventBus
import com.google.web.bindery.event.shared.SimpleEventBus;                     // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                // Used by eventService
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;         // Used by eventService
import org.dmd.dmp.client.DMPService;                                          // Used by dmpConnection
import org.dmd.dmp.client.DMPServiceAsync;                                     // Used by dmpConnection
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;         // Mvwcomms run context

public class ContactAppRunContext implements MvwRunContextIF, MvwcommsRunContextIF {

    private final EventBus eventBus = new SimpleEventBus();
    private final DMPServiceAsync dmpConnection = (DMPServiceAsync) GWT.create(DMPService.class);
    private final RemoteEventService eventService = RemoteEventServiceFactory.getInstance().getRemoteEventService();
    private final CommsController commsController = new CommsController(this);

    public ContactAppRunContext(){

    }

    @Override
    public CommsController getCommsController(){
        return(commsController);
    }

    @Override
    public DMPServiceAsync getDmpConnection(){
        return(dmpConnection);
    }

    @Override
    public EventBus getEventBus(){
        return(eventBus);
    }

    @Override
    public RemoteEventService getEventService(){
        return(eventService);
    }

}

