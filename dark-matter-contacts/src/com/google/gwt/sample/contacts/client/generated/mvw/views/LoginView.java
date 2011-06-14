package com.google.gwt.sample.contacts.client.generated.mvw.views;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from:  org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:372)

public interface LoginView {

    public interface LoginViewPresenter {

        public void onLoginEvent(String username, String password);

    }

    public void setPresenter(LoginViewPresenter presenter);

    public void setUserName(String un);

    public void setPassword(String pw);

    public void displayFeedback(String info);

    public void displayError(String info);

}

