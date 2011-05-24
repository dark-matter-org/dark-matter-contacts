package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:68)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:319)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // View import

public interface EditContactView {

    public interface Presenter {

        public void onContactUpdatedEvent(ContactDMO updatedContact);

    }

    public void setPresenter(Presenter presenter);

}

