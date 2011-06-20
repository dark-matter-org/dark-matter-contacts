package com.google.gwt.sample.contacts.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:287)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import java.util.Date;                                        // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object
import org.dmd.dmc.DmcObject;                                 // Structural class
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmc.types.UUIDName;                            // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDateSV;             // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Contact class is used to represent contact information for an
 * individual.
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class ContactDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Contact";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __birthdayCE = new DmcAttributeInfo("birthdayCE",1009,"Date",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __emailCE = new DmcAttributeInfo("emailCE",1008,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firstName = new DmcAttributeInfo("firstName",1000,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __lastName = new DmcAttributeInfo("lastName",1002,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __middleName = new DmcAttributeInfo("middleName",1001,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __nickName = new DmcAttributeInfo("nickName",1005,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __notesCE = new DmcAttributeInfo("notesCE",1011,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __phoneNumberCE = new DmcAttributeInfo("phoneNumberCE",1007,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __prefixCE = new DmcAttributeInfo("prefixCE",1003,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __suffixCE = new DmcAttributeInfo("suffixCE",1004,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __titleAndCompany = new DmcAttributeInfo("titleAndCompany",1006,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __urlCE = new DmcAttributeInfo("urlCE",1010,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__birthdayCE.id,__birthdayCE);
        _ImAp.put(__emailCE.id,__emailCE);
        _ImAp.put(__firstName.id,__firstName);
        _ImAp.put(__lastName.id,__lastName);
        _ImAp.put(__middleName.id,__middleName);
        _ImAp.put(__nickName.id,__nickName);
        _ImAp.put(__notesCE.id,__notesCE);
        _ImAp.put(__phoneNumberCE.id,__phoneNumberCE);
        _ImAp.put(__prefixCE.id,__prefixCE);
        _ImAp.put(__suffixCE.id,__suffixCE);
        _ImAp.put(__titleAndCompany.id,__titleAndCompany);
        _ImAp.put(__urlCE.id,__urlCE);
        _ImAp.put(__uuidName.id,__uuidName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__birthdayCE.name,__birthdayCE);
        _SmAp.put(__emailCE.name,__emailCE);
        _SmAp.put(__firstName.name,__firstName);
        _SmAp.put(__lastName.name,__lastName);
        _SmAp.put(__middleName.name,__middleName);
        _SmAp.put(__nickName.name,__nickName);
        _SmAp.put(__notesCE.name,__notesCE);
        _SmAp.put(__phoneNumberCE.name,__phoneNumberCE);
        _SmAp.put(__prefixCE.name,__prefixCE);
        _SmAp.put(__suffixCE.name,__suffixCE);
        _SmAp.put(__titleAndCompany.name,__titleAndCompany);
        _SmAp.put(__urlCE.name,__urlCE);
        _SmAp.put(__uuidName.name,__uuidName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ContactDMO() {
        super("Contact");
    }

    protected ContactDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ContactDMO getNew(){
        ContactDMO rc = new ContactDMO();
        return(rc);
    }

    @Override
    public ContactDMO getSlice(DmcSliceInfo info){
        ContactDMO rc = new ContactDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ContactDMO(DmcTypeModifierMV mods) {
        super("Contact");
        modrec(true);
        setModifier(mods);
    }

    public ContactDMO getModificationRecorder(){
        ContactDMO rc = new ContactDMO();
        rc.setUuidName(getUuidName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:738)
    public UUIDName getObjectName(){
        DmcAttribute<?> name = get(__uuidName);
        if (name != null)
            return((UUIDName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__uuidName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ContactDMO){
            return( getObjectName().equals( ((ContactDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getMiddleName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__middleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets middleName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setMiddleName(String value) {
        DmcAttribute<?> attr = get(__middleName);
        if (attr == null)
            attr = new DmcTypeStringSV(__middleName);
        
        try{
            attr.set(value);
            set(__middleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets middleName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setMiddleName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__middleName);
        if (attr == null)
            attr = new DmcTypeStringSV(__middleName);
        
        attr.set(value);
        set(__middleName,attr);
    }

    /**
     * Removes the middleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remMiddleName(){
         rem(__middleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getPrefixCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__prefixCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setPrefixCE(String value) {
        DmcAttribute<?> attr = get(__prefixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__prefixCE);
        
        try{
            attr.set(value);
            set(__prefixCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setPrefixCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__prefixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__prefixCE);
        
        attr.set(value);
        set(__prefixCE,attr);
    }

    /**
     * Removes the prefixCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remPrefixCE(){
         rem(__prefixCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getSuffixCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__suffixCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setSuffixCE(String value) {
        DmcAttribute<?> attr = get(__suffixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__suffixCE);
        
        try{
            attr.set(value);
            set(__suffixCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setSuffixCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__suffixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__suffixCE);
        
        attr.set(value);
        set(__suffixCE,attr);
    }

    /**
     * Removes the suffixCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remSuffixCE(){
         rem(__suffixCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getNickName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__nickName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nickName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setNickName(String value) {
        DmcAttribute<?> attr = get(__nickName);
        if (attr == null)
            attr = new DmcTypeStringSV(__nickName);
        
        try{
            attr.set(value);
            set(__nickName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets nickName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setNickName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__nickName);
        if (attr == null)
            attr = new DmcTypeStringSV(__nickName);
        
        attr.set(value);
        set(__nickName,attr);
    }

    /**
     * Removes the nickName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remNickName(){
         rem(__nickName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getTitleAndCompany(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__titleAndCompany);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setTitleAndCompany(String value) {
        DmcAttribute<?> attr = get(__titleAndCompany);
        if (attr == null)
            attr = new DmcTypeStringSV(__titleAndCompany);
        
        try{
            attr.set(value);
            set(__titleAndCompany,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setTitleAndCompany(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__titleAndCompany);
        if (attr == null)
            attr = new DmcTypeStringSV(__titleAndCompany);
        
        attr.set(value);
        set(__titleAndCompany,attr);
    }

    /**
     * Removes the titleAndCompany attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remTitleAndCompany(){
         rem(__titleAndCompany);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getPhoneNumberCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__phoneNumberCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setPhoneNumberCE(String value) {
        DmcAttribute<?> attr = get(__phoneNumberCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__phoneNumberCE);
        
        try{
            attr.set(value);
            set(__phoneNumberCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setPhoneNumberCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__phoneNumberCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__phoneNumberCE);
        
        attr.set(value);
        set(__phoneNumberCE,attr);
    }

    /**
     * Removes the phoneNumberCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remPhoneNumberCE(){
         rem(__phoneNumberCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getEmailCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__emailCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets emailCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setEmailCE(String value) {
        DmcAttribute<?> attr = get(__emailCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__emailCE);
        
        try{
            attr.set(value);
            set(__emailCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets emailCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setEmailCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__emailCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__emailCE);
        
        attr.set(value);
        set(__emailCE,attr);
    }

    /**
     * Removes the emailCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remEmailCE(){
         rem(__emailCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public Date getBirthdayCE(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(__birthdayCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setBirthdayCE(Date value) {
        DmcAttribute<?> attr = get(__birthdayCE);
        if (attr == null)
            attr = new DmcTypeDateSV(__birthdayCE);
        
        try{
            attr.set(value);
            set(__birthdayCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setBirthdayCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__birthdayCE);
        if (attr == null)
            attr = new DmcTypeDateSV(__birthdayCE);
        
        attr.set(value);
        set(__birthdayCE,attr);
    }

    /**
     * Removes the birthdayCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remBirthdayCE(){
         rem(__birthdayCE);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:824)
    public Iterator<String> getUrlCE(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__urlCE);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:836)
    public String getNthUrlCE(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__urlCE);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another urlCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> addUrlCE(String value) {
        DmcAttribute<?> attr = get(__urlCE);
        if (attr == null)
            attr = new DmcTypeStringMV(__urlCE);
        
        try{
            setLastValue(attr.add(value));
            add(__urlCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:891)
    public boolean urlCEContains(String value) {
        DmcAttribute<?> attr = get(__urlCE);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another urlCE value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:923)
    public DmcAttribute<?> addUrlCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__urlCE);
        if (attr == null)
            attr = new DmcTypeStringMV(__urlCE);
        
        setLastValue(attr.add(value));
        add(__urlCE,attr);
        return(attr);
    }

    /**
     * Returns the number of values in urlCE
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:940)
    public int getUrlCESize(){
        DmcAttribute<?> attr = get(__urlCE);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a urlCE value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:982)
    public DmcAttribute<?> delUrlCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__urlCE);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__urlCE), value);
        else
            attr = del(__urlCE, value);
        
        return(attr);
    }

    /**
     * Deletes a urlCE from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:998)
    public DmcAttribute<?> delUrlCE(String value) {
        DmcAttribute<?> attr = get(__urlCE);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__urlCE), value);
        else
            attr = del(__urlCE, value);
        
        return(attr);
    }

    /**
     * Removes the urlCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1017)
    public void remUrlCE(){
         rem(__urlCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getNotesCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__notesCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets notesCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setNotesCE(String value) {
        DmcAttribute<?> attr = get(__notesCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__notesCE);
        
        try{
            attr.set(value);
            set(__notesCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notesCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setNotesCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__notesCE);
        if (attr == null)
            attr = new DmcTypeStringSV(__notesCE);
        
        attr.set(value);
        set(__notesCE,attr);
    }

    /**
     * Removes the notesCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remNotesCE(){
         rem(__notesCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public UUIDName getUuidName(){
        DmcTypeUUIDNameSV attr = (DmcTypeUUIDNameSV) get(__uuidName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setUuidName(UUIDName value) {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(__uuidName);
        
        try{
            attr.set(value);
            set(__uuidName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setUuidName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(__uuidName);
        
        attr.set(value);
        set(__uuidName,attr);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remUuidName(){
         rem(__uuidName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getFirstName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__firstName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets firstName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setFirstName(String value) {
        DmcAttribute<?> attr = get(__firstName);
        if (attr == null)
            attr = new DmcTypeStringSV(__firstName);
        
        try{
            attr.set(value);
            set(__firstName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets firstName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setFirstName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__firstName);
        if (attr == null)
            attr = new DmcTypeStringSV(__firstName);
        
        attr.set(value);
        set(__firstName,attr);
    }

    /**
     * Removes the firstName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remFirstName(){
         rem(__firstName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getLastName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__lastName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lastName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setLastName(String value) {
        DmcAttribute<?> attr = get(__lastName);
        if (attr == null)
            attr = new DmcTypeStringSV(__lastName);
        
        try{
            attr.set(value);
            set(__lastName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lastName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setLastName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__lastName);
        if (attr == null)
            attr = new DmcTypeStringSV(__lastName);
        
        attr.set(value);
        set(__lastName,attr);
    }

    /**
     * Removes the lastName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remLastName(){
         rem(__lastName);
    }




}
