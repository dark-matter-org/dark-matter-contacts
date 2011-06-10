package com.google.gwt.sample.contacts.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.sample.contacts.client.generated.mvw.ContactAppRunContext;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Dark_matter_contacts implements EntryPoint {

	ContactAppRunContext	runContext;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		runContext = new ContactAppRunContext();
		
	}
}
