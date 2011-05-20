package com.google.gwt.sample.contacts.client.generated.mvw.events;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:100)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

public class EditContactCancelledEvent extends GwtEvent<EditContactCancelledEventHandler> {

    public static Type<EditContactCancelledEventHandler> TYPE = new Type<EditContactCancelledEventHandler>();

    public EditContactCancelledEvent() {
    }

    @Override
    public Type<EditContactCancelledEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(EditContactCancelledEventHandler handler) {
        handler.onEditContactCancelledEvent(this);
    }

}