package com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.forms;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.extensions.GxtEnumMappingFormatter.formatEnumMapping(GxtEnumMappingFormatter.java:33)
import java.util.ArrayList;                                                 // Our mapping type - (GxtEnumMappingFormatter.java:26)
import java.util.List;                                                      // Required by combo box - (GxtEnumMappingFormatter.java:27)
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF;         // Our interface - (GxtEnumMappingFormatter.java:29)
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;             // Our base enum representation - (GxtEnumMappingFormatter.java:28)

// org.dmd.mvw.extensions.GxtEnumMappingFormatter.formatEnumMapping(GxtEnumMappingFormatter.java:35)
public class ContactTypeEnumMapping implements GxtEnumMappingIF {

    static ContactTypeEnumMapping instance;

    final String enumName = "ContactTypeEnum";

    public final GxtEnumValue UNKNOWN = new GxtEnumValue("UNKNOWN", 0, "000", "UNKNOWN");
    public final GxtEnumValue FAMILY = new GxtEnumValue("FAMILY", 1, "001", "FAMILY");
    public final GxtEnumValue FRIEND = new GxtEnumValue("FRIEND", 2, "002", "FRIEND");
    public final GxtEnumValue ACQUAINTANCE = new GxtEnumValue("ACQUAINTANCE", 3, "003", "ACQUAINTANCE");
    public final GxtEnumValue BUSINESS = new GxtEnumValue("BUSINESS", 4, "004", "BUSINESS");

    ArrayList<GxtEnumValue> mapping;

    protected ContactTypeEnumMapping(){
        mapping = new ArrayList<GxtEnumValue>();
        mapping.add(UNKNOWN);
        mapping.add(FAMILY);
        mapping.add(FRIEND);
        mapping.add(ACQUAINTANCE);
        mapping.add(BUSINESS);
    }

    static public ContactTypeEnumMapping instance(){
        if (instance == null)
            instance = new ContactTypeEnumMapping();
        return(instance);
    }

    public List<GxtEnumValue> getMapping(){
        return(mapping);
    }

    public String getEnumName(){
        return(enumName);
    }

}

