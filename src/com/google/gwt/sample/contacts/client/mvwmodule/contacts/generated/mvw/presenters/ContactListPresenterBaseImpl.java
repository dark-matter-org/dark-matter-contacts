package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:157)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                                         // Used by ContactListViewRCI - (RunContextItem.java:416)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                                       // Contacts run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactCompleteEvent;                             // Required by AddContactCompleteEvent - (Event.java:205)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactCompleteEventHandler;                      // Required by AddContactCompleteEvent - (Event.java:206)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCompleteEvent;                            // Required by EditContactCompleteEvent - (Event.java:205)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCompleteEventHandler;                     // Required by EditContactCompleteEvent - (Event.java:206)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                                    // View interface - (View.java:155)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF.ContactListViewPresenterIF;         // Presenter interface - (View.java:152)
import org.dmd.dmc.DmcObjectName;                                                                                                         // Required type - (Event.java:67)
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                               // DMP communications - (Component.java:393)
import org.dmd.dmp.client.EventHandlerIF;                                                                                                 // Handles events resulting from GetRequests - (Component.java:269)
import org.dmd.dmp.client.ResponseHandlerIF;                                                                                              // DMP communications - (Component.java:392)
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;                                                                                      // Events - (Component.java:270)
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;                                                                                 // Component sends DeleteRequests - (Component.java:257)
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;                                                                                // Component receives DeleteResponses - (Component.java:258)
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                                                    // Component sends GetRequests - (Component.java:257)
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                                                   // Component receives GetResponses - (Component.java:258)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                                       // DMP communications - (Component.java:394)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                                      // DMP communications - (Component.java:395)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                               // DMP communications - (Component.java:396)
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                                             // Used by gxtCache - (RunContextItem.java:428)
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                                              // Gxt run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                                    // Used by placeController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                                // Used by eventBus - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                              // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                              // Used by commsController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                                    // Mvwcomms run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.CommsSessionReady;                                                                // Required by CommsSessionReady - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.CommsSessionReadyHandler;                                                         // Required by CommsSessionReady - (Event.java:206)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEvent;                                                              // Required by LogoutCompleteEvent - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEventHandler;                                                       // Required by LogoutCompleteEvent - (Event.java:206)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PresenterFormatter.formatPresenterBaseImpl(PresenterFormatter.java:42)
abstract public class ContactListPresenterBaseImpl implements ContactListViewPresenterIF, ResponseHandlerIF, EventHandlerIF {

    protected final CommsController commsController;
    protected final MvwEventBus eventBus;
    protected final GxtCache gxtCache;
    protected final MvwAsyncPlaceController placeController;

    MvwRunContextIF runcontext;

    private final int DELETECONTACTDELETECALLBACK = 1;
    private final int GETCONTACTGETCALLBACK = 0;

    public ContactListPresenterBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        gxtCache = ((GxtRunContextIF)rc).getGxtCache();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;
        eventBus.addHandler(AddContactCompleteEvent.TYPE,
            new AddContactCompleteEventHandler() {
                public void handleAddContactCompleteEvent(AddContactCompleteEvent event) {
                    onAddContactCompleteEvent(event.getName());
                }
            });

        eventBus.addHandler(CommsSessionReady.TYPE,
            new CommsSessionReadyHandler() {
                public void handleCommsSessionReady(CommsSessionReady event) {
                    onCommsSessionReady();
                }
            });

        eventBus.addHandler(EditContactCompleteEvent.TYPE,
            new EditContactCompleteEventHandler() {
                public void handleEditContactCompleteEvent(EditContactCompleteEvent event) {
                    onEditContactCompleteEvent(event.getName());
                }
            });

        eventBus.addHandler(LogoutCompleteEvent.TYPE,
            new LogoutCompleteEventHandler() {
                public void handleLogoutCompleteEvent(LogoutCompleteEvent event) {
                    onLogoutCompleteEvent();
                }
            });


    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:146)
    public ContactListView getNewContactListView(ContactListViewIF.ContactListViewPresenterIF presenter){
        return( ((ContactsRunContextIF)runcontext).getContactListViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:485)
    protected void sendDeleteContactRequest(DeleteRequestDMO request){
        commsController.sendDeleteRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:535)
    protected DeleteRequestDMO getDeleteContactRequest(){
        DeleteRequestDMO request = commsController.getDeleteRequest();
        request.setHandlerID(DELETECONTACTDELETECALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:479)
    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:535)
    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setRegisterForEvents(true);
        request.setHandlerID(GETCONTACTGETCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:549)
    protected void denotifyForGetContactEvents(){
        // TODO: fill in denotify request and send it
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:556)
    protected void handleGetContactEvent(){
        // TODO: fill in denotify request and send it
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:290)
    @Override
    final public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case DELETECONTACTDELETECALLBACK:
                handleDeleteContactResponseError((DeleteResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponseError((GetResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case DELETECONTACTDELETECALLBACK:
                handleDeleteContactResponse((DeleteResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponse((GetResponseDMO)response);
                break;
            }
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:314)
    @Override
    final public void handleEvent(DMPEventDMO event){
        switch(event.getHandlerID()){
        case GETCONTACTGETCALLBACK:
            handleEventFromGetContact(event);
            break;
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:324)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case DELETECONTACTDELETECALLBACK:
            throw(new IllegalStateException("RPC errors for DeleteContact are supposed to be centrally handled!"));
        case GETCONTACTGETCALLBACK:
            throw(new IllegalStateException("RPC errors for GetContact are supposed to be centrally handled!"));
        }
    }

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onAddContactCompleteEvent(DmcObjectName name);

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onCommsSessionReady();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onEditContactCompleteEvent(DmcObjectName name);

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract protected void onLogoutCompleteEvent();

    abstract protected void handleDeleteContactResponseError(DeleteResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:612)
    abstract protected void handleDeleteContactResponse(DeleteResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:612)
    abstract protected void handleGetContactResponse(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:616)
    abstract protected void handleEventFromGetContact(DMPEventDMO event);

}

