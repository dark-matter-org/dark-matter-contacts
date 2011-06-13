package com.google.gwt.sample.contacts.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.sample.contacts.client.extended.ContactApp;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Dark_matter_contacts implements EntryPoint {
	
	ContactApp	app;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		app = new ContactApp();
		
		app.run();
	}
}
