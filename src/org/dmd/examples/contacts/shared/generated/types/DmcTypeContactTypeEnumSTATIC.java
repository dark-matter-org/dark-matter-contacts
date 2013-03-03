package org.dmd.examples.contacts.shared.generated.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.examples.contacts.shared.generated.enums.ContactTypeEnum;    // DmcType import

/**
 * The DmcTypeContactTypeEnumSTATIC provides static access to functions used to manage values of type ContactTypeEnum
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2130)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2045)
 */
public class DmcTypeContactTypeEnumSTATIC {
    
    public static DmcTypeContactTypeEnumSTATIC instance;
    static DmcTypeContactTypeEnumSV typeHelper;
    
    static {
        instance = new DmcTypeContactTypeEnumSTATIC();
    }
    
    protected DmcTypeContactTypeEnumSTATIC() {
        typeHelper = new DmcTypeContactTypeEnumSV();
    }
    
    public ContactTypeEnum typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public ContactTypeEnum cloneValue(ContactTypeEnum value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, ContactTypeEnum value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public ContactTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

