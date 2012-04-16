package com.google.gwt.sample.contacts.server.plugins;

import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.util.exceptions.DebugInfo;

import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;

public class ContactsPlugin extends DmpServletPlugin {
	
	public ContactsPlugin(){
		
	}
	
	@Override
	public void preInit(){
		DebugInfo.debug("ContactsPlugin.preInit()");
		
		// Indicate that we need to index our Contact entries
		cache.maintainIndex(ContactsDMSAG.__Contact);
	}
	
	

}
