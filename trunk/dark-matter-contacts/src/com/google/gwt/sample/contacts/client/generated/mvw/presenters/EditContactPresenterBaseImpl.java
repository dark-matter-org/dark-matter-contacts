package com.google.gwt.sample.contacts.client.generated.mvw.presenters;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:70)
import com.google.gwt.sample.contacts.client.generated.mvw.views.EditContactView.EditContactViewPresenter;         // Presenter interface
import com.google.web.bindery.event.shared.EventBus;                                                               // Used by eventBus
import org.dmd.dmp.client.ResponseHandlerIF;                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                             // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                            // Component sends get requests
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                               // DMP communications
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;                                                             // Component sends set requests
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;                                                            // Component sends set requests
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                        // DMP communications
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                       // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                       // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                             // Mvwcomms run context

abstract public class EditContactPresenterBaseImpl implements EditContactViewPresenter, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;

    private final int CONTACTGETCALLBACK = 0;
    private final int CONTACTSETCALLBACK = 1;

    public EditContactPresenterBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
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
                handleContactGetResponse((GetResponseDMO)response);
                break;
            case CONTACTSETCALLBACK:
                handleContactSetResponse((SetResponseDMO)response);
                break;
            }
        }
    }

    @Override
    public void handleRPCFailure(Throwable caught, RequestDMO request){
        throw(new IllegalStateException("RPC errors are supposed to be centrally handled!"));
    }

    abstract protected void handleContactGetResponse(GetResponseDMO response);

    abstract protected void handleContactSetResponse(SetResponseDMO response);

}

