package com.google.gwt.sample.contacts.client.generated.mvw.events;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:100)
import com.google.gwt.event.shared.GwtEvent;                                   // The base event type
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required type
import java.util.List;                                                         // Required type

public class ContactsSelectedEvent extends GwtEvent<ContactsSelectedEventHandler> {

    List<ContactDMO>   contacts;

    public static Type<ContactsSelectedEventHandler> TYPE = new Type<ContactsSelectedEventHandler>();

    public ContactsSelectedEvent(List<ContactDMO> arg1) {
        contacts = arg1;
    }

    public List<ContactDMO> getContacts(){
        return(contacts);
    }

    @Override
    public Type<ContactsSelectedEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ContactsSelectedEventHandler handler) {
        handler.onContactsSelectedEvent(this);
    }

}
