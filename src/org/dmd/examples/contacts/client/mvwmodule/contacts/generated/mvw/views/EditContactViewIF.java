package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:295)
import org.dmd.examples.contacts.client.mvwmodule.contacts.extended.edit.EditContactView;         // View import - (View.java:244)
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;                                 // Required by ContactUpdatedEvent - (View.java:184)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:39)
public interface EditContactViewIF {

    public interface EditContactViewPresenterIF {

        public void onContactUpdatedEvent(ContactDMO modrec);

        public void onNewContactEvent(ContactDMO contact);

        /** 
         * Called when the user clicks the Cancel button.
         */ 
        void cancelEdit();

        /** 
         * Called when the asynchronously created view is ready
         */ 
        void asyncEditContactViewReady(EditContactView v);

    }

    public void setContact(ContactDMO contact);

}

