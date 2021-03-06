package org.dmd.examples.contacts.client.application.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:157)
import org.dmd.dmp.client.CentralRPCErrorHandlerIF;                                                                       // Is the central RPC error handler - (Controller.java:108)
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                               // DMP communications - (Component.java:393)
import org.dmd.dmp.client.ResponseHandlerIF;                                                                              // DMP communications - (Component.java:392)
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;                                                                 // Component sends LogoutRequests - (Component.java:257)
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;                                                                // Component receives LogoutResponses - (Component.java:258)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                       // DMP communications - (Component.java:394)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                      // DMP communications - (Component.java:395)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                               // DMP communications - (Component.java:396)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEvent;                          // Required by AddContactEvent - (Event.java:205)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactEventHandler;                   // Required by AddContactEvent - (Event.java:206)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;                // Required by EditContactCancelledEvent - (Event.java:205)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEventHandler;         // Required by EditContactCancelledEvent - (Event.java:206)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEvent;                         // Required by EditContactEvent - (Event.java:205)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactEventHandler;                  // Required by EditContactEvent - (Event.java:206)
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;                                                         // Required type - (Event.java:67)
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                             // Used by gxtCache - (RunContextItem.java:428)
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                              // Gxt run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;                                                                     // Is the central async code error handler - (Controller.java:111)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                    // Used by placeController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                // Used by eventBus - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                              // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                              // Used by commsController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                    // Mvwcomms run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.ForceCommsReset;                                                  // Required by ForceCommsReset - (Event.java:198)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;                                               // Required by LoginCompleteEvent - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEventHandler;                                        // Required by LoginCompleteEvent - (Event.java:206)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEvent;                                              // Required by LogoutCompleteEvent - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEventHandler;                                       // Required by LogoutCompleteEvent - (Event.java:206)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEvent;                                                      // Required by LogoutEvent - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEventHandler;                                               // Required by LogoutEvent - (Event.java:206)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:39)
abstract public class ContactAppControllerBaseImpl implements ResponseHandlerIF, CentralRPCErrorHandlerIF, MvwAsyncErrorHandlerIF {

    protected final CommsController commsController;
    protected final MvwEventBus eventBus;
    protected final GxtCache gxtCache;
    protected final MvwAsyncPlaceController placeController;

    private final int LOGOUTLOGOUTCALLBACK = 0;

    public ContactAppControllerBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        gxtCache = ((GxtRunContextIF)rc).getGxtCache();
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

        eventBus.addHandler(LogoutCompleteEvent.TYPE,
            new LogoutCompleteEventHandler() {
                public void handleLogoutCompleteEvent(LogoutCompleteEvent event) {
                    onLogoutCompleteEvent();
                }
            });

        eventBus.addHandler(LogoutEvent.TYPE,
            new LogoutEventHandler() {
                public void handleLogoutEvent(LogoutEvent event) {
                    onLogoutEvent();
                }
            });


    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:227)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireForceCommsReset(){
        eventBus.fireEvent(new ForceCommsReset());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:485)
    protected void sendLogoutRequest(LogoutRequestDMO request){
        commsController.sendLogoutRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:535)
    protected LogoutRequestDMO getLogoutRequest(){
        LogoutRequestDMO request = commsController.getLogoutRequest();
        request.setHandlerID(LOGOUTLOGOUTCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:290)
    @Override
    final public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case LOGOUTLOGOUTCALLBACK:
                handleLogoutResponseError((LogoutResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case LOGOUTLOGOUTCALLBACK:
                handleLogoutResponse((LogoutResponseDMO)response);
                break;
            }
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:324)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case LOGOUTLOGOUTCALLBACK:
            throw(new IllegalStateException("RPC errors for Logout are supposed to be centrally handled!"));
        }
    }

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onAddContactEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onEditContactCancelledEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onEditContactEvent(ContactDMO contact);

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onLoginCompleteEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onLogoutCompleteEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onLogoutEvent();

    abstract protected void handleLogoutResponseError(LogoutResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:612)
    abstract protected void handleLogoutResponse(LogoutResponseDMO response);

}

