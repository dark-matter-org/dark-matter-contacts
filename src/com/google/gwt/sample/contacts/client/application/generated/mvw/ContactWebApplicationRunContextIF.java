package com.google.gwt.sample.contacts.client.application.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:83)
import com.google.gwt.activity.shared.ActivityManager;                                                                         // Used by activityManager - (RunContextItem.java:428)
import com.google.gwt.place.shared.PlaceHistoryHandler;                                                                        // Used by historyHandler - (RunContextItem.java:428)
import com.google.gwt.sample.contacts.client.application.extended.ContactAppController;                                        // Used by ContactAppControllerRCI - (RunContextItem.java:428)
import com.google.gwt.sample.contacts.client.application.generated.mvw.ContactsappRunContextIF;                                // Contactsapp run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.application.generated.mvw.places.ContactWebApplicationPlaceHistoryMapper;         // Used by historyMapper - (RunContextItem.java:428)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListView;                              // Used by ContactListViewRCI - (RunContextItem.java:416)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                            // Contacts run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;          // Asynchronous creation of ContactListPresenter - (RunContextItem.java:422)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewIF;                         // The ContactListView - (RunContextItem.java:415)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewAsyncIF;                    // Asynchronous creation of  EditContactView - (RunContextItem.java:412)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF;                         // The EditContactView - (RunContextItem.java:411)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.resources.Images;                                              // Used by images - (RunContextItem.java:428)
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.LoginView;                                               // Used by LoginViewRCI - (RunContextItem.java:416)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.LoginRunContextIF;                                  // Login run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewIF;                                  // The LoginView - (RunContextItem.java:415)
import de.novanic.eventservice.client.event.RemoteEventService;                                                                // Used by eventService - (RunContextItem.java:428)
import org.dmd.dmp.client.DMPServiceAsync;                                                                                     // Used by dmpConnection - (RunContextItem.java:428)
import org.dmd.mvw.client.gxt.cache.GxtCache;                                                                                  // Used by gxtCache - (RunContextItem.java:428)
import org.dmd.mvw.client.gxt.generated.mvw.GxtRunContextIF;                                                                   // Gxt run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                                               // Used by activityMapper - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;                                                                          // Used by centralAsyncErrorHandler - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                         // Used by placeController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.MvwEventBus;                                                                                     // Used by eventBus - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                   // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                   // Used by commsController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                         // Mvwcomms run context - (RunContextItem.java:405)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:85)
public interface ContactWebApplicationRunContextIF extends ContactsRunContextIF, ContactsappRunContextIF, GxtRunContextIF, LoginRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public ContactAppController                    getContactAppControllerRCI();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:207)
    public void                                    getContactListPresenterRCI(ContactListPresenterAsyncIF requester);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:200)
    public ContactListView                         getContactListViewRCI(ContactListViewIF.ContactListViewPresenterIF presenter);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:196)
    public void                                    getEditContactViewRCI(EditContactViewIF.EditContactViewPresenterIF presenter, EditContactViewAsyncIF requester);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:200)
    public LoginView                               getLoginViewRCI(LoginViewIF.LoginViewPresenterIF presenter);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public ActivityManager                         getActivityManager();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwActivityMapper                       getActivityMapper();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwAsyncErrorHandlerIF                  getCentralAsyncErrorHandler();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public CommsController                         getCommsController();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public DMPServiceAsync                         getDmpConnection();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwEventBus                             getEventBus();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public RemoteEventService                      getEventService();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public GxtCache                                getGxtCache();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public PlaceHistoryHandler                     getHistoryHandler();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public ContactWebApplicationPlaceHistoryMapper getHistoryMapper();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public Images                                  getImages();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwAsyncPlaceController                 getPlaceController();

}

