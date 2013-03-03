package org.dmd.examples.contacts.client.application.generated.mvw.places;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.PlaceFormatter.formatPlaceHistoryMapper(PlaceFormatter.java:151)
import com.google.gwt.place.shared.PlaceHistoryMapper;                                                     // Base class - (PlaceFormatter.java:172)
import com.google.gwt.place.shared.WithTokenizers;                                                         // Required annotation - (PlaceFormatter.java:173)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.places.EditPlace;                 // Required place - (PlaceFormatter.java:176)
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;         // Required place - (PlaceFormatter.java:176)
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;                   // Required place - (PlaceFormatter.java:176)

@WithTokenizers({
                    EditPlace.Tokenizer.class,
                    ListContactsPlace.Tokenizer.class,
                    LoginPlace.Tokenizer.class
                })

public interface ContactWebApplicationPlaceHistoryMapper extends PlaceHistoryMapper {
}

