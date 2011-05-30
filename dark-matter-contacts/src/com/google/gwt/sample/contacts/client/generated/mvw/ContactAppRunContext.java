package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:87)
import com.google.gwt.core.client.GWT;                                         // Used by dmpConnection
import com.google.gwt.place.shared.PlaceController;                            // Used by placeController
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

    private final EventBus eventBus;
    private final DMPServiceAsync dmpConnection;
    private final PlaceController placeController;
    private final RemoteEventService eventService;
    private final CommsController commsController;

    public ContactAppRunContext(){

        eventBus = new SimpleEventBus();
        dmpConnection = (DMPServiceAsync) GWT.create(DMPService.class);
        placeController = new PlaceController((com.google.gwt.event.shared.EventBus) eventBus);
        eventService = RemoteEventServiceFactory.getInstance().getRemoteEventService();
        commsController = new CommsController(this);
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

    @Override
    public PlaceController getPlaceController(){
        return(placeController);
    }

}

