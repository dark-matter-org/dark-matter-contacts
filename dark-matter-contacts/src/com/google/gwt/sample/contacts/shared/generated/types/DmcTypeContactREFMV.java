package com.google.gwt.sample.contacts.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeContactREFMV provides storage for a multi-valued ContactREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1841)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:484)
 */
@SuppressWarnings("serial")
public class DmcTypeContactREFMV extends DmcTypeContactREF implements Serializable {
    
    ArrayList<ContactREF> value;
    
    public DmcTypeContactREFMV(){
    
    }
    
    public DmcTypeContactREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeContactREFMV getNew(){
        return(new DmcTypeContactREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<ContactREF> cloneIt(){
        DmcTypeContactREFMV rc = getNew();
        for(ContactREF val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ContactREF add(Object v) throws DmcValueException {
        ContactREF rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<ContactREF>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public ContactREF del(Object v){
        ContactREF rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    @Override
    public Iterator<ContactREF> getMV(){
        ArrayList<ContactREF> clone = new ArrayList<ContactREF>(value);
        return(clone.iterator());
    }
    
    public ArrayList<ContactREF> getMVCopy(){
        ArrayList<ContactREF> clone = new ArrayList<ContactREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ContactREF getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ContactREF val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}

