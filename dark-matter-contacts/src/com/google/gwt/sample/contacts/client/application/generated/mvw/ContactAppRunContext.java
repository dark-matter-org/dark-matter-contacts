package com.google.gwt.sample.contacts.client.application.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:99)
import com.google.gwt.activity.shared.ActivityManager;                                                              // Used by activityManager
import com.google.gwt.core.client.GWT;                                                                              // Used by dmpConnection
import com.google.gwt.event.shared.EventBus;                                                                        // Used by eventBus
import com.google.gwt.place.shared.PlaceController;                                                                 // Used by placeController
import com.google.gwt.place.shared.PlaceHistoryHandler;                                                             // Used by historyHandler
import com.google.gwt.sample.contacts.client.application.extended.ContactAppController;                             // Used by ContactAppControllerRCI
import com.google.gwt.sample.contacts.client.application.generated.mvw.ContactsappRunContextIF;                     // Contactsapp run context
import com.google.gwt.sample.contacts.client.application.generated.mvw.places.ContactAppPlaceHistoryMapper;         // Used by historyMapper
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                      // Used by EditContactViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListPresenter;              // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                   // Used by ContactListViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                 // Contacts run context
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;              // The ContactListView
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;              // The EditContactView
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.resources.Images;                                   // Used by images
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.login.LoginView;                              // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                       // Login run context
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                       // The LoginView
import de.novanic.eventservice.client.event.RemoteEventService;                                                     // Used by eventService
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;                                              // Used by eventService
import org.dmd.dmp.client.DMPService;                                                                               // Used by dmpConnection
import org.dmd.dmp.client.DMPServiceAsync;                                                                          // Used by dmpConnection
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                                    // Used by activityMapper
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                          // Used by eventBus
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                        // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                        // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                              // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatImplementation(RunContextFormatter.java:101)
public class ContactAppRunContext implements ContactsRunContextIF, ContactsappRunContextIF, LoginRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    // Defined in module: mvw
    private final EventBus                     eventBus;

    // Defined in module: mvwcomms
    private final DMPServiceAsync              dmpConnection;

    // Defined in module: mvw
    private final PlaceController              placeController;

    // Defined in module: mvwcomms
    private final RemoteEventService           eventService;

    // Defined in module: mvwcomms
    private final CommsController              commsController;

    // Defined in module: mvw
    private final MvwActivityMapper            activityMapper;

    // Defined in module: mvw
    private final ActivityManager              activityManager;

    // Defined in module: contactsapp
    private final ContactAppPlaceHistoryMapper historyMapper;

    // Defined in module: mvw
    private final PlaceHistoryHandler          historyHandler;

    // Defined in module: contactsapp
    private final ContactAppController         ContactAppControllerRCI;

    // Defined in module: contacts
    private final Images                       images;


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
        images                  = GWT.create(Images.class);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public ContactAppController getContactAppControllerRCI(){
        return(ContactAppControllerRCI);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:146)
    @Override
    public ContactListPresenter getContactListPresenterRCI(){
        return(new ContactListPresenter());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:169)
    @Override
    public ContactListView getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter){
        ContactListView view = new ContactListView(presenter, this);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:169)
    @Override
    public EditContactView getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter){
        EditContactView view = new EditContactView(presenter, this);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:169)
    @Override
    public LoginView getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter){
        LoginView view = new LoginView(presenter);
        return(view);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public ActivityManager getActivityManager(){
        return(activityManager);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public MvwActivityMapper getActivityMapper(){
        return(activityMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public CommsController getCommsController(){
        return(commsController);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public DMPServiceAsync getDmpConnection(){
        return(dmpConnection);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public EventBus getEventBus(){
        return(eventBus);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public RemoteEventService getEventService(){
        return(eventService);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public PlaceHistoryHandler getHistoryHandler(){
        return(historyHandler);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public ContactAppPlaceHistoryMapper getHistoryMapper(){
        return(historyMapper);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public Images getImages(){
        return(images);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getImplMethod(RunContextItem.java:189)
    @Override
    public PlaceController getPlaceController(){
        return(placeController);
    }

}

