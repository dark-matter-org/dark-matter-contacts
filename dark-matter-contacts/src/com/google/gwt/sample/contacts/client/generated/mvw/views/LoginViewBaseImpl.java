package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getViewImplImports(View.java:217)
import com.google.gwt.user.client.ui.IsWidget;         // Implements IsWidget

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewBaseImpl(ViewFormatter.java:53)
abstract public class LoginViewBaseImpl implements LoginView, IsWidget {

    LoginViewPresenter presenter;

    protected LoginViewBaseImpl(){
        presenter = null;
    }

    public void setPresenter(LoginViewPresenter p){
        presenter = p;
    }
    
    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.initCodeGenInfo(View.java:112)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getViewLocalMethod(Event.java:244)
    protected void fireLoginEvent(String username, String password){
        presenter.onLoginEvent(username, password);
    }

}

