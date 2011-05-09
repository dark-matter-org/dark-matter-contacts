package com.google.gwt.sample.contacts.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The DmcTypeContactREFSTATIC provides static access to functions used to manage values of type ContactREF
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:1697)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1623)
 */
public class DmcTypeContactREFSTATIC {
    
    public static DmcTypeContactREFSTATIC instance;
    static DmcTypeContactREFSV typeHelper;
    
    static {
        instance = new DmcTypeContactREFSTATIC();
    }
    
    protected DmcTypeContactREFSTATIC() {
        typeHelper = new DmcTypeContactREFSV();
    }
    
    public ContactREF typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ContactREF cloneValue(ContactREF value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ContactREF value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ContactREF deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

