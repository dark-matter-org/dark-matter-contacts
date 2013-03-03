package org.dmd.examples.contacts.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.UUIDName;

import org.dmd.examples.contacts.shared.generated.types.ContactREF;

import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;

/**
 * This is the generated DmcAttribute derivative for values of type Contact
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeContactREF extends DmcTypeNamedObjectREF<ContactREF, UUIDName> {

    public DmcTypeContactREF(){
    
    }

    public DmcTypeContactREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected ContactREF getNewHelper(){
        return(new ContactREF());
    }

    @Override
    protected UUIDName getNewName(){
        return(new UUIDName());
    }

    @Override
    protected String getDMOClassName(){
        return( ContactDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ContactDMO)
            return(true);
        return(false);
    }

    @Override
    protected ContactREF typeCheck(Object value) throws DmcValueException {
        ContactREF rc = null;

        if (value instanceof ContactREF)
            rc = (ContactREF)value;
        else if (value instanceof ContactDMO)
            rc = new ContactREF((ContactDMO)value);
        else if (value instanceof UUIDName)
            rc = new ContactREF((UUIDName)value);
        else if (value instanceof String)
            rc = new ContactREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ContactREF, ContactDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ContactREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ContactREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ContactREF rc = new ContactREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ContactREF cloneValue(ContactREF value){
        return(new ContactREF(value));
    }



}
