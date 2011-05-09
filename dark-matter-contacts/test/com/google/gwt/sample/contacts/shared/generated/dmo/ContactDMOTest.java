package com.google.gwt.sample.contacts.shared.generated.dmo;

import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.SetRequest;
import org.junit.Test;

import com.google.gwt.sample.contacts.ContactsTest;

public class ContactDMOTest extends ContactsTest {
	
	@Test
	public void testContactMissingMandatory(){
		ContactDMO dmo = new ContactDMO();
		
		try {
			dmo.validate();
			assertTrue("Exception for missing mandatory attributes should have been thrown",false);
		} catch (DmcValueExceptionSet e) {
			assertTrue("Exception should be thrown because of missing mandatory attributes.",true);
			System.out.println(e.toString());
		}
	}
	
	@Test
	public void testContactBasicValidation(){
		ContactDMO dmo = new ContactDMO();
		
		dmo.setUuidName(getUUIDName());
		dmo.setFirstName("Hollie");
		dmo.setLastName("Voss");
				
		try {
			dmo.validate();
			assertTrue("Basic validation should be true.",true);
		} catch (DmcValueExceptionSet e) {
			assertTrue("Exception should be thrown because of missing mandatory attributes.",true);
			System.out.println(e.toString());
		}
		
		System.out.println(dmo.toOIF());
	}
	
	@Test
	public void testContactSlicing() throws DmcValueException{
		ContactDMO heavy = new ContactDMO();
		
		heavy.setUuidName(getUUIDName());
		heavy.setFirstName("Hollie");
		heavy.setLastName("Voss");
		heavy.addUrlCE("http://example.com");
		heavy.addUrlCE("http://contacts.com");
		heavy.setBirthdayCE("19750804:000000");
		heavy.setEmailCE("holliev@example.com");
		heavy.setMiddleName("Margeurite");
		heavy.setNickName("vossie");
		heavy.setNotesCE("Kids are Jason and Amanda");
		heavy.setPhoneNumberCE("555-793-1212");
		heavy.setPrefixCE("Dr.");

		System.out.println(heavy);

		ContactDMO light = heavy.getSlice(ContactsASAG.__lightContact);
		
		System.out.println(light);
	}
	
	@Test
	public void testContactModRec() throws DmcValueException, DmcValueExceptionSet{
		ContactDMO contact = new ContactDMO();
		
		contact.setUuidName(getUUIDName());
		contact.setFirstName("Hollie");
		contact.setLastName("Voss");
		contact.addUrlCE("http://example.com");
		contact.addUrlCE("http://contacts.com");
		contact.setBirthdayCE("19750804:000000");
		contact.setEmailCE("holliev@example.com");
		contact.setMiddleName("Margeurite");
		contact.setNickName("vossie");
		contact.setTitleAndCompany("VP of Marketing at Examples");
		contact.setNotesCE("Kids are Jason and Amanda");
		contact.setPhoneNumberCE("555-793-1212");
		contact.setPrefixCE("Dr.");

		System.out.println(contact);

		ContactDMO modrec = contact.getModificationRecorder();
		
		modrec.setNickName("voster");
		modrec.setTitleAndCompany("CEO of Bigger and Better");
		modrec.setPhoneNumberCE("555-504-5656");
		modrec.remUrlCE();
		modrec.addUrlCE("http://www.bigger-better.com");
		
		SetRequest request = new SetRequest();
		request.setTarget(modrec.getObjectName());
		request.setModify(modrec.getModifier());
		
		System.out.println(request);
		
		contact.applyModifier(request.getModifyAttribute());
		
		System.out.println(contact);
		
		DMPEvent event = new DMPEvent(request);
		
		System.out.println(event);
	}
	
	
	

	
}
