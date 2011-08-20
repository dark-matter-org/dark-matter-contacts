package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:117)
import com.google.gwt.activity.shared.AbstractActivity;                                                            // Is abstract activity
import com.google.gwt.sample.contacts.client.generated.mvw.views.EditContactView.EditContactViewPresenter;         // Presenter interface
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                        // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                             // Component sends GetRequests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                            // Component receives GetResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                               // DMP communications
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;                                                             // Component sends SetRequests
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;                                                            // Component receives SetResponses
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                        // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                       // Need the run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                       // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                             // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class EditContactActivityBaseImpl extends AbstractActivity  implements EditContactViewPresenter, ResponseHandlerIF{

    protected final CommsController commsController;

    private final int GETCONTACTGETCALLBACK = 0;
    private final int SETCONTACTSETCALLBACK = 1;

    public EditContactActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();

    }

    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.CENTRAL);
    }

    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setHandlerID(GETCONTACTGETCALLBACK);
        return(request);
    }

    protected void sendSetContactRequest(SetRequestDMO request){
        commsController.sendSetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.CENTRAL);
    }

    protected SetRequestDMO getSetContactRequest(){
        SetRequestDMO request = commsController.getSetRequest();
        request.setHandlerID(SETCONTACTSETCALLBACK);
        return(request);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case GETCONTACTGETCALLBACK:
                throw(new IllegalStateException("DMP errors for GetContact are supposed to be centrally handled!"));
            case SETCONTACTSETCALLBACK:
                throw(new IllegalStateException("DMP errors for SetContact are supposed to be centrally handled!"));
            }
        }
        else{
            switch(response.getHandlerID()){
            case GETCONTACTGETCALLBACK:
                handleGetContactResponse((GetResponseDMO)response);
                break;
            case SETCONTACTSETCALLBACK:
                handleSetContactResponse((SetResponseDMO)response);
                break;
            }
        }
    }

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
            switch(request.getHandlerID()){
        case GETCONTACTGETCALLBACK:
            throw(new IllegalStateException("RPC errors for GetContact are supposed to be centrally handled!"));
        case SETCONTACTSETCALLBACK:
            throw(new IllegalStateException("RPC errors for SetContact are supposed to be centrally handled!"));
            }
    }

    abstract protected void handleGetContactResponse(GetResponseDMO response);

    abstract protected void handleSetContactResponse(SetResponseDMO response);

}

