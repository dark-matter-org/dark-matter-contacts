package com.google.gwt.sample.contacts.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;         // Attribute urlCE from the contacts schema - (BaseDMWGeneratorNewest.java:733)
import java.util.ArrayList;                                                       // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2042)
import java.util.Date;                                                            // Primitive type - (BaseDMWGeneratorNewest.java:968)
import java.util.Iterator;                                                        // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2054)
import org.dmd.dmc.*;                                                             // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.UUIDName;                                                // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;                          // Named object wrapper - (BaseDMWGeneratorNewest.java:1060)


/**
 * The Contact class is used to represent contact information for an
 * individual.
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ContactGXT extends GxtNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public ContactGXT() {
        super(new ContactDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public ContactGXT(DmcTypeModifierMV mods) {
        super(new ContactDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:500)
    public ContactGXT getModificationRecorder(){
        ContactGXT rc = new ContactGXT();
        rc.setUuidName(getUuidName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ContactDMO getDMO() {
        return((ContactDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public ContactGXT(ContactDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public UUIDName getObjectName(){
        return(((ContactDMO) core).getUuidName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ContactDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ContactGXT){
            return( getObjectName().equals( ((ContactGXT) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Date getBirthdayCE(){
        return(((ContactDMO) core).getBirthdayCE());
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setBirthdayCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setBirthdayCE(value);
    }

    /**
     * Sets birthdayCE to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setBirthdayCE(Date value){
        ((ContactDMO) core).setBirthdayCE(value);
    }

    /**
     * Removes the birthdayCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remBirthdayCE(){
        ((ContactDMO) core).remBirthdayCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getEmailCE(){
        return(((ContactDMO) core).getEmailCE());
    }

    /**
     * Sets emailCE to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setEmailCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setEmailCE(value);
    }

    /**
     * Sets emailCE to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setEmailCE(String value){
        ((ContactDMO) core).setEmailCE(value);
    }

    /**
     * Removes the emailCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remEmailCE(){
        ((ContactDMO) core).remEmailCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getFirstName(){
        return(((ContactDMO) core).getFirstName());
    }

    /**
     * Sets firstName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setFirstName(Object value) throws DmcValueException {
        ((ContactDMO) core).setFirstName(value);
    }

    /**
     * Sets firstName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setFirstName(String value){
        ((ContactDMO) core).setFirstName(value);
    }

    /**
     * Removes the firstName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remFirstName(){
        ((ContactDMO) core).remFirstName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getLastName(){
        return(((ContactDMO) core).getLastName());
    }

    /**
     * Sets lastName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setLastName(Object value) throws DmcValueException {
        ((ContactDMO) core).setLastName(value);
    }

    /**
     * Sets lastName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setLastName(String value){
        ((ContactDMO) core).setLastName(value);
    }

    /**
     * Removes the lastName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remLastName(){
        ((ContactDMO) core).remLastName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getMiddleName(){
        return(((ContactDMO) core).getMiddleName());
    }

    /**
     * Sets middleName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setMiddleName(Object value) throws DmcValueException {
        ((ContactDMO) core).setMiddleName(value);
    }

    /**
     * Sets middleName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setMiddleName(String value){
        ((ContactDMO) core).setMiddleName(value);
    }

    /**
     * Removes the middleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remMiddleName(){
        ((ContactDMO) core).remMiddleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getNickName(){
        return(((ContactDMO) core).getNickName());
    }

    /**
     * Sets nickName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setNickName(Object value) throws DmcValueException {
        ((ContactDMO) core).setNickName(value);
    }

    /**
     * Sets nickName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setNickName(String value){
        ((ContactDMO) core).setNickName(value);
    }

    /**
     * Removes the nickName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remNickName(){
        ((ContactDMO) core).remNickName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getNotesCE(){
        return(((ContactDMO) core).getNotesCE());
    }

    /**
     * Sets notesCE to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setNotesCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setNotesCE(value);
    }

    /**
     * Sets notesCE to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setNotesCE(String value){
        ((ContactDMO) core).setNotesCE(value);
    }

    /**
     * Removes the notesCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remNotesCE(){
        ((ContactDMO) core).remNotesCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getPhoneNumberCE(){
        return(((ContactDMO) core).getPhoneNumberCE());
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setPhoneNumberCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setPhoneNumberCE(value);
    }

    /**
     * Sets phoneNumberCE to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setPhoneNumberCE(String value){
        ((ContactDMO) core).setPhoneNumberCE(value);
    }

    /**
     * Removes the phoneNumberCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remPhoneNumberCE(){
        ((ContactDMO) core).remPhoneNumberCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getPrefixCE(){
        return(((ContactDMO) core).getPrefixCE());
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setPrefixCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setPrefixCE(value);
    }

    /**
     * Sets prefixCE to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setPrefixCE(String value){
        ((ContactDMO) core).setPrefixCE(value);
    }

    /**
     * Removes the prefixCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remPrefixCE(){
        ((ContactDMO) core).remPrefixCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getSuffixCE(){
        return(((ContactDMO) core).getSuffixCE());
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setSuffixCE(Object value) throws DmcValueException {
        ((ContactDMO) core).setSuffixCE(value);
    }

    /**
     * Sets suffixCE to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setSuffixCE(String value){
        ((ContactDMO) core).setSuffixCE(value);
    }

    /**
     * Removes the suffixCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remSuffixCE(){
        ((ContactDMO) core).remSuffixCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getTitleAndCompany(){
        return(((ContactDMO) core).getTitleAndCompany());
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setTitleAndCompany(Object value) throws DmcValueException {
        ((ContactDMO) core).setTitleAndCompany(value);
    }

    /**
     * Sets titleAndCompany to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setTitleAndCompany(String value){
        ((ContactDMO) core).setTitleAndCompany(value);
    }

    /**
     * Removes the titleAndCompany attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remTitleAndCompany(){
        ((ContactDMO) core).remTitleAndCompany();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getUrlCESize(){
        return(((ContactDMO) core).getUrlCESize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getUrlCEIsEmpty(){
        if (((ContactDMO) core).getUrlCESize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getUrlCEHasValue(){
        if (((ContactDMO) core).getUrlCESize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1936)
    public Iterator<String> getUrlCE(){
        return(((ContactDMO) core).getUrlCE());
    }

    /**
     * Adds another urlCE value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1949)
    public void addUrlCE(Object value) throws DmcValueException {
        ((ContactDMO) core).addUrlCE(value);
    }

    /**
     * Adds another urlCE value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1959)
    public void addUrlCE(String value){
        ((ContactDMO) core).addUrlCE(value);
    }

    /**
     * Returns true if the collection contains the urlCE value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2016)
    public boolean urlCEContains(String value){
        return(((ContactDMO) core).urlCEContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2058)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getUrlCECopy(){
        DmcAttribute<?> attr = core.get(ContactsDMSAG.__urlCE);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a urlCE value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2085)
    public void delUrlCE(Object value) throws DmcValueException {
        ((ContactDMO) core).delUrlCE(value);
    }

    /**
     * Deletes a urlCE value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2094)
    public void delUrlCE(String value){
        ((ContactDMO) core).delUrlCE(value);
    }

    /**
     * Removes the urlCE attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remUrlCE(){
        ((ContactDMO) core).remUrlCE();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public UUIDName getUuidName(){
        return(((ContactDMO) core).getUuidName());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setUuidName(Object value) throws DmcValueException {
        ((ContactDMO) core).setUuidName(value);
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setUuidName(UUIDName value){
        ((ContactDMO) core).setUuidName(value);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remUuidName(){
        ((ContactDMO) core).remUuidName();
    }


}
