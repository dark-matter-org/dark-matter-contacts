package com.google.gwt.sample.contacts;

import java.io.File;
import java.util.UUID;

import org.dmd.dmc.types.UUIDName;
import org.junit.*;

/**
 * The ContactsTest class serves as a base for all of our tests and provides some useful helper functions.
 */
public class ContactsTest {
	
	static boolean initialized = false;
	static File	temp;

	@Before
	public void setUp() throws Exception {
		if (!initialized){
		}
	}
	
	/**
	 * Creates a new random UUIDName.
	 * @return
	 */
	protected UUIDName getUUIDName(){
		UUID uuid = UUID.randomUUID();
		return(new UUIDName(uuid.getMostSignificantBits(),uuid.getLeastSignificantBits()));
	}
}
