package com.google.gwt.sample.contacts.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.sample.contacts.client.application.extended.ContactWebApplication;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Dark_matter_contacts implements EntryPoint {
	
	ContactWebApplication	app;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		System.out.println("appname     = " + Window.Navigator.getAppName());
		System.out.println("appcodename = " + Window.Navigator.getAppCodeName());
		System.out.println("useragent   = " + Window.Navigator.getUserAgent());
		System.out.println("platform    = " + Window.Navigator.getPlatform());
		
		app = new ContactWebApplication();
		
		app.run();
	}
}
