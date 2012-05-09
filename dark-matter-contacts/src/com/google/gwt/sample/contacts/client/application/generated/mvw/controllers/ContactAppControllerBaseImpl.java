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
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                    // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                                                   // DMP communications
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;                                                                      // Component sends LogoutRequests
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;                                                                     // Component receives LogoutResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                            // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                           // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                    // DMP communications
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                                  // Used by gxtCache
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                                   // Gxt run context
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                         // Mvwcomms run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.ForceCommsReset;                                                       // Required by ForceCommsReset
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.ForceCommsResetHandler;                                                // Required by ForceCommsReset
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;                                                    // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEventHandler;                                             // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEvent;                                                   // Required by LogoutCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEventHandler;                                            // Required by LogoutCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEvent;                                                           // Required by LogoutEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutEventHandler;                                                    // Required by LogoutEvent

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:24)
abstract public class ContactAppControllerBaseImpl implements ResponseHandlerIF, CentralRPCErrorHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;
    protected final GxtCache gxtCache;
    protected final PlaceController placeController;

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

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:204)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:345)
    protected void fireForceCommsReset(){
        eventBus.fireEvent(new ForceCommsReset());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:462)
    protected void sendLogoutRequest(LogoutRequestDMO request){
        commsController.sendLogoutRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:512)
    protected LogoutRequestDMO getLogoutRequest(){
        LogoutRequestDMO request = commsController.getLogoutRequest();
        request.setHandlerID(LOGOUTLOGOUTCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:267)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:301)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case LOGOUTLOGOUTCALLBACK:
            throw(new IllegalStateException("RPC errors for Logout are supposed to be centrally handled!"));
        }
    }

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onAddContactEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactCancelledEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactEvent(ContactDMO contact);

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onLoginCompleteEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onLogoutCompleteEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onLogoutEvent();

    abstract protected void handleLogoutResponseError(LogoutResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:589)
    abstract protected void handleLogoutResponse(LogoutResponseDMO response);

}

