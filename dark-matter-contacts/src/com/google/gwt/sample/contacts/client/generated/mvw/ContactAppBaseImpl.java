package com.google.gwt.sample.contacts.client.generated.mvw;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.sample.contacts.client.generated.mvw.places.LoginPlace;

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.WebApplicationFormatter.formatApplication(WebApplicationFormatter.java:25)
abstract public class ContactAppBaseImpl {

    protected ContactAppRunContext rc;
    protected ContactAppBaseImpl(){
        rc = GWT.create(ContactAppRunContext.class);
        initialize();
    }

    public void run(){
        rc.getActivityManager().setDisplay(getInitialWidget());
        rc.getHistoryHandler().register(rc.getPlaceController(), rc.getEventBus(), getDefaultPlace());
        RootPanel.get().add((Widget) getInitialWidget());
        rc.getHistoryHandler().handleCurrentHistory();
    }

    abstract public void initialize();

    abstract public LoginPlace getDefaultPlace();

    abstract public AcceptsOneWidget getInitialWidget();



}

