package com.google.gwt.sample.contacts.client.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:36)
import com.google.gwt.place.shared.PlaceTokenizer;                                            // Tokenizer interface
import com.google.gwt.place.shared.Prefix;                                                    // Required for Prefix annotation
import com.google.gwt.sample.contacts.client.extended.activities.EditContactActivity;         // Runs this activity
import org.dmd.mvw.client.mvw.MvwPlace;                                                       // Our base class
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                  // Needed to construct activity

public class EditPlace extends MvwPlace {

    public EditPlace(String t){
        super(t);
    }

    @Prefix(value = "edit")
    public static class Tokenizer implements PlaceTokenizer<EditPlace> {
    
        @Override
        public String getToken(EditPlace place){
            return(place.getToken());
        }

        @Override
        public EditPlace getPlace(String t){
            return(new EditPlace(t));
        }
    }

    public EditContactActivity getActivity(MvwRunContextIF context){
        return( new EditContactActivity(context));
    }

}

