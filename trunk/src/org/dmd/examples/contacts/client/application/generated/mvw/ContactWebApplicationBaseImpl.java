package org.dmd.examples.contacts.client.application.generated.mvw;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.WebApplicationFormatter.formatApplication(WebApplicationFormatter.java:44)
abstract public class ContactWebApplicationBaseImpl {

    protected ContactWebApplicationRunContext rc;

    /**
     * Use this constructor if you need to use an environment specific run context.
     */
    protected ContactWebApplicationBaseImpl(ContactWebApplicationRunContext r){
        rc = r;
        initialize();
    }

    /**
     * Use this constructor if you want to use the default run context.
     */
    protected ContactWebApplicationBaseImpl(){
        rc = GWT.create(ContactWebApplicationRunContext.class);
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

