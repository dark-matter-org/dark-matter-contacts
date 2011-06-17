package com.google.gwt.sample.contacts.client.generated.mvw.places;


// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:35)
import com.google.gwt.place.shared.PlaceTokenizer;                                             // Tokenizer interface
import com.google.gwt.place.shared.Prefix;
import com.google.gwt.sample.contacts.client.extended.activities.ListContactsActivity;         // Runs this activity
import org.dmd.mvw.client.mvw.MvwPlace;                                                        // Our base class
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                   // Needed to construct activity

public class ListContactsPlace extends MvwPlace {

    public ListContactsPlace(String t){
        super(t);
    }

    @Prefix(value = "list") 
    public static class Tokenizer implements PlaceTokenizer<ListContactsPlace> {
    
        @Override
        public String getToken(ListContactsPlace place){
            return(place.getToken());
        }

        @Override
        public ListContactsPlace getPlace(String t){
            return(new ListContactsPlace(t));
        }
    }

    public ListContactsActivity getActivity(MvwRunContextIF context){
        return( new ListContactsActivity(context));
    }

}

