package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:123)
import com.google.gwt.event.shared.GwtEvent;         // The base event type
import org.dmd.dmc.DmcObjectName;                    // Required type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:125)
public class AddContactCompleteEvent extends GwtEvent<AddContactCompleteEventHandler> {

    DmcObjectName   name;

    public static Type<AddContactCompleteEventHandler> TYPE = new Type<AddContactCompleteEventHandler>();

    public AddContactCompleteEvent(DmcObjectName arg1) {
        name = arg1;
    }

    public DmcObjectName getName(){
        return(name);
    }

    @Override
    public Type<AddContactCompleteEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(AddContactCompleteEventHandler handler) {
        handler.handleAddContactCompleteEvent(this);
    }

}
