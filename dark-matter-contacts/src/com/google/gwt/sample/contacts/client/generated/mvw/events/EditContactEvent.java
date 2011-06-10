package com.google.gwt.sample.contacts.client.generated.mvw.events;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:107)
import com.google.gwt.event.shared.GwtEvent;                                   // The base event type
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;         // Required type

public class EditContactEvent extends GwtEvent<EditContactEventHandler> {

    ContactDMO   contact;

    public static Type<EditContactEventHandler> TYPE = new Type<EditContactEventHandler>();

    public EditContactEvent(ContactDMO arg1) {
        contact = arg1;
    }

    public ContactDMO getContact(){
        return(contact);
    }

    @Override
    public Type<EditContactEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(EditContactEventHandler handler) {
        handler.handleEditContactEvent(this);
    }

}
