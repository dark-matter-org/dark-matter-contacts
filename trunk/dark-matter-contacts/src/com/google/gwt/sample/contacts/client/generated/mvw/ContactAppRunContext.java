package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:99)
import com.google.gwt.activity.shared.ActivityManager;                                                  // Used by activityManager
import com.google.gwt.core.client.GWT;                                                                  // Used by dmpConnection
import com.google.gwt.event.shared.EventBus;                                                            // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                     // Used by placeController
import com.google.gwt.place.shared.PlaceHistoryHandler;                                                 // Used by historyHandler
import com.google.gwt.sample.contacts.client.extended.ContactAppController;                             // Used by ContactAppControllerRCI
import com.google.gwt.sample.contacts.client.extended.presenters.ContactListPresenter;                  // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.extended.views.ContactListView;                            // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.extended.views.EditContactView;                            // Used by EditContactViewRCI
import com.google.gwt.sample.contacts.client.extended.views.LoginView;                                  // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.generated.mvw.ContactsRunContextIF;                        // Contacts run context
import com.google.gwt.sample.contacts.client.generated.mvw.places.ContactAppPlaceHistoryMapper;         // Used by historyMapper
import de.novanic.eventservice.client.event.RemoteEventService;                                         // Used by eventService
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;                                  // Used by eventService
import org.dmd.dmp.client.DMPService;                                                                   // Used by dmpConnection
import org.dmd.dmp.client.DMPServiceAsync;                                                              // Used by dmpConnection
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                        // Used by activityMapper
import org.dmd.mvw.client.mvw.MvwEventBus;                                                              // Used by eventBus
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                            // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                            // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                  // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:101)
public class ContactAppRunContext implements ContactsRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    private final EventBus                     eventBus;
    private final DMPServiceAsync              dmpConnection;
    private final PlaceController              placeController;
    private final RemoteEventService           eventService;
    private final CommsController              commsController;
    private final MvwActivityMapper            activityMapper;
    private final ActivityManager              activityManager;
    private final ContactAppPlaceHistoryMapper historyMapper;
    private final PlaceHistoryHandler          historyHandler;
    private final ContactAppController         ContactAppControllerRCI;

    public ContactAppRunContext(){

        eventBus                = new MvwEventBus();
        dmpConnection           = (DMPServiceAsync) GWT.create(DMPService.class);
        placeController         = new PlaceController((com.google.gwt.event.shared.EventBus) eventBus);
        eventService            = RemoteEventServiceFactory.getInstance().getRemoteEventService();
        commsController         = new CommsController(this);
        activityMapper          = new MvwActivityMapper(this);
        activityManager         = new ActivityManager(activityMapper, eventBus);
        historyMapper           = GWT.create(ContactAppPlaceHistoryMapper.class);
        historyHandler          = new PlaceHistoryHandler(historyMapper);
        ContactAppControllerRCI = new ContactAppController(this);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public ContactAppController getContactAppControllerRCI(){
        return(ContactAppControllerRCI);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:142)
    @Override
    public ContactListPresenter getContactListPresenterRCI(){
        return(new ContactListPresenter());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:164)
    @Override
    public ContactListView getContactListViewRCI(ContactListView.ContactListViewPresenter presenter){
        ContactListView view = new ContactListView(this);
        view.setPresenter(presenter);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:164)
    @Override
    public EditContactView getEditContactViewRCI(EditContactView.EditContactViewPresenter presenter){
        EditContactView view = new EditContactView(this);
        view.setPresenter(presenter);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:164)
    @Override
    public LoginView getLoginViewRCI(LoginView.LoginViewPresenter presenter){
        LoginView view = new LoginView();
        view.setPresenter(presenter);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public ActivityManager getActivityManager(){
        return(activityManager);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public MvwActivityMapper getActivityMapper(){
        return(activityMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public CommsController getCommsController(){
        return(commsController);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public DMPServiceAsync getDmpConnection(){
        return(dmpConnection);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public EventBus getEventBus(){
        return(eventBus);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public RemoteEventService getEventService(){
        return(eventService);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public PlaceHistoryHandler getHistoryHandler(){
        return(historyHandler);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public ContactAppPlaceHistoryMapper getHistoryMapper(){
        return(historyMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:183)
    @Override
    public PlaceController getPlaceController(){
        return(placeController);
    }

}

