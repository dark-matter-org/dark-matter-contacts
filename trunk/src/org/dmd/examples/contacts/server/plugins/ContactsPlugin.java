package org.dmd.examples.contacts.server.plugins;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmw.DmwOmni;
import org.dmd.examples.contacts.server.generated.ContactsSchemaAG;
import org.dmd.examples.contacts.shared.generated.dmo.ContactsDMSAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;


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
		DmwOmni.instance().addSchema(contacts);
		
		// Indicate that we need to index our Contact entries
		cache.maintainIndex(ContactsDMSAG.__Contact);
		
		// Add a name generator for Contact objects
		cache.addNameGenerator(new ContactNameGenerator());
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
