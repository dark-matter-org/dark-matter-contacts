package com.google.gwt.sample.contacts.server.plugins;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

import com.google.gwt.sample.contacts.server.generated.ContactsSchemaAG;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;

/**
 * The ContactsPlugin provides an example of extending the basic capabilities of
 * the DMP Servlet Reference Implementation. 
 */
public class ContactsPlugin extends DmpServletPlugin {
	
	public ContactsPlugin(){
	}
	
	@Override
	public void preInit() throws DmcValueException, ResultException{
		DebugInfo.debug("ContactsPlugin.preInit()");
		
		// Add our schema
		ContactsSchemaAG contacts = new ContactsSchemaAG();
		pluginManager.getSchema().manageSchema(contacts);
		
		// Indicate that we need to index our Contact entries
		cache.maintainIndex(ContactsDMSAG.__Contact);
	}
	
	@Override
	public void init(){
		if (cache.getIndexSize(ContactsDMSAG.__Contact) == 0){
			DebugInfo.debug("We have no Contact instances, we'll create some...");
		}
		else{
			DebugInfo.debug("We have " + cache.getIndexSize(ContactsDMSAG.__Contact) + " Contacts");
		}
	}

}
