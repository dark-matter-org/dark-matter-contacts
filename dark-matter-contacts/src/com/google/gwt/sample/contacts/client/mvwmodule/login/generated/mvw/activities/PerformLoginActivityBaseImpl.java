package com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:154)
import com.google.gwt.activity.shared.AbstractActivity;                                                                    // Is abstract activity - Activity.java:129
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.LoginView;                                           // Used by LoginViewRCI - RunContextItem.java:320
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                              // Login run context - RunContextItem.java:310
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                              // View interface - View.java:126
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF.LoginViewPresenterIF;         // Presenter interface - View.java:125
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                // DMP communications - Component.java:390
import org.dmd.dmp.client.ResponseHandlerIF;                                                                               // DMP communications - Component.java:389
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;                                                                   // Component sends LoginRequests - Component.java:254
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;                                                                  // Component receives LoginResponses - Component.java:255
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                        // DMP communications - Component.java:391
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                       // DMP communications - Component.java:392
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                // DMP communications - Component.java:393
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                     // Used by placeController - RunContextItem.java:320
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                               // Mvw run context - RunContextItem.java:310
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                               // Used by commsController - RunContextItem.java:320
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                     // Mvwcomms run context - RunContextItem.java:310

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class PerformLoginActivityBaseImpl extends AbstractActivity  implements LoginViewPresenterIF, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final MvwAsyncPlaceController placeController;

    MvwRunContextIF runcontext;

    private final int LOGINLOGINCALLBACK = 0;

    public PerformLoginActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:145)
    public LoginView getNewLoginView(LoginViewIF.LoginViewPresenterIF presenter){
        return( ((LoginRunContextIF)runcontext).getLoginViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:482)
    protected void sendLoginRequest(LoginRequestDMO request){
        commsController.sendLoginRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:532)
    protected LoginRequestDMO getLoginRequest(){
        LoginRequestDMO request = commsController.getLoginRequest();
        request.setHandlerID(LOGINLOGINCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:287)
    @Override
    final public void handleResponse(ResponseDMO response){
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:321)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case LOGINLOGINCALLBACK:
            throw(new IllegalStateException("RPC errors for Login are supposed to be centrally handled!"));
        }
    }

    abstract protected void handleLoginResponseError(LoginResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:609)
    abstract protected void handleLoginResponse(LoginResponseDMO response);

}

