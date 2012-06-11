package com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:60)
import com.google.gwt.place.shared.PlaceTokenizer;                                                  // Tokenizer interface - (Place.java:53)
import com.google.gwt.place.shared.Prefix;                                                          // Required for Prefix annotation - (Place.java:41)
import com.google.gwt.sample.contacts.client.mvwmodule.login.extended.PerformLoginActivity;         // Runs this activity - (Place.java:55)
import org.dmd.mvw.client.mvw.MvwPlace;                                                             // Our base class - (Place.java:52)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                        // Needed to construct activity - (Place.java:42)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatStandardPlace(PlaceFormatter.java:50)
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

