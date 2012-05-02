package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:134)
import com.google.gwt.activity.shared.AbstractActivity;              // Is abstract activity
import com.google.gwt.place.shared.PlaceController;                  // Used by placeController
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;         // Mvw run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ActivityFormatter.formatActivity(ActivityFormatter.java:23)
abstract public class ListContactsActivityBaseImpl extends AbstractActivity  {

    protected final PlaceController placeController;

    public ListContactsActivityBaseImpl(MvwRunContextIF rc){
        placeController = ((MvwRunContextIF)rc).getPlaceController();

    }

}

