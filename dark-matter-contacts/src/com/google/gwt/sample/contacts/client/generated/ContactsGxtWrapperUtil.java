package com.google.gwt.sample.contacts.client.generated;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapper(GxtDMWGenerator.java:99)
import com.google.gwt.sample.contacts.client.generated.gxt.*;         // Access to the wrappers for the contacts schema
import com.google.gwt.sample.contacts.shared.generated.dmo.*;         // Access to the DMOs for the contacts schema
import org.dmd.dmc.DmcObject;                                         // The object we wrap
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // The wrapper we return

// Generated from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapper(GxtDMWGenerator.java:102)
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

