package com.google.gwt.sample.contacts.client.generated.mvw.presenters;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:78)
import com.google.gwt.event.shared.EventBus;                                                                       // Used by eventBus
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListView.ContactListViewPresenter;         // Presenter interface
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                                       // Mvw run context

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.PresenterFormatter.formatPresenterBaseImpl(PresenterFormatter.java:25)
abstract public class ContactListPresenterBaseImpl implements ContactListViewPresenter {

    protected final EventBus eventBus;

    public ContactListPresenterBaseImpl(MvwRunContextIF rc){
        eventBus = ((MvwRunContextIF)rc).getEventBus();
    }

}

