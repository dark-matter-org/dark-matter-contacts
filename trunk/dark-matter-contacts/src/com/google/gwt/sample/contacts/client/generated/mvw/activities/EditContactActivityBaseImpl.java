package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:70)
import com.google.gwt.activity.shared.AbstractActivity;                        // Is abstract activity
import com.google.web.bindery.event.shared.EventBus;                           // Used by eventBus
import org.dmd.dmp.client.ResponseHandlerIF;                                   // DMP communications
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                         // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                        // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                            // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                           // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                    // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;         // Mvwcomms run context

abstract public class EditContactActivityBaseImpl extends AbstractActivity implements ResponseHandlerIF{

    protected final CommsController commsController;
    protected final EventBus eventBus;

}

