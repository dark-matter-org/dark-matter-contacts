package com.google.gwt.sample.contacts.client.generated;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapper(GxtDMWGenerator.java:104)
import com.google.gwt.sample.contacts.client.generated.gxt.*;         // Access to the wrappers for the contacts schema - (GxtDMWGenerator.java:192)
import com.google.gwt.sample.contacts.shared.generated.dmo.*;         // Access to the DMOs for the contacts schema - (GxtDMWGenerator.java:193)
import org.dmd.dmc.DmcObject;                                         // The object we wrap - (GxtDMWGenerator.java:135)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // The wrapper we return - (GxtDMWGenerator.java:136)

// Generated from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapper(GxtDMWGenerator.java:107)
public class ContactsGxtWrapperUtil {

    static final int ContactID = 1001;

    static public GxtWrapper wrapIt(DmcObject obj){

        GxtWrapper rc = null;

        switch(obj.getConstructionClassInfo().id){
        case ContactID:
            rc = new ContactGXT((ContactDMO)obj);
            break;
        }

        return(rc);
    }

}

