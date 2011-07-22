package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:82)
import com.google.gwt.activity.shared.AbstractActivity;                                                // Is abstract activity
import com.google.gwt.place.shared.PlaceController;                                                    // Used by placeController
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginView.LoginViewPresenter;         // Presenter interface
import org.dmd.dmp.client.ErrorOptionsEnum;                                                            // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                           // DMP communications
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;                                               // Component sends login requests
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;                                              // Component sends login requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                    // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                   // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                            // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                           // Always need context for Activities
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                           // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                 // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class PerformLoginActivityBaseImpl extends AbstractActivity  implements LoginViewPresenter, ResponseHandlerIF{

    protected final CommsController commsController;
    protected final PlaceController placeController;

    private final int LOGINLOGINCALLBACK = 0;

    public PerformLoginActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        placeController = ((MvwRunContextIF)rc).getPlaceController();
    }

    protected void sendLoginRequest(LoginRequestDMO request){
        commsController.sendLoginRequest(request,this,ErrorOptionsEnum.LOCAL,ErrorOptionsEnum.LOCAL);
    }

    protected LoginRequestDMO getLoginRequest(){
        LoginRequestDMO request = commsController.getLoginRequest();
        request.setHandlerID(LOGINLOGINCALLBACK);
        return(request);
    }

    @Override
    public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case LOGINLOGINCALLBACK:
                handleLoginResponseError((LoginResponseDMO)response);
                break;
            }
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
            switch(request.getHandlerID()){
        case LOGINLOGINCALLBACK:
            throw(new IllegalStateException("RPC errors for Login are supposed to be centrally handled!"));
            }
    }

    abstract protected void handleLoginResponseError(LoginResponseDMO response);

    abstract protected void handleLoginResponse(LoginResponseDMO response);

}

