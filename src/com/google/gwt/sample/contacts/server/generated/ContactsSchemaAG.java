//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package com.google.gwt.sample.contacts.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;


/**
 * The contacts schema defines objects associated with the contacts GWT
 * application example.
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:165)
 */
public class ContactsSchemaAG extends SchemaDefinition {

    public static ClassDefinition _Contact;

    public static AttributeDefinition _firstName;
    public static AttributeDefinition _middleName;
    public static AttributeDefinition _lastName;
    public static AttributeDefinition _prefixCE;
    public static AttributeDefinition _suffixCE;
    public static AttributeDefinition _nickName;
    public static AttributeDefinition _titleAndCompany;
    public static AttributeDefinition _phoneNumberCE;
    public static AttributeDefinition _emailCE;
    public static AttributeDefinition _birthdayCE;
    public static AttributeDefinition _urlCE;
    public static AttributeDefinition _notesCE;



    public static EnumDefinition _ContactTypeEnum;

    static ContactsSchemaAG instance;

    public ContactsSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "com.google.gwt.sample.contacts.server.generated.ContactsSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("contacts");
            me.setSchemaPackage("com.google.gwt.sample.contacts.shared");
            me.setDmwPackage("com.google.gwt.sample.contacts.server");
            me.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/contacts.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initActions();
            initEnums();
            DmcOmni.instance().addCompactSchema(ContactsDMSAG.instance());
        }
    }

    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            ClassDefinitionDMO _ContactOBJ = new ClassDefinitionDMO();
            _Contact = new ClassDefinition(_ContactOBJ,ContactsDMSAG.__Contact);
            _ContactOBJ.setName("Contact");
            _ContactOBJ.setDmdID("1001");
            _ContactOBJ.setClassType("STRUCTURAL");
            _ContactOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/classes.dmd");
            _ContactOBJ.setLineNumber("20");
            _ContactOBJ.setDescription("The Contact class is used to represent contact information for an individual.");
            _ContactOBJ.setIsNamedBy("uuidName");
            _ContactOBJ.setDmtREFImport("com.google.gwt.sample.contacts.shared.generated.types.ContactREF");
            _ContactOBJ.setDmwIteratorClass("ContactIterableDMW");
            _ContactOBJ.addMay("middleName");
            _ContactOBJ.addMay("prefixCE");
            _ContactOBJ.addMay("suffixCE");
            _ContactOBJ.addMay("nickName");
            _ContactOBJ.addMay("titleAndCompany");
            _ContactOBJ.addMay("phoneNumberCE");
            _ContactOBJ.addMay("emailCE");
            _ContactOBJ.addMay("birthdayCE");
            _ContactOBJ.addMay("urlCE");
            _ContactOBJ.addMay("notesCE");
            _ContactOBJ.addMust("uuidName");
            _ContactOBJ.addMust("firstName");
            _ContactOBJ.addMust("lastName");
            _ContactOBJ.setDmwIteratorImport("com.google.gwt.sample.contacts.server.generated.dmw.ContactIterableDMW");
            _Contact.setDefinedIn(this);
            addClassDefList(_Contact);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _firstNameOBJ = new AttributeDefinitionDMO();
            _firstName = new AttributeDefinition(_firstNameOBJ);
            _firstNameOBJ.setType("String");
            _firstNameOBJ.setName("firstName");
            _firstNameOBJ.setDmdID("1000");
            _firstNameOBJ.setDescription("A contact's first name.");
            _firstName.setDefinedIn(this);
            _firstNameOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _firstNameOBJ.setLineNumber("6");
            addAttributeDefList(_firstName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _middleNameOBJ = new AttributeDefinitionDMO();
            _middleName = new AttributeDefinition(_middleNameOBJ);
            _middleNameOBJ.setType("String");
            _middleNameOBJ.setName("middleName");
            _middleNameOBJ.setDmdID("1001");
            _middleNameOBJ.setDescription("A contact's middle name.");
            _middleName.setDefinedIn(this);
            _middleNameOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _middleNameOBJ.setLineNumber("12");
            addAttributeDefList(_middleName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _lastNameOBJ = new AttributeDefinitionDMO();
            _lastName = new AttributeDefinition(_lastNameOBJ);
            _lastNameOBJ.setType("String");
            _lastNameOBJ.setName("lastName");
            _lastNameOBJ.setDmdID("1002");
            _lastNameOBJ.setDescription("A contact's last name.");
            _lastName.setDefinedIn(this);
            _lastNameOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _lastNameOBJ.setLineNumber("18");
            addAttributeDefList(_lastName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _prefixCEOBJ = new AttributeDefinitionDMO();
            _prefixCE = new AttributeDefinition(_prefixCEOBJ);
            _prefixCEOBJ.setType("String");
            _prefixCEOBJ.setName("prefixCE");
            _prefixCEOBJ.setDmdID("1003");
            _prefixCEOBJ.setDescription("The prefix for a contact's name e.g. Mrs. Mr. Dr. etc.");
            _prefixCE.setDefinedIn(this);
            _prefixCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _prefixCEOBJ.setLineNumber("24");
            addAttributeDefList(_prefixCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _suffixCEOBJ = new AttributeDefinitionDMO();
            _suffixCE = new AttributeDefinition(_suffixCEOBJ);
            _suffixCEOBJ.setType("String");
            _suffixCEOBJ.setName("suffixCE");
            _suffixCEOBJ.setDmdID("1004");
            _suffixCEOBJ.setDescription("The suffix for a contact's name e.g. PhD. DMD. etc.");
            _suffixCE.setDefinedIn(this);
            _suffixCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _suffixCEOBJ.setLineNumber("30");
            addAttributeDefList(_suffixCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _nickNameOBJ = new AttributeDefinitionDMO();
            _nickName = new AttributeDefinition(_nickNameOBJ);
            _nickNameOBJ.setType("String");
            _nickNameOBJ.setName("nickName");
            _nickNameOBJ.setDmdID("1005");
            _nickNameOBJ.setDescription("The nickname for a contact.");
            _nickName.setDefinedIn(this);
            _nickNameOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _nickNameOBJ.setLineNumber("36");
            addAttributeDefList(_nickName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _titleAndCompanyOBJ = new AttributeDefinitionDMO();
            _titleAndCompany = new AttributeDefinition(_titleAndCompanyOBJ);
            _titleAndCompanyOBJ.setType("String");
            _titleAndCompanyOBJ.setName("titleAndCompany");
            _titleAndCompanyOBJ.setDmdID("1006");
            _titleAndCompanyOBJ.setDescription("The person's job title and company info.");
            _titleAndCompany.setDefinedIn(this);
            _titleAndCompanyOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _titleAndCompanyOBJ.setLineNumber("42");
            addAttributeDefList(_titleAndCompany);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _phoneNumberCEOBJ = new AttributeDefinitionDMO();
            _phoneNumberCE = new AttributeDefinition(_phoneNumberCEOBJ);
            _phoneNumberCEOBJ.setType("String");
            _phoneNumberCEOBJ.setName("phoneNumberCE");
            _phoneNumberCEOBJ.setDmdID("1007");
            _phoneNumberCE.setDefinedIn(this);
            _phoneNumberCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _phoneNumberCEOBJ.setLineNumber("47");
            addAttributeDefList(_phoneNumberCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _emailCEOBJ = new AttributeDefinitionDMO();
            _emailCE = new AttributeDefinition(_emailCEOBJ);
            _emailCEOBJ.setType("String");
            _emailCEOBJ.setName("emailCE");
            _emailCEOBJ.setDmdID("1008");
            _emailCE.setDefinedIn(this);
            _emailCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _emailCEOBJ.setLineNumber("52");
            addAttributeDefList(_emailCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _birthdayCEOBJ = new AttributeDefinitionDMO();
            _birthdayCE = new AttributeDefinition(_birthdayCEOBJ);
            _birthdayCEOBJ.setType("Date");
            _birthdayCEOBJ.setName("birthdayCE");
            _birthdayCEOBJ.setDmdID("1009");
            _birthdayCE.setDefinedIn(this);
            _birthdayCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _birthdayCEOBJ.setLineNumber("57");
            addAttributeDefList(_birthdayCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _urlCEOBJ = new AttributeDefinitionDMO();
            _urlCE = new AttributeDefinition(_urlCEOBJ);
            _urlCEOBJ.setType("String");
            _urlCEOBJ.setName("urlCE");
            _urlCEOBJ.setDmdID("1010");
            _urlCEOBJ.setDescription("A collection of URLs associated with a contact.");
            _urlCEOBJ.setValueType("MULTI");
            _urlCE.setDefinedIn(this);
            _urlCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _urlCEOBJ.setLineNumber("64");
            addAttributeDefList(_urlCE);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            AttributeDefinitionDMO _notesCEOBJ = new AttributeDefinitionDMO();
            _notesCE = new AttributeDefinition(_notesCEOBJ);
            _notesCEOBJ.setType("String");
            _notesCEOBJ.setName("notesCE");
            _notesCEOBJ.setDmdID("1011");
            _notesCEOBJ.setDescription("Random notes about the contact.");
            _notesCE.setDefinedIn(this);
            _notesCEOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/attributes.dmd");
            _notesCEOBJ.setLineNumber("70");
            addAttributeDefList(_notesCE);

    }

    private void initTypes() throws DmcValueException {
    }

    private void initActions() throws DmcValueException {
    }

    private void initEnums() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:492)
            EnumDefinitionDMO _ContactTypeEnumOBJ = new EnumDefinitionDMO();
            _ContactTypeEnum = new EnumDefinition(_ContactTypeEnumOBJ);
            _ContactTypeEnumOBJ.setName("ContactTypeEnum");
            _ContactTypeEnumOBJ.addEnumValue("0 UNKNOWN Unknown value.");
            _ContactTypeEnumOBJ.addEnumValue("1 FAMILY A family member.");
            _ContactTypeEnumOBJ.addEnumValue("2 FRIEND A friend.");
            _ContactTypeEnumOBJ.addEnumValue("3 ACQUAINTANCE An acquaintance.");
            _ContactTypeEnumOBJ.addEnumValue("4 BUSINESS A business contact.");
            _ContactTypeEnumOBJ.setDescription("The ContactTypeEnum indicates the type of a contact. It is here to illustrate the definition of an enumerated type and the generation of GxtEnums.");
            _ContactTypeEnumOBJ.setNullReturnValue("ContactTypeEnum.UNKNOWN");
            _ContactTypeEnum.setDefinedIn(this);
            _ContactTypeEnumOBJ.setFile("C:/DevSVN2/map-exploration/dark-matter-contacts/src/com/google/gwt/sample/contacts/shared/dmdconfig/types.dmd");
            _ContactTypeEnumOBJ.setLineNumber("10");
            addEnumDefList(_ContactTypeEnum);

    }


    @Override
    public synchronized ContactsSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

