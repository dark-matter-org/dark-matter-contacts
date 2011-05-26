package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:61)
import com.google.web.bindery.event.shared.EventBus;                           // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                // Used by eventService
import org.dmd.dmp.client.DMPServiceAsync;                                     // Used by dmpConnection
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;         // Mvwcomms run context

public interface ContactAppRunContextIF extends MvwRunContextIF, MvwcommsRunContextIF {

    public DMPServiceAsync getDmpConnection();
    public EventBus getEventBus();
    public RemoteEventService getEventService();
}

