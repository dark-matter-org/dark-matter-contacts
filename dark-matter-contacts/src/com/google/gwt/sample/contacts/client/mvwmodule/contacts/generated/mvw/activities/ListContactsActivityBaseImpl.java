package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:134)
import com.google.gwt.activity.shared.AbstractActivity;                                                        // Is abstract activity
import com.google.gwt.place.shared.PlaceController;                                                            // Used by placeController
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ContactListPresenter;         // Used by ContactListPresenterRCI
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.ContactsRunContextIF;            // Contacts run context
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                                                   // Used by commsController
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                                         // Mvwcomms run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class ListContactsActivityBaseImpl extends AbstractActivity  {

    private ContactListPresenter ContactListPresenterRCI;
    protected final CommsController commsController;
    protected final PlaceController placeController;

    MvwRunContextIF runcontext;

    public ListContactsActivityBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        placeController = ((MvwRunContextIF)rc).getPlaceController();

        runcontext = rc;

    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getOnDemandMethod(RunContextItem.java:123)
    public ContactListPresenter getContactListPresenter(){
        return( ((ContactsRunContextIF)runcontext).getContactListPresenterRCI());
    }

}

