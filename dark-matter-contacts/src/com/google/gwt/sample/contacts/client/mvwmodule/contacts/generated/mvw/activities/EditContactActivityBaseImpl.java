package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:154)
import com.google.gwt.activity.shared.AbstractActivity;                                                                                   // Is abstract activity
import com.google.gwt.event.shared.EventBus;                                                                                              // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                                                       // Used by placeController
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                                            // Used by EditContactViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                                       // Contacts run context
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactCompleteEvent;                             // Required by AddContactCompleteEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.AddContactCompleteEventHandler;                      // Required by AddContactCompleteEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEvent;                           // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCancelledEventHandler;                    // Required by EditContactCancelledEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCompleteEvent;                            // Required by EditContactCompleteEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.events.EditContactCompleteEventHandler;                     // Required by EditContactCompleteEvent
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                                    // View interface
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF.EditContactViewPresenterIF;         // Presenter interface
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;                                                                    // Component uses Contact objects
import org.dmd.dmc.DmcObjectName;                                                                                                         // Required type
import org.dmd.dmc.DmcValueException;                                                                                                     // Used when creating SetRequests
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                               // DMP communications
import org.dmd.dmp.client.ResponseHandlerIF;                                                                                              // DMP communications
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;                                                                                 // Component sends CreateRequests
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;                                                                                // Component receives CreateResponses
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                                                    // Component sends GetRequests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                                                   // Component receives GetResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                                      // DMP communications
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;                                                                                    // Component sends SetRequests
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;                                                                                   // Component receives SetResponses
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                               // DMP communications
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                                                               // Used when creating SetRequests
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                              // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                              // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                                    // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class EditContactActivityBaseImpl extends AbstractActivity  implements EditContactViewPresenterIF, ResponseHandlerIF {

    protected final CommsController commsController;
    protected final EventBus eventBus;
    protected final PlaceController placeController;

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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:137)
    public EditContactView getNewEditContactView(EditContactViewIF.EditContactViewPresenterIF presenter){
        return( ((ContactsRunContextIF)runcontext).getEditContactViewRCI(presenter));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:224)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:400)
    protected void fireAddContactCompleteEvent(DmcObjectName name){
        eventBus.fireEvent(new AddContactCompleteEvent(name));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:224)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:400)
    protected void fireEditContactCancelledEvent(){
        eventBus.fireEvent(new EditContactCancelledEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:224)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:400)
    protected void fireEditContactCompleteEvent(DmcObjectName name){
        eventBus.fireEvent(new EditContactCompleteEvent(name));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:482)
    protected void sendCreateContactRequest(CreateRequestDMO request){
        commsController.sendCreateRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:511)
    protected CreateRequestDMO getCreateContactRequest(ContactDMO newobj){
        CreateRequestDMO request = commsController.getCreateRequest();
        request.setHandlerID(CREATECONTACTCREATECALLBACK);
        request.setNotifyOriginator(true);
        request.setNewObject(newobj);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:482)
    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:532)
    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setHandlerID(GETCONTACTGETCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:482)
    protected void sendSetContactRequest(SetRequestDMO request){
        commsController.sendSetRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:490)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:287)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:321)
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

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:609)
    abstract protected void handleCreateContactResponse(CreateResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:609)
    abstract protected void handleGetContactResponse(GetResponseDMO response);

    abstract protected void handleSetContactResponseError(SetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:609)
    abstract protected void handleSetContactResponse(SetResponseDMO response);

}

