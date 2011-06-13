package com.google.gwt.sample.contacts.client.extended;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.sample.contacts.client.MainDisplay;
import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppBaseImpl;
import com.google.gwt.sample.contacts.client.generated.mvw.places.LoginPlace;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ContactApp extends ContactAppBaseImpl {
	
	MainDisplay display;
	
	public ContactApp(){
		super();
		display = new MainDisplay();
	}

	@Override
	public LoginPlace getDefaultPlace() {
		return(new LoginPlace(""));
	}

	@Override
	public AcceptsOneWidget getInitialWidget() {
		return(display);
	}

	@Override
	public void initialize() {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "Initialize has been called.");
	}


}
