package org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:301)
import com.google.gwt.user.client.ui.IsWidget;         // Implements IsWidget - (View.java:191)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:67)
abstract public class LoginViewBaseImpl implements LoginViewIF, IsWidget {

    protected LoginViewPresenterIF presenter;

    protected LoginViewBaseImpl(LoginViewPresenterIF p){
        presenter = p;
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:180)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:332)
    protected void fireLoginEvent(String username, String password){
        presenter.onLoginEvent(username, password);
    }

}

