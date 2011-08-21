package com.google.gwt.sample.contacts.client.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:114)
import com.google.gwt.event.shared.EventBus;                                                                // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                         // Used by placeController
import com.google.gwt.sample.contacts.client.extended.presenters.ContactListPresenter;                      // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.extended.views.ContactListView;                                // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.generated.mvw.ContactsRunContextIF;                            // Contacts run context
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEvent;                          // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.AddContactEventHandler;                   // Required by AddContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEvent;                // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactCancelledEventHandler;         // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEvent;                         // Required by EditContactEvent
import com.google.gwt.sample.contacts.client.generated.mvw.events.EditContactEventHandler;                  // Required by EditContactEvent
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                      // Required type
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                 // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                                // DMP communications
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;                                                   // Component sends DeleteRequests
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;                                                  // Component receives DeleteResponses
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                      // Component sends GetRequests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                     // Component receives GetResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                         // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                        // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                 // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                // Mvw run context
import org.dmd.mvw.client.mvwcomms.CentralDMPErrorHandlerIF;                                                // Is the central DMP error handler
import org.dmd.mvw.client.mvwcomms.CentralRPCErrorHandlerIF;                                                // Is the central RPC error handler
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                      // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:24)
abstract public class ContactAppControllerBaseImpl implements ResponseHandlerIF, CentralDMPErrorHandlerIF, CentralRPCErrorHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;
    protected final PlaceController placeController;

    MvwRunContextIF runcontext;

    private final int DELETECONTACTDELETECALLBACK = 1;
    private final int GETCONTACTGETCALLBACK = 0;

    public ContactAppControllerBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;


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


    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:101)
    public ContactListPresenter getNewContactListPresenter(){
        return( ((ContactsRunContextIF)runcontext).getContactListPresenterRCI());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:108)
    public ContactListView getNewContactListView(ContactListView.ContactListViewPresenter presenter){
        return( ((ContactsRunContextIF)runcontext).getContactListViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:403)
    protected void sendDeleteContactRequest(DeleteRequestDMO request){
        commsController.sendDeleteRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.CENTRAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:440)
    protected DeleteRequestDMO getDeleteContactRequest(){
        DeleteRequestDMO request = commsController.getDeleteRequest();
        request.setHandlerID(DELETECONTACTDELETECALLBACK);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:403)
    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.CENTRALANDLOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:440)
    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setRegisterForEvents(true);
        request.setHandlerID(GETCONTACTGETCALLBACK);
        return(request);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case DELETECONTACTDELETECALLBACK:
                throw(new IllegalStateException("DMP errors for DeleteContact are supposed to be centrally handled!"));
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

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
            switch(request.getHandlerID()){
        case DELETECONTACTDELETECALLBACK:
            throw(new IllegalStateException("RPC errors for DeleteContact are supposed to be centrally handled!"));
        case GETCONTACTGETCALLBACK:
            throw(new IllegalStateException("RPC errors for GetContact are supposed to be centrally handled!"));
            }
    }

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onAddContactEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactCancelledEvent();

    // org.dmd.mvw.tools.mvwgenerator.extended.Event.initCodeGenInfo(Event.java:96)
    abstract protected void onEditContactEvent(ContactDMO contact);

    abstract protected void handleDeleteContactResponse(DeleteResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    abstract protected void handleGetContactResponse(GetResponseDMO response);

}

