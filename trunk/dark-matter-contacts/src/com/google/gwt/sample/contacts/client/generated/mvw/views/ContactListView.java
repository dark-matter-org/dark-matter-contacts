package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatView(ViewFormatter.java:20)
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Data class
import java.util.List;                                                         // Multi-valued data

public interface ContactListView {

    public interface Presenter {
    }

    public void setPresenter(Presenter presenter);

    public void setContactList(List<ContactDMO> contactList);

    public List<ContactDMO> getContactList();

}

