package org.dmd.examples.contacts.client.application.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:114)
import com.google.gwt.activity.shared.ActivityManager;                                                                    // Used by activityManager - (RunContextItem.java:437)
import com.google.gwt.core.client.GWT;                                                                                    // Used by dmpConnection - (RunContextItem.java:440)
import com.google.gwt.core.client.RunAsyncCallback;                                                                       // Handling runAsync() results - (RunContextItem.java:458)
import com.google.gwt.place.shared.PlaceHistoryHandler;                                                                   // Used by historyHandler - (RunContextItem.java:437)
import de.novanic.eventservice.client.event.RemoteEventService;                                                           // Used by eventService - (RunContextItem.java:437)
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;                                                    // Used by eventService - (RunContextItem.java:440)
import org.dmd.dmp.client.DMPService;                                                                                     // Used by dmpConnection - (RunContextItem.java:440)
import org.dmd.dmp.client.DMPServiceAsync;                                                                                // Used by dmpConnection - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.application.extended.ContactAppController;                                        // Used by ContactAppControllerRCI - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.application.generated.mvw.places.ContactWebApplicationPlaceHistoryMapper;         // Used by historyMapper - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                                 // Used by EditContactViewRCI - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing.ContactListPresenter;                         // Used by ContactListPresenterRCI - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                              // Used by ContactListViewRCI - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;          // Needed to create ContactListPresenter instances asynchronously - (RunContextItem.java:456)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                         // The ContactListView - (RunContextItem.java:445)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewAsyncIF;                    // Needed to create EditContactView instances asynchronously - (RunContextItem.java:448)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                         // The EditContactView - (RunContextItem.java:445)
import org.dmd.examples.contacts.client.mvwmodule.contacts.resources.Images;                                              // Used by images - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.login.extended.LoginView;                                               // Used by LoginViewRCI - (RunContextItem.java:437)
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                                  // The LoginView - (RunContextItem.java:445)
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                             // Used by gxtCache - (RunContextItem.java:437)
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                                          // Used by activityMapper - (RunContextItem.java:437)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;                                                                     // Used by centralAsyncErrorHandler - (RunContextItem.java:437)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                    // Used by placeController - (RunContextItem.java:437)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                // Used by eventBus - (RunContextItem.java:437)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                              // Used by commsController - (RunContextItem.java:437)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:116)
public class ContactWebApplicationRunContext implements ContactWebApplicationRunContextIF {

    // Defined in module: mvw
    private final MvwEventBus                             eventBus;

    // Defined in module: mvwcomms
    private final DMPServiceAsync                         dmpConnection;

    // Defined in module: mvw
    private final MvwAsyncPlaceController                 placeController;

    // Defined in module: mvwcomms
    private final RemoteEventService                      eventService;

    // Defined in module: mvwcomms
    private final CommsController                         commsController;

    // Defined in module: mvw
    private final MvwActivityMapper                       activityMapper;

    // Defined in module: mvw
    private final ActivityManager                         activityManager;

    // Defined in module: contactsapp
    private final ContactWebApplicationPlaceHistoryMapper historyMapper;

    // Defined in module: mvw
    private final PlaceHistoryHandler                     historyHandler;

    // Defined in module: gxt
    private final GxtCache                                gxtCache;

    // Defined in module: contactsapp
    private final ContactAppController                    ContactAppControllerRCI;

    // Defined in module: contacts
    private ContactListPresenter                    ContactListPresenterRCI;

    // Defined in module: mvw
    private final MvwAsyncErrorHandlerIF                  centralAsyncErrorHandler;

    // Defined in module: contacts
    private final Images                                  images;


    public ContactWebApplicationRunContext(){

        eventBus                 = new MvwEventBus();
        dmpConnection            = (DMPServiceAsync) GWT.create(DMPService.class);
        placeController          = new MvwAsyncPlaceController(this, (com.google.web.bindery.event.shared.EventBus) eventBus);
        eventService             = RemoteEventServiceFactory.getInstance().getRemoteEventService();
        commsController          = new CommsController(this);
        activityMapper           = new MvwActivityMapper(this);
        activityManager          = new ActivityManager(activityMapper, eventBus);
        historyMapper            = GWT.create(ContactWebApplicationPlaceHistoryMapper.class);
        historyHandler           = new PlaceHistoryHandler(historyMapper);
        gxtCache                 = new GxtCache();
        ContactAppControllerRCI  = new ContactAppController(this);
        centralAsyncErrorHandler = ContactAppControllerRCI;
        images                   = GWT.create(Images.class);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public ContactAppController getContactAppControllerRCI(){
        return(ContactAppControllerRCI);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getPresenterImplMethod(RunContextItem.java:253)
    @Override
    public void getContactListPresenterRCI(final ContactListPresenterAsyncIF requester){
        if (ContactListPresenterRCI == null){
            final ContactWebApplicationRunContextIF thisContext = this;
            GWT.runAsync(new RunAsyncCallback() {

                @Override
                public void onSuccess() {
                    ContactListPresenterRCI = new ContactListPresenter(thisContext);
                    requester.asyncContactListPresenterReady(ContactListPresenterRCI);
                }

                @Override
                public void onFailure(Throwable reason) {
                    centralAsyncErrorHandler.handleAsyncCodeError("new ContactListPresenter(thisContext)",reason);
                }
            });
        }
        else
            requester.asyncContactListPresenterReady(ContactListPresenterRCI);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getViewImplMethod(RunContextItem.java:344)
    @Override
    public ContactListView getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter){
        ContactListView view = new ContactListView(presenter, this);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getViewImplMethod(RunContextItem.java:319)
    @Override
    public void getEditContactViewRCI(final EditContactViewIF.EditContactViewPresenterIF presenter, final EditContactViewAsyncIF requester){
        final ContactWebApplicationRunContextIF thisContext = this;
        GWT.runAsync(new RunAsyncCallback() {
        	
        	   @Override
        	   public void onSuccess() {
                requester.asyncEditContactViewReady(new EditContactView(presenter, thisContext));
        	   }
        	
        	   @Override
        	   public void onFailure(Throwable reason) {
        		   centralAsyncErrorHandler.handleAsyncCodeError("new EditContactView(presenter, thisContext)",reason);
        	   }
        });
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getViewImplMethod(RunContextItem.java:344)
    @Override
    public LoginView getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter){
        LoginView view = new LoginView(presenter);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public ActivityManager getActivityManager(){
        return(activityManager);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public MvwActivityMapper getActivityMapper(){
        return(activityMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public MvwAsyncErrorHandlerIF getCentralAsyncErrorHandler(){
        return(centralAsyncErrorHandler);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public CommsController getCommsController(){
        return(commsController);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public DMPServiceAsync getDmpConnection(){
        return(dmpConnection);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public MvwEventBus getEventBus(){
        return(eventBus);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public RemoteEventService getEventService(){
        return(eventService);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public GxtCache getGxtCache(){
        return(gxtCache);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public PlaceHistoryHandler getHistoryHandler(){
        return(historyHandler);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public ContactWebApplicationPlaceHistoryMapper getHistoryMapper(){
        return(historyMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public Images getImages(){
        return(images);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:238)
    @Override
    public MvwAsyncPlaceController getPlaceController(){
        return(placeController);
    }

}

