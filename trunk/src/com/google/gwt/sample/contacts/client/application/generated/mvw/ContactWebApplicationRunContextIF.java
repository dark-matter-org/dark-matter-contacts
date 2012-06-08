package com.google.gwt.sample.contacts.client.application.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:68)
import com.google.gwt.activity.shared.ActivityManager;                                                                         // Used by activityManager - (RunContextItem.java:320)
import com.google.gwt.place.shared.PlaceHistoryHandler;                                                                        // Used by historyHandler - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.application.extended.ContactAppController;                                        // Used by ContactAppControllerRCI - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.application.generated.mvw.ContactsappRunContextIF;                                // Contactsapp run context - (RunContextItem.java:310)
import com.google.gwt.sample.contacts.client.application.generated.mvw.places.ContactWebApplicationPlaceHistoryMapper;         // Used by historyMapper - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;                                 // Used by EditContactViewRCI - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                              // Used by ContactListViewRCI - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                            // Contacts run context - (RunContextItem.java:310)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;          // Asynchronous creation of ContactListPresenter - (RunContextItem.java:317)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                         // The ContactListView - (RunContextItem.java:313)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                         // The EditContactView - (RunContextItem.java:313)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.resources.Images;                                              // Used by images - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.LoginView;                                               // Used by LoginViewRCI - (RunContextItem.java:320)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                                  // Login run context - (RunContextItem.java:310)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                                  // The LoginView - (RunContextItem.java:313)
import de.novanic.eventservice.client.event.RemoteEventService;                                                                // Used by eventService - (RunContextItem.java:320)
import org.dmd.dmp.client.DMPServiceAsync;                                                                                     // Used by dmpConnection - (RunContextItem.java:320)
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                                  // Used by gxtCache - (RunContextItem.java:320)
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                                   // Gxt run context - (RunContextItem.java:310)
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                                               // Used by activityMapper - (RunContextItem.java:320)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;                                                                          // Used by centralAsyncErrorHandler - (RunContextItem.java:320)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                         // Used by placeController - (RunContextItem.java:320)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                     // Used by eventBus - (RunContextItem.java:320)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                   // Mvw run context - (RunContextItem.java:310)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                   // Used by commsController - (RunContextItem.java:320)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                         // Mvwcomms run context - (RunContextItem.java:310)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:70)
public interface ContactWebApplicationRunContextIF extends ContactsRunContextIF, ContactsappRunContextIF, GxtRunContextIF, LoginRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    public ContactAppController                    getContactAppControllerRCI();
    public void                                    getContactListPresenterRCI(ContactListPresenterAsyncIF requester);
    public ContactListView                         getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);
    public EditContactView                         getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter);
    public LoginView                               getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter);
    public ActivityManager                         getActivityManager();
    public MvwActivityMapper                       getActivityMapper();
    public MvwAsyncErrorHandlerIF                  getCentralAsyncErrorHandler();
    public CommsController                         getCommsController();
    public DMPServiceAsync                         getDmpConnection();
    public MvwEventBus                             getEventBus();
    public RemoteEventService                      getEventService();
    public GxtCache                                getGxtCache();
    public PlaceHistoryHandler                     getHistoryHandler();
    public ContactWebApplicationPlaceHistoryMapper getHistoryMapper();
    public Images                                  getImages();
    public MvwAsyncPlaceController                 getPlaceController();
}

