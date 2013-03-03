package org.dmd.examples.contacts.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class ContactsDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "contacts";


    static int schemaBaseID = 1000;


    static int schemaIDRange = 50;


    static int schemaMaxID = 1050;

    public final static DmcAttributeInfo __birthdayCE = new DmcAttributeInfo("birthdayCE", 1009, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __emailCE = new DmcAttributeInfo("emailCE", 1008, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __firstName = new DmcAttributeInfo("firstName", 1000, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __lastName = new DmcAttributeInfo("lastName", 1002, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __middleName = new DmcAttributeInfo("middleName", 1001, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nickName = new DmcAttributeInfo("nickName", 1005, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __notesCE = new DmcAttributeInfo("notesCE", 1011, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __phoneNumberCE = new DmcAttributeInfo("phoneNumberCE", 1007, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __prefixCE = new DmcAttributeInfo("prefixCE", 1003, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __suffixCE = new DmcAttributeInfo("suffixCE", 1004, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __titleAndCompany = new DmcAttributeInfo("titleAndCompany", 1006, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __urlCE = new DmcAttributeInfo("urlCE", 1010, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_Contact = new DmcTypeInfo("Contact", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ContactTypeEnum = new DmcTypeInfo("ContactTypeEnum", OriginalTypeEnum.ENUM);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __Contact = new DmcClassInfo("Contact","org.dmd.examples.contacts.shared.generated.dmo.ContactDMO", 1001, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__uuidName);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:214)
    public final static DmcSliceInfo __lightContact = new DmcSliceInfo("lightContact");
    // firstName
    // lastName
    // emailCE


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

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
        _CmAp.put(__Contact.id,__Contact);

        __lightContact.addAttributeID(1000);
        __lightContact.addAttributeID(1002);
        __lightContact.addAttributeID(1008);
        _SImAp.put("lightContact",__lightContact);

        __Contact.addMust(MetaDMSAG.__uuidName);
        __Contact.addMust(__firstName);
        __Contact.addMust(__lastName);
        __Contact.addMay(__middleName);
        __Contact.addMay(__prefixCE);
        __Contact.addMay(__suffixCE);
        __Contact.addMay(__nickName);
        __Contact.addMay(__titleAndCompany);
        __Contact.addMay(__phoneNumberCE);
        __Contact.addMay(__emailCE);
        __Contact.addMay(__birthdayCE);
        __Contact.addMay(__urlCE);
        __Contact.addMay(__notesCE);


    }

    static  ContactsDMSAG instance;

    protected ContactsDMSAG (){
    }

    public synchronized static ContactsDMSAG instance(){
        if (instance == null)
            instance = new ContactsDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

