package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:123)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:125)
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
