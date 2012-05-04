package com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:36)
import com.google.gwt.place.shared.PlaceTokenizer;                                                  // Tokenizer interface
import com.google.gwt.place.shared.Prefix;                                                          // Required for Prefix annotation
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.PerformLoginActivity;         // Runs this activity
import org.dmd.mvw.client.mvw.MvwPlace;                                                             // Our base class
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                        // Needed to construct activity

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatPlace(PlaceFormatter.java:26)
public class LoginPlace extends MvwPlace {

    public LoginPlace(String t){
        super(t);
    }

    @Prefix(value = "login")
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

