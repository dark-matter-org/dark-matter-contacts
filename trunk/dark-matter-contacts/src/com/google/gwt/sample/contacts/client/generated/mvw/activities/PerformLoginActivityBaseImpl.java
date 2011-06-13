package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:70)
import com.google.gwt.activity.shared.AbstractActivity;                                                // Is abstract activity
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginView.LoginViewPresenter;         // Presenter interface
import org.dmd.dmp.client.ResponseHandlerIF;                                                           // DMP communications
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;                                               // Component sends login requests
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;                                              // Component sends login requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                    // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                   // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                            // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                           // Always need context for Activities
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                           // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                 // Mvwcomms run context

abstract public class PerformLoginActivityBaseImpl extends AbstractActivity  implements LoginViewPresenter, ResponseHandlerIF{

    protected final CommsController commsController;

    private final int LOGINLOGINCALLBACK = 0;

    public PerformLoginActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
    }

    protected void sendLoginLoginRequest(LoginRequestDMO request){
        commsController.sendRequest(request,this);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            throw(new IllegalStateException("Dark Matter Protocol errors are supposed to be centrally handled!"));
        }
        else{
            switch(response.getHandlerID()){
            case LOGINLOGINCALLBACK:
                handleLoginResponse((LoginResponseDMO)response);
                break;
            }
        }
    }

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
        throw(new IllegalStateException("RPC errors are supposed to be centrally handled!"));
    }

    abstract protected void handleLoginResponse(LoginResponseDMO response);

}

