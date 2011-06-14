package com.google.gwt.sample.contacts.client.generated.mvw.presenters;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:76)
import com.google.gwt.event.shared.EventBus;                                                                       // Used by eventBus
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListView.ContactListViewPresenter;         // Presenter interface
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                        // DMP communications
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

    private final int DELETECONTACTDELETECALLBACK = 0;
    private final int GETCONTACTGETCALLBACK = 1;

    public ContactListPresenterBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

    protected void sendDeleteContactRequest(DeleteRequestDMO request){
        commsController.sendDeleteRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.CENTRAL);
    }

    protected DeleteRequestDMO getDeleteContactRequest(){
        DeleteRequestDMO request = commsController.getDeleteRequest();
        request.setHandlerID(DELETECONTACTDELETECALLBACK);
        return(request);
    }

    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,ErrorOptionsEnum.CENTRALANDLOCAL,ErrorOptionsEnum.CENTRALANDLOCAL);
    }

    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setHandlerID(GETCONTACTGETCALLBACK);
        return(request);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
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
            case GETCONTACTGETCALLBACK:
                handleGetContactResponseRPCError(caught,(GetRequestDMO)request);
                break;
            }
    }

    abstract protected void handleDeleteContactResponse(DeleteResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    abstract protected void handleGetContactResponseRPCError(Throwable caught, GetRequestDMO request);

    abstract protected void handleGetContactResponse(GetResponseDMO response);

}

