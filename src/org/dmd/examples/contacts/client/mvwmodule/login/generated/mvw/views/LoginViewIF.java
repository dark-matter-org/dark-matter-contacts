package org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:295)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:39)
public interface LoginViewIF {

    public interface LoginViewPresenterIF {

        public void onLoginEvent(String username, String password);

    }

    public void setUserName(String un);

    public void setPassword(String pw);

    public void displayFeedback(String info);

    public void displayError(String info);

}

