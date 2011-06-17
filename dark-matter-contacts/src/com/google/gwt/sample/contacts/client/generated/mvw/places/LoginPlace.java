package com.google.gwt.sample.contacts.client.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:35)
import com.google.gwt.place.shared.PlaceTokenizer;                                             // Tokenizer interface
import com.google.gwt.sample.contacts.client.extended.activities.PerformLoginActivity;         // Runs this activity
import org.dmd.mvw.client.mvw.MvwPlace;                                                        // Our base class
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                   // Needed to construct activity

public class LoginPlace extends MvwPlace {

    public LoginPlace(String t){
        super(t);
    }

    public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
    
        @Override
        public String getToken(LoginPlace place){
            return(place.getToken());
        }

        @Override
        public LoginPlace getPlace(String t){
            return(new LoginPlace(t));
        }
    }

    public PerformLoginActivity getActivity(MvwRunContextIF context){
        return( new PerformLoginActivity(context));
    }

}

