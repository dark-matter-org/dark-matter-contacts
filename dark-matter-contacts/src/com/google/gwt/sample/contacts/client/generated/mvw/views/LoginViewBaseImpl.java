package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
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
    
    protected void fireLoginEvent(String username, String password){
        presenter.onLoginEvent(username, password);
    }

}

