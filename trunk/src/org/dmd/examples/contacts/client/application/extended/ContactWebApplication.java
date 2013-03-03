package org.dmd.examples.contacts.client.application.extended;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;
import org.dmd.examples.contacts.client.application.MainDisplay;
import org.dmd.examples.contacts.client.application.generated.mvw.ContactWebApplicationBaseImpl;
import org.dmd.examples.contacts.client.application.generated.mvw.ContactWebApplicationRunContextIF;
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;
import org.dmd.examples.contacts.shared.generated.dmo.ContactsDMSAG;

import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ContactWebApplication extends ContactWebApplicationBaseImpl {

	MainDisplay display;
	
	public ContactWebApplication(ContactWebApplicationRunContextIF carc){
		super();
		display = new MainDisplay();
		
		// Load our schemas
		DmcOmni.instance().addCompactSchema(DmrBaseDMSAG.instance());
		DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());
		DmcOmni.instance().addCompactSchema(ContactsDMSAG.instance());
	}

	public ContactWebApplication(){
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
