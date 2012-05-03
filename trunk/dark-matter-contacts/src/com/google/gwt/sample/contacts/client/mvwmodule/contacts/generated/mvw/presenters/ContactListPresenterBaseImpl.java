package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:134)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                                         // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                                       // Contacts run context
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                                    // View interface
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF.ContactListViewPresenterIF;         // Presenter interface
import org.dmd.dmp.client.ErrorOptionsEnum;                                                                                               // DMP communications
import org.dmd.dmp.client.EventHandlerIF;                                                                                                 // Handles events resulting from GetRequests
import org.dmd.dmp.client.ResponseHandlerIF;                                                                                              // DMP communications
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;                                                                                      // Events
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;                                                                                 // Component sends DeleteRequests
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;                                                                                // Component receives DeleteResponses
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;                                                                                    // Component sends GetRequests
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;                                                                                   // Component receives GetResponses
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                                                                       // DMP communications
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                                                                      // DMP communications
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                                                                               // DMP communications
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                                             // Used by gxtCache
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                                              // Gxt run context
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                              // Need the run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                              // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                                    // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PresenterFormatter.formatPresenterBaseImpl(PresenterFormatter.java:25)
abstract public class ContactListPresenterBaseImpl implements ContactListViewPresenterIF, ResponseHandlerIF, EventHandlerIF {

    protected final CommsController commsController;
    protected final GxtCache gxtCache;

    MvwRunContextIF runcontext;

    private final int DELETECONTACTDELETECALLBACK = 1;
    private final int GETCONTACTGETCALLBACK = 0;

    public ContactListPresenterBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        gxtCache = ((GxtRunContextIF)rc).getGxtCache();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:127)
    public ContactListView getNewContactListView(ContactListViewIF.ContactListViewPresenterIF presenter){
        return( ((ContactsRunContextIF)runcontext).getContactListViewRCI(presenter));
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:462)
    protected void sendDeleteContactRequest(DeleteRequestDMO request){
        commsController.sendDeleteRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:512)
    protected DeleteRequestDMO getDeleteContactRequest(){
        DeleteRequestDMO request = commsController.getDeleteRequest();
        request.setHandlerID(DELETECONTACTDELETECALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:456)
    protected void sendGetContactRequest(GetRequestDMO request){
        commsController.sendGetRequest(request,this,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:512)
    protected GetRequestDMO getGetContactRequest(){
        GetRequestDMO request = commsController.getGetRequest();
        request.setRegisterForEvents(true);
        request.setHandlerID(GETCONTACTGETCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:526)
    protected void denotifyForGetContactEvents(){
        // TODO: fill in denotify request and send it
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:533)
    protected void handleGetContactEvent(){
        // TODO: fill in denotify request and send it
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:267)
    @Override
    final public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case DELETECONTACTDELETECALLBACK:
                handleDeleteContactResponseError((DeleteResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponseError((GetResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case DELETECONTACTDELETECALLBACK:
                handleDeleteContactResponse((DeleteResponseDMO)response);
                break;
            case GETCONTACTGETCALLBACK:
                handleGetContactResponse((GetResponseDMO)response);
                break;
            }
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:291)
    @Override
    final public void handleEvent(DMPEventDMO event){
        switch(event.getHandlerID()){
        case GETCONTACTGETCALLBACK:
            handleEventFromGetContact(event);
            break;
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:301)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case DELETECONTACTDELETECALLBACK:
            throw(new IllegalStateException("RPC errors for DeleteContact are supposed to be centrally handled!"));
        case GETCONTACTGETCALLBACK:
            throw(new IllegalStateException("RPC errors for GetContact are supposed to be centrally handled!"));
        }
    }

    abstract protected void handleDeleteContactResponseError(DeleteResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:589)
    abstract protected void handleDeleteContactResponse(DeleteResponseDMO response);

    abstract protected void handleGetContactResponseError(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:589)
    abstract protected void handleGetContactResponse(GetResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:593)
    abstract protected void handleEventFromGetContact(DMPEventDMO event);

}

