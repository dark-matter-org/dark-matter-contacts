package com.google.gwt.sample.contacts.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class ContactsASAG implements DmcAttributeSchemaIF {


    static String schemaName = "contacts";

    public final static DmcAttributeInfo __birthdayCE = new DmcAttributeInfo("birthdayCE", 1009, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __emailCE = new DmcAttributeInfo("emailCE", 1008, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __firstName = new DmcAttributeInfo("firstName", 1000, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __lastName = new DmcAttributeInfo("lastName", 1002, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __middleName = new DmcAttributeInfo("middleName", 1001, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __nickName = new DmcAttributeInfo("nickName", 1005, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __notesCE = new DmcAttributeInfo("notesCE", 1011, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __phoneNumberCE = new DmcAttributeInfo("phoneNumberCE", 1007, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __prefixCE = new DmcAttributeInfo("prefixCE", 1003, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __suffixCE = new DmcAttributeInfo("suffixCE", 1004, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __titleAndCompany = new DmcAttributeInfo("titleAndCompany", 1006, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __urlCE = new DmcAttributeInfo("urlCE", 1010, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);

    public final static DmcSliceInfo __lightContact = new DmcSliceInfo("lightContact");

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__birthdayCE.id,__birthdayCE);
        _SmAp.put(__emailCE.id,__emailCE);
        _SmAp.put(__firstName.id,__firstName);
        _SmAp.put(__lastName.id,__lastName);
        _SmAp.put(__middleName.id,__middleName);
        _SmAp.put(__nickName.id,__nickName);
        _SmAp.put(__notesCE.id,__notesCE);
        _SmAp.put(__phoneNumberCE.id,__phoneNumberCE);
        _SmAp.put(__prefixCE.id,__prefixCE);
        _SmAp.put(__suffixCE.id,__suffixCE);
        _SmAp.put(__titleAndCompany.id,__titleAndCompany);
        _SmAp.put(__urlCE.id,__urlCE);

        __lightContact.addAttributeID(1000);
        __lightContact.addAttributeID(1002);
        __lightContact.addAttributeID(1008);
        _SImAp.put("lightContact",__lightContact);

    }

    static  ContactsASAG instance;

    protected ContactsASAG (){
    }

    public static ContactsASAG instance(){
        if (instance == null)
            instance = new ContactsASAG();
        return(instance);
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

