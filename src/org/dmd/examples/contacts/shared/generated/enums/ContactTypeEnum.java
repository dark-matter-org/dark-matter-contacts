package org.dmd.examples.contacts.shared.generated.enums;

import java.util.*;

import org.dmd.dmc.DmcEnumIF;

/**
 * The ContactTypeEnum indicates the type of a contact. It is here to\n
 * illustrate the definition of an enumerated type and the generation of
 * GxtEnums.
 * <P>
 * Generated from the contacts schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:100)
 */
public enum ContactTypeEnum implements DmcEnumIF
{
    UNKNOWN(0,"Unknown value."),

    FAMILY(1,"A family member."),

    FRIEND(2,"A friend."),

    ACQUAINTANCE(3,"An acquaintance."),

    BUSINESS(4,"A business contact.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ContactTypeEnum> lookup = new HashMap<Integer,ContactTypeEnum>();

    static {
        for(ContactTypeEnum s : EnumSet.allOf(ContactTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ContactTypeEnum> lookupString = new HashMap<String, ContactTypeEnum>();

    static {
        for(ContactTypeEnum s : EnumSet.allOf(ContactTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ContactTypeEnum(int i, String d){
        ival = i;
        dval = d;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the display value of this enum value as a String.
     */
    public String displayValue(){
        return(dval);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static ContactTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ContactTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}