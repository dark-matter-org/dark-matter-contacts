package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:374)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // View import

public interface EditContactView {

    public interface EditContactViewPresenter {

        public void onContactUpdatedEvent(ContactDMO updatedContact);

    }

    public void setPresenter(EditContactViewPresenter presenter);

    public void setContact(ContactDMO contact);

}

