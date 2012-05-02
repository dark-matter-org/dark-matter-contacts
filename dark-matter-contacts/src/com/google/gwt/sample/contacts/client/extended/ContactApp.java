package com.google.gwt.sample.contacts.client.extended;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;

import com.google.gwt.sample.contacts.client.application.MainDisplay;
import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppBaseImpl;
import com.google.gwt.sample.contacts.client.generated.mvw.places.LoginPlace;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ContactApp extends ContactAppBaseImpl {
	
	MainDisplay display;
	
	public ContactApp(){
		super();
		display = new MainDisplay();
		
		// Load our schemas
		DmcOmni.instance().addCompactSchema(DmrBaseDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(ContactsDMSAG.instance());
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
