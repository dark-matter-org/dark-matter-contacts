package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:61)
import com.google.gwt.place.shared.PlaceController;                            // Used by placeController
import com.google.web.bindery.event.shared.EventBus;                           // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                // Used by eventService
import org.dmd.dmp.client.DMPServiceAsync;                                     // Used by dmpConnection
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;         // Mvwcomms run context

public interface ContactAppRunContextIF extends MvwRunContextIF, MvwcommsRunContextIF {

    public CommsController getCommsController();
    public DMPServiceAsync getDmpConnection();
    public EventBus getEventBus();
    public RemoteEventService getEventService();
    public PlaceController getPlaceController();
}
