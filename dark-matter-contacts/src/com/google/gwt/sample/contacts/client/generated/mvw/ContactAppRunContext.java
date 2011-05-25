package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:87)
import com.google.web.bindery.event.shared.EventBus;                 // Used by eventBus
import com.google.web.bindery.event.shared.SimpleEventBus;           // Used by eventBus
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;         // Mvw run context

public class ContactAppRunContext implements MvwRunContextIF {

    private final EventBus eventBus = new SimpleEventBus();

    public ContactAppRunContext(){

    }

    @Override
    public EventBus getEventBus(){
        return(eventBus);
    }

}

