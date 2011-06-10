package com.google.gwt.sample.contacts.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO; // primitive type
import org.dmd.dmc.types.UUIDName;
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type Contact
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:381)
 */
@SuppressWarnings("serial")
public class ContactREF extends DmcNamedObjectNontransportableREF<ContactDMO> {

    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    
    DmcTypeUUIDNameSV myName;    
    
    public ContactREF(){
    }

    public ContactREF(ContactDMO o){
         object = o;
         myName = (DmcTypeUUIDNameSV)o.getObjectNameAttribute();
    }

    public ContactREF(UUIDName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeUUIDNameSV(__uuidName);
         myName.set(n);
    }

    public ContactREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeUUIDNameSV(__uuidName);
         myName.set(n);
    }

    public ContactREF(ContactREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(ContactDMO o){
         object = o;
         myName = (DmcTypeUUIDNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public ContactREF cloneMe(){
        ContactREF rc = new ContactREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeUUIDNameSV(__uuidName);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public UUIDName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeUUIDNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
