package com.google.gwt.sample.contacts.client.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatAppRunContextInterface(RunContextFormatter.java:61)
import com.google.gwt.activity.shared.ActivityManager;                                                  // Used by activityManager
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
import org.dmd.dmp.client.DMPServiceAsync;                                                              // Used by dmpConnection
import org.dmd.mvw.client.mvw.MvwActivityMapper;                                                        // Used by activityMapper
import org.dmd.mvw.client.mvw.extended.controllers.MenuController;                                      // Used by MenuControllerRCI
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                            // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                            // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                  // Mvwcomms run context

public interface ContactAppRunContextIF extends ContactsRunContextIF, MvwRunContextIF, MvwcommsRunContextIF {

    public ContactAppController getContactAppControllerRCI();
    public ContactListPresenter getContactListPresenterRCI();
    public ContactListView getContactListViewRCI(ContactListView.ContactListViewPresenter presenter);
    public EditContactView getEditContactViewRCI(EditContactView.EditContactViewPresenter presenter);
    public LoginView getLoginViewRCI(LoginView.LoginViewPresenter presenter);
    public MenuController getMenuControllerRCI();
    public ActivityManager getActivityManager();
    public MvwActivityMapper getActivityMapper();
    public CommsController getCommsController();
    public DMPServiceAsync getDmpConnection();
    public EventBus getEventBus();
    public RemoteEventService getEventService();
    public PlaceHistoryHandler getHistoryHandler();
    public ContactAppPlaceHistoryMapper getHistoryMapper();
    public PlaceController getPlaceController();
}

