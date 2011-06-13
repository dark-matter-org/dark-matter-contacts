package com.google.gwt.sample.contacts.client.generated.mvw.events;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:107)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

public class AddContactEvent extends GwtEvent<AddContactEventHandler> {

    public static Type<AddContactEventHandler> TYPE = new Type<AddContactEventHandler>();

    public AddContactEvent() {
    }

    @Override
    public Type<AddContactEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(AddContactEventHandler handler) {
        handler.handleAddContactEvent(this);
    }

}
