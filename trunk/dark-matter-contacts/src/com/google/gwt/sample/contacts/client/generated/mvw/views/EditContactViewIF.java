package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:232)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required by ContactUpdatedEvent

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:23)
public interface EditContactViewIF {

    public interface EditContactViewPresenterIF {

        public void onContactUpdatedEvent(ContactDMO updatedContact);

    }

    public void setContact(ContactDMO contact);

}

