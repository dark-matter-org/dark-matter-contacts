package com.google.gwt.sample.contacts.client.extended.activities;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.sample.contacts.client.extended.views.LoginView;
import com.google.gwt.sample.contacts.client.generated.mvw.activities.PerformLoginActivityBaseImpl;
import com.google.gwt.sample.contacts.client.generated.mvw.places.ListContactsPlace;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class PerformLoginActivity extends PerformLoginActivityBaseImpl {
	
	LoginView	loginView;
	Logger 		logger;

	public PerformLoginActivity(MvwRunContextIF rc) {
		super(rc);
		logger = Logger.getLogger("dmcontacts");
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		logger.log(Level.INFO, "Login activity has been started.");
		
		if (loginView == null){
			logger.log(Level.INFO, "Creating view.");
			loginView = getNewLoginView(this);
		}
		
		loginView.displayFeedback("Please enter your user name and password");
		panel.setWidget(loginView);
	}

	@Override
	protected void handleLoginResponse(LoginResponseDMO response) {
		loginView.displayFeedback("Login succeeded");
		
		// Move on to display the contacts
		try {
			placeController.goTo(new ListContactsPlace(""));
		}
		catch(UmbrellaException ex){
			for(Throwable t: ex.getCauses()){
				System.out.println(extractTheStack(t));
			}
		}
	}
	
    /**
     * A convenience function to extract the stack from an exception as a string.
     */
    public static String extractTheStack(Throwable ex){
    	StringBuilder sb = new StringBuilder();
    	StackTraceElement[] elements =  ex.getStackTrace();
    	for(int i=0; i<elements.length; i++){
    		sb.append(elements[i].toString() + "\n");
    	}
        return(sb.toString());
    }


	@Override
	public void onLoginEvent(String username, String password) {
		loginView.displayFeedback("Logging in...");
		
		LoginRequestDMO request = getLoginRequest();
		request.setUserName(username);
		request.setPassword(password);
		request.setTrackingEnabled(true);
		
		sendLoginRequest(request);
	}

	@Override
	protected void handleLoginResponseError(LoginResponseDMO response) {
		loginView.setPassword("");
		loginView.displayError("Login failed");
	}

	@Override
	public String mayStop(){
		logger.log(Level.INFO, "PerformLoginActivity.mayStop()");
		return(null);
	}
}
