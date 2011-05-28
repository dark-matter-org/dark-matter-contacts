package com.google.gwt.sample.contacts.client.generated.mvw.presenters;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:63)
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListView.ContactListViewPresenter;         // Presenter interface
import com.google.web.bindery.event.shared.EventBus;                                                               // Used by eventBus
import org.dmd.dmp.client.ResponseHandlerIF;                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;                                                          // Component sends delete requests
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;                                                         // Component sends delete requests
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                             // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                            // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                               // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                        // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                       // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                       // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                             // Mvwcomms run context

abstract public class ContactListPresenterBaseImpl implements ContactListViewPresenter, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;

    private final int CONTACTDELETECALLBACK = 0;
    private final int CONTACTGETCALLBACK = 1;

    public ContactListPresenterBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    protected void sendContactDeleteRequest(DeleteRequestDMO request){
        commsController.sendRequest(request,this);
    }

    protected void sendContactGetRequest(GetRequestDMO request){
        commsController.sendRequest(request,this);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case CONTACTGETCALLBACK:
                handleContactGetResponseError((GetResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case CONTACTDELETECALLBACK:
                handleContactDeleteResponse((DeleteResponseDMO)response);
                break;
            case CONTACTGETCALLBACK:
                handleContactGetResponse((GetResponseDMO)response);
                break;
            }
        }
    }

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
            switch(request.getHandlerID()){
            case CONTACTGETCALLBACK:
                handleContactGetResponseRPCError(caught,(GetRequestDMO)request);
                break;
            }
    }

    abstract protected void handleContactDeleteResponse(DeleteResponseDMO response);

    abstract protected void handleContactGetResponseError(GetResponseDMO response);

    abstract protected void handleContactGetResponseRPCError(Throwable caught, GetRequestDMO request);

    abstract protected void handleContactGetResponse(GetResponseDMO response);

}

