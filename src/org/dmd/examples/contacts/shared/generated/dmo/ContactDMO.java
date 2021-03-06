package org.dmd.examples.contacts.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                  // Always required - (GenUtility.java:220)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:215)
import java.util.Date;                                        // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.UUIDName;                            // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeDateSV;             // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV;         // Required type - (GenUtility.java:324)

/**
 * The Contact class is used to represent contact information for an
 * individual.
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ContactDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Contact";


    static {
    }

    public ContactDMO() {
        super("Contact");
    }

    protected ContactDMO(String oc) {
        super(oc);
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
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public UUIDName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__uuidName);
        if (name != null)
            return((UUIDName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__uuidName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof ContactDMO){
            return( getObjectName().equals( ((ContactDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        UUIDName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getMiddleName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__middleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets middleName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setMiddleName(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__middleName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__middleName);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__middleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets middleName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setMiddleName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__middleName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__middleName);
        
        attr.set(value);
        set(ContactsDMSAG.__middleName,attr);
    }

    /**
     * Removes the middleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remMiddleName(){
         rem(ContactsDMSAG.__middleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getPrefixCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__prefixCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setPrefixCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__prefixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__prefixCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__prefixCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setPrefixCE(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__prefixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__prefixCE);
        
        attr.set(value);
        set(ContactsDMSAG.__prefixCE,attr);
    }

    /**
     * Removes the prefixCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remPrefixCE(){
         rem(ContactsDMSAG.__prefixCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getSuffixCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__suffixCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSuffixCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__suffixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__suffixCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__suffixCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSuffixCE(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__suffixCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__suffixCE);
        
        attr.set(value);
        set(ContactsDMSAG.__suffixCE,attr);
    }

    /**
     * Removes the suffixCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSuffixCE(){
         rem(ContactsDMSAG.__suffixCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getNickName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__nickName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nickName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setNickName(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__nickName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__nickName);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__nickName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets nickName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setNickName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__nickName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__nickName);
        
        attr.set(value);
        set(ContactsDMSAG.__nickName,attr);
    }

    /**
     * Removes the nickName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remNickName(){
         rem(ContactsDMSAG.__nickName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getTitleAndCompany(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__titleAndCompany);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setTitleAndCompany(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__titleAndCompany);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__titleAndCompany);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__titleAndCompany,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setTitleAndCompany(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__titleAndCompany);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__titleAndCompany);
        
        attr.set(value);
        set(ContactsDMSAG.__titleAndCompany,attr);
    }

    /**
     * Removes the titleAndCompany attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remTitleAndCompany(){
         rem(ContactsDMSAG.__titleAndCompany);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getPhoneNumberCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__phoneNumberCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setPhoneNumberCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__phoneNumberCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__phoneNumberCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__phoneNumberCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setPhoneNumberCE(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__phoneNumberCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__phoneNumberCE);
        
        attr.set(value);
        set(ContactsDMSAG.__phoneNumberCE,attr);
    }

    /**
     * Removes the phoneNumberCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remPhoneNumberCE(){
         rem(ContactsDMSAG.__phoneNumberCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getEmailCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__emailCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets emailCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setEmailCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__emailCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__emailCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__emailCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets emailCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setEmailCE(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__emailCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__emailCE);
        
        attr.set(value);
        set(ContactsDMSAG.__emailCE,attr);
    }

    /**
     * Removes the emailCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remEmailCE(){
         rem(ContactsDMSAG.__emailCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Date getBirthdayCE(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(ContactsDMSAG.__birthdayCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setBirthdayCE(Date value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__birthdayCE);
        if (attr == null)
            attr = new DmcTypeDateSV(ContactsDMSAG.__birthdayCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__birthdayCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setBirthdayCE(Object value) throws DmcValueException {
        DmcTypeDateSV attr  = (DmcTypeDateSV) get(ContactsDMSAG.__birthdayCE);
        if (attr == null)
            attr = new DmcTypeDateSV(ContactsDMSAG.__birthdayCE);
        
        attr.set(value);
        set(ContactsDMSAG.__birthdayCE,attr);
    }

    /**
     * Removes the birthdayCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remBirthdayCE(){
         rem(ContactsDMSAG.__birthdayCE);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getUrlCE(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(ContactsDMSAG.__urlCE);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthUrlCE(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(ContactsDMSAG.__urlCE);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another urlCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addUrlCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        if (attr == null)
            attr = new DmcTypeStringMV(ContactsDMSAG.__urlCE);
        
        try{
            setLastValue(attr.add(value));
            add(ContactsDMSAG.__urlCE,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean urlCEContains(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another urlCE value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addUrlCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        if (attr == null)
            attr = new DmcTypeStringMV(ContactsDMSAG.__urlCE);
        
        setLastValue(attr.add(value));
        add(ContactsDMSAG.__urlCE,attr);
        return(attr);
    }

    /**
     * Returns the number of values in urlCE
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getUrlCESize(){
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        if (attr == null){
            if (ContactsDMSAG.__urlCE.indexSize == 0)
                return(0);
            else
                return(ContactsDMSAG.__urlCE.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a urlCE value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delUrlCE(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(ContactsDMSAG.__urlCE), value);
        else
            attr = del(ContactsDMSAG.__urlCE, value);
        
        return(attr);
    }

    /**
     * Deletes a urlCE from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delUrlCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__urlCE);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(ContactsDMSAG.__urlCE), value);
        else
            attr = del(ContactsDMSAG.__urlCE, value);
        
        return(attr);
    }

    /**
     * Removes the urlCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remUrlCE(){
         rem(ContactsDMSAG.__urlCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getNotesCE(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__notesCE);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets notesCE to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setNotesCE(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__notesCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__notesCE);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__notesCE,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notesCE to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setNotesCE(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__notesCE);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__notesCE);
        
        attr.set(value);
        set(ContactsDMSAG.__notesCE,attr);
    }

    /**
     * Removes the notesCE attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remNotesCE(){
         rem(ContactsDMSAG.__notesCE);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public UUIDName getUuidName(){
        DmcTypeUUIDNameSV attr = (DmcTypeUUIDNameSV) get(MetaDMSAG.__uuidName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setUuidName(UUIDName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(MetaDMSAG.__uuidName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__uuidName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setUuidName(Object value) throws DmcValueException {
        DmcTypeUUIDNameSV attr  = (DmcTypeUUIDNameSV) get(MetaDMSAG.__uuidName);
        if (attr == null)
            attr = new DmcTypeUUIDNameSV(MetaDMSAG.__uuidName);
        
        attr.set(value);
        set(MetaDMSAG.__uuidName,attr);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remUuidName(){
         rem(MetaDMSAG.__uuidName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getFirstName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__firstName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets firstName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setFirstName(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__firstName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__firstName);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__firstName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets firstName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setFirstName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__firstName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__firstName);
        
        attr.set(value);
        set(ContactsDMSAG.__firstName,attr);
    }

    /**
     * Removes the firstName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remFirstName(){
         rem(ContactsDMSAG.__firstName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getLastName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ContactsDMSAG.__lastName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lastName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setLastName(String value) {
        DmcAttribute<?> attr = get(ContactsDMSAG.__lastName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__lastName);
        
        try{
            attr.set(value);
            set(ContactsDMSAG.__lastName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lastName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setLastName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(ContactsDMSAG.__lastName);
        if (attr == null)
            attr = new DmcTypeStringSV(ContactsDMSAG.__lastName);
        
        attr.set(value);
        set(ContactsDMSAG.__lastName,attr);
    }

    /**
     * Removes the lastName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remLastName(){
         rem(ContactsDMSAG.__lastName);
    }




}
