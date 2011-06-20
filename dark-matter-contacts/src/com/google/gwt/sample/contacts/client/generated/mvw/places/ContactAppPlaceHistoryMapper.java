package com.google.gwt.sample.contacts.client.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatPlaceHistoryMapper(PlaceFormatter.java:64)
import com.google.gwt.place.shared.PlaceHistoryMapper;                                       // Base class
import com.google.gwt.place.shared.WithTokenizers;                                           // Required annotation
import com.google.gwt.sample.contacts.client.generated.mvw.places.EditPlace;                 // Required place
import com.google.gwt.sample.contacts.client.generated.mvw.places.ListContactsPlace;         // Required place
import com.google.gwt.sample.contacts.client.generated.mvw.places.LoginPlace;                // Required place

@WithTokenizers({
                    EditPlace.Tokenizer.class,
                    ListContactsPlace.Tokenizer.class,
                    LoginPlace.Tokenizer.class
                })

public interface ContactAppPlaceHistoryMapper extends PlaceHistoryMapper {
}

