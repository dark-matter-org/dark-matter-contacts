package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:87)
import com.google.gwt.activity.shared.ActivityManager;                                                  // Used by activityManager
import com.google.gwt.core.client.GWT;                                                                  // Used by historyMapper
import com.google.gwt.event.shared.EventBus;                                                            // Used by eventBus
import com.google.gwt.event.shared.SimpleEventBus;                                                      // Used by eventBus
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
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                            // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                            // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                  // Mvwcomms run context

public class ContactAppRunContext implements ContactsRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    private final EventBus eventBus;
    private final DMPServiceAsync dmpConnection;
    private final PlaceController placeController;
    private final RemoteEventService eventService;
    private final CommsController commsController;
    private final MvwActivityMapper activityMapper;
    private final ActivityManager activityManager;
    private final ContactAppPlaceHistoryMapper historyMapper;
    private final PlaceHistoryHandler historyHandler;
    private final ContactAppController ContactAppControllerRCI;

    public ContactAppRunContext(){

        eventBus = new SimpleEventBus();
        dmpConnection = (DMPServiceAsync) GWT.create(DMPService.class);
        placeController = new PlaceController((com.google.gwt.event.shared.EventBus) eventBus);
        eventService = RemoteEventServiceFactory.getInstance().getRemoteEventService();
        commsController = new CommsController(this);
        activityMapper = new MvwActivityMapper(this);
        activityManager = new ActivityManager(activityMapper, eventBus);
        historyMapper = GWT.create(ContactAppPlaceHistoryMapper.class);
        historyHandler = new PlaceHistoryHandler(historyMapper);
        ContactAppControllerRCI = new ContactAppController(this);
    }

    @Override
    public ContactAppController getContactAppControllerRCI(){
        return(ContactAppControllerRCI);
    }

    @Override
    public ContactListPresenter getContactListPresenterRCI(){
        return(new ContactListPresenter(this));
    }

    @Override
    public ContactListView getContactListViewRCI(ContactListView.ContactListViewPresenter presenter){
        ContactListView view = new ContactListView(this);
        view.setPresenter(presenter);
        return(view);
    }

    @Override
    public EditContactView getEditContactViewRCI(EditContactView.EditContactViewPresenter presenter){
        EditContactView view = new EditContactView(this);
        view.setPresenter(presenter);
        return(view);
    }

    @Override
    public LoginView getLoginViewRCI(LoginView.LoginViewPresenter presenter){
        LoginView view = new LoginView();
        view.setPresenter(presenter);
        return(view);
    }

    @Override
    public ActivityManager getActivityManager(){
        return(activityManager);
    }

    @Override
    public MvwActivityMapper getActivityMapper(){
        return(activityMapper);
    }

    @Override
    public CommsController getCommsController(){
        return(commsController);
    }

    @Override
    public DMPServiceAsync getDmpConnection(){
        return(dmpConnection);
    }

    @Override
    public EventBus getEventBus(){
        return(eventBus);
    }

    @Override
    public RemoteEventService getEventService(){
        return(eventService);
    }

    @Override
    public PlaceHistoryHandler getHistoryHandler(){
        return(historyHandler);
    }

    @Override
    public ContactAppPlaceHistoryMapper getHistoryMapper(){
        return(historyMapper);
    }

    @Override
    public PlaceController getPlaceController(){
        return(placeController);
    }

}

