package com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:157)
import com.google.gwt.activity.shared.AbstractActivity;                                                                    // Is abstract activity - (Activity.java:143)
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.LoginView;                                           // Used by LoginViewRCI - (RunContextItem.java:416)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                              // Login run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                              // View interface - (View.java:155)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF.LoginViewPresenterIF;         // Presenter interface - (View.java:152)
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                // DMP communications - (Component.java:393)
import org.dmd.dmp.client.ResponseHandlerIF;                                                                               // DMP communications - (Component.java:392)
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;                                                                   // Component sends LoginRequests - (Component.java:257)
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;                                                                  // Component receives LoginResponses - (Component.java:258)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                        // DMP communications - (Component.java:394)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                       // DMP communications - (Component.java:395)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                // DMP communications - (Component.java:396)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                     // Used by placeController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                               // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                               // Used by commsController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                     // Mvwcomms run context - (RunContextItem.java:405)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:38)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:146)
    public LoginView getNewLoginView(LoginViewIF.LoginViewPresenterIF presenter){
        return( ((LoginRunContextIF)runcontext).getLoginViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:485)
    protected void sendLoginRequest(LoginRequestDMO request){
        commsController.sendLoginRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:535)
    protected LoginRequestDMO getLoginRequest(){
        LoginRequestDMO request = commsController.getLoginRequest();
        request.setHandlerID(LOGINLOGINCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:290)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:324)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case LOGINLOGINCALLBACK:
            throw(new IllegalStateException("RPC errors for Login are supposed to be centrally handled!"));
        }
    }

    abstract protected void handleLoginResponseError(LoginResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:612)
    abstract protected void handleLoginResponse(LoginResponseDMO response);

}

