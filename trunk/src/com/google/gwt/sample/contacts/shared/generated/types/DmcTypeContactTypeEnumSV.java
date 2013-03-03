package com.google.gwt.sample.contacts.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import com.google.gwt.sample.contacts.shared.generated.enums.ContactTypeEnum;    // DmcType import
/**
 * The DmcTypeContactTypeEnumSV provides storage for a single-valued ContactTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1955)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:360)
 */
@SuppressWarnings("serial")
public class DmcTypeContactTypeEnumSV extends DmcTypeContactTypeEnum implements Serializable {
    
    protected ContactTypeEnum value;
    
    public DmcTypeContactTypeEnumSV(){
    
    }
    
    public DmcTypeContactTypeEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeContactTypeEnumSV getNew(){
        return(new DmcTypeContactTypeEnumSV(getAttributeInfo()));
    }
    
    public DmcTypeContactTypeEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeContactTypeEnumSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1987)
    public DmcAttribute<ContactTypeEnum> cloneIt(){
        DmcTypeContactTypeEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1998)
    public ContactTypeEnum getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2010)
    public ContactTypeEnum set(Object v) throws DmcValueException {
        ContactTypeEnum rc = typeCheck(v);
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
    public ContactTypeEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

