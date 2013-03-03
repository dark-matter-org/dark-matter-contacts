package org.dmd.examples.contacts.shared.generated.types;

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
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2828)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeContactREFMAP extends DmcTypeContactREF<ContactREF,UUIDName> {
public class DmcTypeContactREFMAP extends DmcTypeContactREF implements Serializable {
    
    private final static Iterator<ContactREF> emptyList = (new HashMap<UUIDName,ContactREF>()).values().iterator();
    
    protected Map<UUIDName,ContactREF> value;
    
    public DmcTypeContactREFMAP(){
        value = null;
    }
    
    public DmcTypeContactREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<UUIDName,ContactREF>();
        else
            value = new TreeMap<UUIDName,ContactREF>();
    }
    
    public UUIDName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<UUIDName,ContactREF> map = (TreeMap<UUIDName,ContactREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeContactREFMAP getNew(){
        return(new DmcTypeContactREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2885)
    public DmcAttribute<ContactREF> cloneIt(){
        synchronized(this){
            DmcTypeContactREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ContactREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2905)
    public ContactREF add(Object v) throws DmcValueException {
        synchronized(this){
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
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2926)
    public ContactREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof UUIDName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2942)
    public Iterator<ContactREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<UUIDName,ContactREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<UUIDName,ContactREF>(value);
            else
                clone = new TreeMap<UUIDName,ContactREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2959)
    public Map<UUIDName,ContactREF> getMVCopy(){
        synchronized(this){
            Map<UUIDName,ContactREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<UUIDName,ContactREF>();
                else
                    clone = new HashMap<UUIDName,ContactREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<UUIDName,ContactREF>();
                else
                    clone = new TreeMap<UUIDName,ContactREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2980)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2992)
    public ContactREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof UUIDName)
                return(value.get((UUIDName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3007)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                ContactREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof UUIDName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

