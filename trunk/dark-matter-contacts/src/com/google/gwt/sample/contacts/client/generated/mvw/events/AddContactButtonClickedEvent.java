package com.google.gwt.sample.contacts.client.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:40)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

public class AddContactButtonClickedEvent extends GwtEvent<AddContactButtonClickedEventHandler> {

  public static Type<AddContactButtonClickedEventHandler> TYPE = new Type<AddContactButtonClickedEventHandler>();

  @Override
  public Type<AddContactButtonClickedEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(AddContactButtonClickedEventHandler handler) {
    handler.onAddContactButtonClickedEvent(this);
  }

}
