package com.google.gwt.sample.contacts.shared.generated.types;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.UUIDName;    // key type import
/**
 * The DmcTypeContactREFMAP provides storage for a map of ContactREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2239)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:493)
 */
@SuppressWarnings("serial")
// public class DmcTypeContactREFMAP extends DmcTypeContactREF<ContactREF,UUIDName> {
public class DmcTypeContactREFMAP extends DmcTypeContactREF implements Serializable {
    
    Map<UUIDName,ContactREF> value;
    
    public DmcTypeContactREFMAP(){
        value = null;
    }
    
    public DmcTypeContactREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<UUIDName,ContactREF>();
        else
            value = new TreeMap<UUIDName,ContactREF>();
    }
    
    @Override
    public DmcTypeContactREFMAP getNew(){
        return(new DmcTypeContactREFMAP(attrInfo));
    }
    
    @Override
    public DmcAttribute<ContactREF> cloneIt(){
        DmcTypeContactREFMAP rc = getNew();
        for(ContactREF val: value.values())
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public ContactREF add(Object v) throws DmcValueException {
        ContactREF newval = typeCheck(v);
        if (value == null)
            initValue();
        UUIDName key = (UUIDName)((DmcMappedAttributeIF)newval).getKey();
        ContactREF oldval = value.put(key,newval);
        
        if (oldval != null){
            // We had a value with this key, ensure that the value actually changed
            if (oldval.valuesAreEqual(newval))
                newval = null;
        }
        
        return(newval);
    }
    
    @Override
    public ContactREF del(Object key){
        if (key instanceof UUIDName)
            return(value.remove(key));
        else
            throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public Iterator<ContactREF> getMV(){
        Map<UUIDName,ContactREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<UUIDName,ContactREF>(value);
        else
            clone = new TreeMap<UUIDName,ContactREF>(value);
        return(clone.values().iterator());
    }
    
    public Map<UUIDName,ContactREF> getMVCopy(){
        Map<UUIDName,ContactREF> clone = null;
        if (attrInfo.valueType == ValueTypeEnum.HASHMAPPED)
            clone = new HashMap<UUIDName,ContactREF>(value);
        else
            clone = new TreeMap<UUIDName,ContactREF>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public ContactREF getByKey(Object key){
        if (key instanceof UUIDName)
            return(value.get(key));
        else
            throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
    }
    
    @Override
    public boolean contains(Object v){
        boolean rc = false;
        try {
            ContactREF val = typeCheck(v);
            rc = value.containsValue(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
    @Override
    public boolean containsKey(Object key){
        boolean rc = false;
        if (key instanceof UUIDName)
            rc = value.containsKey(key);
        return(rc);
    }
    
}

