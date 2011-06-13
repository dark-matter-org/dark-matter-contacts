package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:70)
import com.google.gwt.activity.shared.AbstractActivity;                                                            // Is abstract activity
import com.google.gwt.sample.contacts.client.generated.mvw.views.EditContactView.EditContactViewPresenter;         // Presenter interface
import org.dmd.dmp.client.ResponseHandlerIF;                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                             // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                            // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                               // DMP communications
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;                                                             // Component sends set requests
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;                                                            // Component sends set requests
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                        // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                       // Always need context for Activities
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                       // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                             // Mvwcomms run context

abstract public class EditContactActivityBaseImpl extends AbstractActivity  implements EditContactViewPresenter, ResponseHandlerIF{

    protected final CommsController commsController;

    private final int CONTACTGETCALLBACK = 0;
    private final int CONTACTSETCALLBACK = 1;

    public EditContactActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
    }

    protected void sendContactGetRequest(GetRequestDMO request){
        commsController.sendRequest(request,this);
    }

    protected void sendContactSetRequest(SetRequestDMO request){
        commsController.sendRequest(request,this);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            throw(new IllegalStateException("Dark Matter Protocol errors are supposed to be centrally handled!"));
        }
        else{
            switch(response.getHandlerID()){
            case CONTACTGETCALLBACK:
                handleContactResponse((GetResponseDMO)response);
                break;
            case CONTACTSETCALLBACK:
                handleContactResponse((SetResponseDMO)response);
                break;
            }
        }
    }

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
        throw(new IllegalStateException("RPC errors are supposed to be centrally handled!"));
    }

    abstract protected void handleContactResponse(GetResponseDMO response);

    abstract protected void handleContactResponse(SetResponseDMO response);

}

