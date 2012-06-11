package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:169)
import com.google.gwt.activity.shared.AbstractActivity;                                                                                   // Is abstract activity - (Activity.java:143)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                                            // Used by EditContactViewRCI - (RunContextItem.java:335)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                                       // Contacts run context - (RunContextItem.java:325)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactCompleteEvent;                             // Required by AddContactCompleteEvent - (Event.java:198)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;                           // Required by EditContactCancelledEvent - (Event.java:198)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCompleteEvent;                            // Required by EditContactCompleteEvent - (Event.java:198)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                                    // View interface - (View.java:140)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF.EditContactViewPresenterIF;         // Presenter interface - (View.java:139)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                                                    // Component uses Contact objects - (Component.java:272)
import org.dmd.dmc.DmcObjectName;                                                                                                         // Required type - (Event.java:67)
import org.dmd.dmc.DmcValueException;                                                                                                     // Used when creating SetRequests - (Component.java:274)
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                               // DMP communications - (Component.java:405)
import org.dmd.dmp.client.ResponseHandlerIF;                                                                                              // DMP communications - (Component.java:404)
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;                                                                                 // Component sends CreateRequests - (Component.java:269)
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;                                                                                // Component receives CreateResponses - (Component.java:270)
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                                                    // Component sends GetRequests - (Component.java:269)
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                                                   // Component receives GetResponses - (Component.java:270)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                                       // DMP communications - (Component.java:406)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                                      // DMP communications - (Component.java:407)
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;                                                                                    // Component sends SetRequests - (Component.java:269)
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;                                                                                   // Component receives SetResponses - (Component.java:270)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                               // DMP communications - (Component.java:408)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                                                               // Used when creating SetRequests - (Component.java:275)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                                    // Used by placeController - (RunContextItem.java:335)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                                // Used by eventBus - (RunContextItem.java:335)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                              // Mvw run context - (RunContextItem.java:325)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                              // Used by commsController - (RunContextItem.java:335)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                                    // Mvwcomms run context - (RunContextItem.java:325)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:38)
abstract public class EditContactActivityBaseImpl extends AbstractActivity  implements EditContactViewPresenterIF, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final MvwEventBus eventBus;
    protected final MvwAsyncPlaceController placeController;

    MvwRunContextIF runcontext;

    private final int CREATECONTACTCREATECALLBACK = 2;
    private final int GETCONTACTGETCALLBACK = 0;
    private final int SETCONTACTSETCALLBACK = 1;

    public EditContactActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:160)
    public EditContactView getNewEditContactView(EditContactViewIF.EditContactViewPresenterIF presenter){
        return( ((ContactsRunContextIF)runcontext).getEditContactViewRCI(presenter));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:239)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireAddContactCompleteEvent(DmcObjectName name){
        eventBus.fireEvent(new AddContactCompleteEvent(name));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:239)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:239)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireEditContactCompleteEvent(DmcObjectName name){
        eventBus.fireEvent(new EditContactCompleteEvent(name));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:497)
    protected void sendCreateContactRequest(CreateRequestDMO request){
        commsController.sendCreateRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:526)
    protected CreateRequestDMO getCreateContactRequest(ContactDMO newobj){
        CreateRequestDMO request = commsController.getCreateRequest();
        request.setHandlerID(CREATECONTACTCREATECALLBACK);
        request.setNotifyOriginator(true);
        request.setNewObject(newobj);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:497)
    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:547)
    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setHandlerID(GETCONTACTGETCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:497)
    protected void sendSetContactRequest(SetRequestDMO request){
        commsController.sendSetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:505)
    protected SetRequestDMO getSetContactRequest(ContactDMO modrec){
        if (modrec.getModifier() == null)
            throw(new IllegalStateException("The DMO passed here should have a modifier."));
    
        SetRequestDMO request = commsController.getSetRequest();
        request.setHandlerID(SETCONTACTSETCALLBACK);
        request.setNotifyOriginator(true);
    
        request.setTarget(modrec.getObjectName());
        try{
            request.add(MetaDMSAG.__modify, modrec.getModifier());
            request.setTargetObjectClass(modrec.getConstructionClass());
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Setting the modifier on a SetRequest shouldn't thrown an exception.",e));
        }
    
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:302)
    @Override
    final public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case CREATECONTACTCREATECALLBACK:
                handleCreateContactResponseError((CreateResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponseError((GetResponseDMO)response);
                break;
            case SETCONTACTSETCALLBACK:
                handleSetContactResponseError((SetResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case CREATECONTACTCREATECALLBACK:
                handleCreateContactResponse((CreateResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponse((GetResponseDMO)response);
                break;
            case SETCONTACTSETCALLBACK:
                handleSetContactResponse((SetResponseDMO)response);
                break;
            }
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:336)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case CREATECONTACTCREATECALLBACK:
            throw(new IllegalStateException("RPC errors for CreateContact are supposed to be centrally handled!"));
        case GETCONTACTGETCALLBACK:
            throw(new IllegalStateException("RPC errors for GetContact are supposed to be centrally handled!"));
        case SETCONTACTSETCALLBACK:
            throw(new IllegalStateException("RPC errors for SetContact are supposed to be centrally handled!"));
        }
    }

    abstract protected void handleCreateContactResponseError(CreateResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:624)
    abstract protected void handleCreateContactResponse(CreateResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:624)
    abstract protected void handleGetContactResponse(GetResponseDMO response);

    abstract protected void handleSetContactResponseError(SetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:624)
    abstract protected void handleSetContactResponse(SetResponseDMO response);

}

