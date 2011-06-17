package com.google.gwt.sample.contacts.client.generated.mvw.activities;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:76)
import com.google.gwt.activity.shared.AbstractActivity;                                  // Is abstract activity
import com.google.gwt.sample.contacts.client.extended.ContactAppController;              // Used by ContactAppControllerRCI
import com.google.gwt.sample.contacts.client.generated.mvw.ContactsRunContextIF;         // Contacts run context
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                             // Always need context for Activities

abstract public class ListContactsActivityBaseImpl extends AbstractActivity {

    protected final ContactAppController ContactAppControllerRCI;

    public ListContactsActivityBaseImpl(MvwRunContextIF rc){
        ContactAppControllerRCI = ((ContactsRunContextIF)rc).getContactAppControllerRCI();
    }

}

