package com.google.gwt.sample.contacts.client.application.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatPlaceHistoryMapper(PlaceFormatter.java:136)
import com.google.gwt.place.shared.PlaceHistoryMapper;                                                          // Base class - (PlaceFormatter.java:157)
import com.google.gwt.place.shared.WithTokenizers;                                                              // Required annotation - (PlaceFormatter.java:158)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.EditPlace;                 // Required place - (PlaceFormatter.java:161)
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;         // Required place - (PlaceFormatter.java:161)
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;                   // Required place - (PlaceFormatter.java:161)

@WithTokenizers({
                    EditPlace.Tokenizer.class,
                    ListContactsPlace.Tokenizer.class,
                    LoginPlace.Tokenizer.class
                })

public interface ContactWebApplicationPlaceHistoryMapper extends PlaceHistoryMapper {
}

