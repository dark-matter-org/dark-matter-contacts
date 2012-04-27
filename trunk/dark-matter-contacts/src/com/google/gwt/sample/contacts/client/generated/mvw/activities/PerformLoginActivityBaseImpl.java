package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:122)
import com.google.gwt.activity.shared.AbstractActivity;                                                    // Is abstract activity
import com.google.gwt.place.shared.PlaceController;                                                        // Used by placeController
import com.google.gwt.sample.contacts.client.extended.views.LoginView;                                     // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.generated.mvw.ContactsRunContextIF;                           // Contacts run context
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginViewIF;                              // View interface
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginViewIF.LoginViewPresenterIF;         // Presenter interface
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                               // DMP communications
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;                                                   // Component sends LoginRequests
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;                                                  // Component receives LoginResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                        // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                       // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                               // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                               // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                     // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class PerformLoginActivityBaseImpl extends AbstractActivity  implements LoginViewPresenterIF, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final PlaceController placeController;

    MvwRunContextIF runcontext;

    private final int LOGINLOGINCALLBACK = 0;

    public PerformLoginActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:112)
    public LoginView getNewLoginView(LoginViewIF.LoginViewPresenterIF presenter){
        return( ((ContactsRunContextIF)runcontext).getLoginViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:445)
    protected void sendLoginRequest(LoginRequestDMO request){
        commsController.sendLoginRequest(request,this,ErrorOptionsEnum.LOCAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:495)
    protected LoginRequestDMO getLoginRequest(){
        LoginRequestDMO request = commsController.getLoginRequest();
        request.setHandlerID(LOGINLOGINCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:255)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:289)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case LOGINLOGINCALLBACK:
            throw(new IllegalStateException("RPC errors for Login are supposed to be centrally handled!"));
        }
    }

    abstract protected void handleLoginResponseError(LoginResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:572)
    abstract protected void handleLoginResponse(LoginResponseDMO response);

}

