package com.google.gwt.sample.contacts.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeContactREFSV provides storage for a single-valued ContactREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1546)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:483)
 */
@SuppressWarnings("serial")
public class DmcTypeContactREFSV extends DmcTypeContactREF implements Serializable {
    
    ContactREF value;
    
    public DmcTypeContactREFSV(){
    
    }
    
    public DmcTypeContactREFSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeContactREFSV getNew(){
        return(new DmcTypeContactREFSV(attrInfo));
    }
    
    public DmcTypeContactREFSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeContactREFSV(ai));
    }
    
    @Override
    public DmcAttribute<ContactREF> cloneIt(){
        DmcTypeContactREFSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    @Override
    public ContactREF set(Object v) throws DmcValueException {
        ContactREF rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public ContactREF getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

