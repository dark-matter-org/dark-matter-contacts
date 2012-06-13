package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:157)
import com.google.gwt.activity.shared.AbstractActivity;                                                                       // Is abstract activity - (Activity.java:143)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;                           // Contacts run context - (RunContextItem.java:405)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.presenters.ContactListPresenterAsyncIF;         // Asynchronous creation of ContactListPresenter - (RunContextItem.java:422)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                                        // Used by placeController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                                  // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                                  // Used by commsController - (RunContextItem.java:428)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                                        // Mvwcomms run context - (RunContextItem.java:405)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:38)
abstract public class ListContactsActivityBaseImpl extends AbstractActivity implements ContactListPresenterAsyncIF {

    protected final CommsController commsController;
    protected final MvwAsyncPlaceController placeController;

    MvwRunContextIF runcontext;

    public ListContactsActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:155)
    public void getContactListPresenterAsync(){
        ((ContactsRunContextIF)runcontext).getContactListPresenterRCI(this);
    }

}

