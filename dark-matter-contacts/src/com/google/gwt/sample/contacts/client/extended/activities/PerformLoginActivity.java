package com.google.gwt.sample.contacts.client.extended.activities;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.sample.contacts.client.extended.views.LoginView;
import com.google.gwt.sample.contacts.client.generated.mvw.activities.PerformLoginActivityBaseImpl;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class PerformLoginActivity extends PerformLoginActivityBaseImpl {
	
	LoginView	loginView;

	public PerformLoginActivity(MvwRunContextIF rc) {
		super(rc);
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "Login activity has been started.");
		
		if (loginView == null){
			logger.log(Level.INFO, "Creating view.");
			loginView = new LoginView();
			loginView.setPresenter(this);
		}
		
		panel.setWidget(loginView);
	}

	@Override
	protected void handleLoginResponse(LoginResponseDMO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoginEvent(String username, String password) {
		// TODO Auto-generated method stub
		
	}


}