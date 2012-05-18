package com.google.gwt.sample.contacts.client.application.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:68)
import com.google.gwt.activity.shared.ActivityManager;                                                              // Used by activityManager
import com.google.gwt.event.shared.EventBus;                                                                        // Used by eventBus
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
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.LoginView;                                    // Used by LoginViewRCI
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                       // Login run context
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                       // The LoginView
import de.novanic.eventservice.client.event.RemoteEventService;                                                     // Used by eventService
import org.dmd.dmp.client.DMPServiceAsync;                                                                          // Used by dmpConnection
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                       // Used by gxtCache
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                        // Gxt run context
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                                    // Used by activityMapper
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;                                                               // Used by centralAsyncErrorHandler
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                              // Used by placeController
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                        // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                        // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                              // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:70)
public interface ContactAppRunContextIF extends ContactsRunContextIF, ContactsappRunContextIF, GxtRunContextIF, LoginRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    public ContactAppController         getContactAppControllerRCI();
    public ContactListPresenter         getContactListPresenterRCI();
    public ContactListView              getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);
    public EditContactView              getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter);
    public LoginView                    getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter);
    public ActivityManager              getActivityManager();
    public MvwActivityMapper            getActivityMapper();
    public MvwAsyncErrorHandlerIF       getCentralAsyncErrorHandler();
    public CommsController              getCommsController();
    public DMPServiceAsync              getDmpConnection();
    public EventBus                     getEventBus();
    public RemoteEventService           getEventService();
    public GxtCache                     getGxtCache();
    public PlaceHistoryHandler          getHistoryHandler();
    public ContactAppPlaceHistoryMapper getHistoryMapper();
    public Images                       getImages();
    public MvwAsyncPlaceController      getPlaceController();
}

