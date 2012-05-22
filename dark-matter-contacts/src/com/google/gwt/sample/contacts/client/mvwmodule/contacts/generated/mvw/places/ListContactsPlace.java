package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Place.getImports(Place.java:46)
import com.google.gwt.activity.shared.Activity;                                                                // So we can return an Activity - Place.java:33
import com.google.gwt.core.client.GWT;                                                                         // Access to runAsynch() - Place.java:31
import com.google.gwt.core.client.RunAsyncCallback;                                                            // Handling runAsync() results - Place.java:32
import com.google.gwt.place.shared.PlaceTokenizer;                                                             // Tokenizer interface - Place.java:39
import com.google.gwt.place.shared.Prefix;                                                                     // Required for Prefix annotation - Place.java:27
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ListContactsActivity;         // Runs this activity - Place.java:41
import org.dmd.mvw.client.mvw.MvwAsyncPlace;                                                                   // Our base class - Place.java:34
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;                                                         // Handles our asynch callback that the activity is ready - Place.java:35
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                   // Needed to construct activity - Place.java:28

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatAsynchPlace(PlaceFormatter.java:77)
public class ListContactsPlace extends MvwAsyncPlace {

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

    public Activity getActivity(MvwRunContextIF context){
        return(activity);
    }

    public void initActivity(final MvwAsyncPlaceController apc, final MvwRunContextIF context){
        final MvwAsyncPlace thisPlace = this;
        GWT.runAsync(new RunAsyncCallback() {
        	
        	@Override
        	public void onSuccess() {
        		activity = new ListContactsActivity(context);
        		apc.asyncPlaceReady(thisPlace);
        	}
        	
        	@Override
        	public void onFailure(Throwable reason) {
        		context.getCentralAsyncErrorHandler().handleAsyncCodeError("com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing.ListContactsActivity",reason);
        	}
        });
        
    }

}

