package com.google.gwt.sample.contacts.client.generated;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:211)
import com.google.gwt.sample.contacts.client.generated.gxt.*;         // Access to the wrappers for the contacts schema - (GxtDMWGenerator.java:310)
import com.google.gwt.sample.contacts.shared.generated.dmo.*;         // Access to the DMOs for the contacts schema - (GxtDMWGenerator.java:311)
import org.dmd.dmc.DmcObject;                                         // The object we wrap - (GxtDMWGenerator.java:252)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // The wrapper we return - (GxtDMWGenerator.java:253)
import org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryIF;                // The standard wrapper util interface - (GxtDMWGenerator.java:254)

// Generated from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:214)
public class ContactsGxtWrapperFactory implements GxtWrapperFactoryIF {

    static final int ContactID = 1001;


    static ContactsGxtWrapperFactory instance;

    private ContactsGxtWrapperFactory(){

    }

    static public ContactsGxtWrapperFactory instance(){
        if (instance == null)
            instance = new ContactsGxtWrapperFactory();
        return(instance);
    }

    public GxtWrapper wrapObject(DmcObject obj){

        GxtWrapper rc = null;

        switch(obj.getConstructionClassInfo().id){
        case ContactID:
            rc = new ContactGXT((ContactDMO)obj);
            break;
        }

        return(rc);
    }

}

