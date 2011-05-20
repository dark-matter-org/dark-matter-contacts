package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatView(ViewFormatter.java:20)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Data class
import java.util.List;                                                         // Multi-valued data

public interface ContactListView {

    public interface Presenter {

        public void onContactsDeleted(List<ContactDMO> contacts);

        public void onContactsSelected(List<ContactDMO> contacts);

    }

    public void setPresenter(Presenter presenter);

    public void setContacts(List<ContactDMO> contacts);

    public List<ContactDMO> getContacts();

}
