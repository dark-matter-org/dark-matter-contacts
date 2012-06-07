package com.google.gwt.sample.contacts.client.mvwmodule.login.extended;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.WidgetListener;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.sample.contacts.client.mvwmodule.login.generated.mvw.views.LoginViewBaseImpl;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends LoginViewBaseImpl {

	LayoutContainer		panel;
	
	ContentPanel		loginForm;
	
	LayoutContainer		loginFields;
	TextField<String> 	userName;
	TextField<String> 	password;
	
	Text				feedback;
	
	Button 				login;

	public LoginView(LoginViewPresenterIF presenter){
		super(presenter);
		
		// Listener to set focus on the user name field when we're displayed
		WidgetListener widgetListener = new WidgetListener() {
			@Override
			public void handleEvent(ComponentEvent e) {
				userName.focus();
			}
		};
				
		panel = new LayoutContainer();
		panel.setSize(300,200);
		panel.setLayout(new CenterLayout());
		panel.addListener(Events.AfterLayout, widgetListener);
		
		loginForm = new ContentPanel();
		loginForm.setHeaderVisible(false);
		loginForm.setBodyBorder(false);
		loginForm.setButtonAlign(HorizontalAlignment.CENTER);
		
		loginFields = new LayoutContainer();
		loginFields.setWidth(280);
	  	FormLayout layout = new FormLayout();
    	layout.setLabelWidth(80);
    	layout.setDefaultWidth(180);
    	loginFields.setLayout(layout);
		
    	KeyListener keyListener = new KeyListener() {
    		public void componentKeyUp(ComponentEvent event) {
    			validate();
    		}
    	};
    	
    	userName = new TextField<String>();
    	userName.setMinLength(1);
    	userName.setFieldLabel("Username");
    	userName.addKeyListener(keyListener);
    	loginFields.add(userName);

    	password = new TextField<String>();
    	password.setMinLength(1);
    	password.setPassword(true);
    	password.setFieldLabel("Password");
    	password.addKeyListener(keyListener);
    	loginFields.add(password);
    	
    	loginForm.add(loginFields);
    	
    	feedback = new Text();
    	feedback.setWidth(300);
    	feedback.setBorders(false);
    	feedback.addStyleName("feedback");
    	
    	loginForm.add(feedback);
    	
    	login = new Button("Login");
    	login.disable();
    	login.addSelectionListener(new SelectionListener<ButtonEvent>() {
    		public void componentSelected(ButtonEvent ce) {
    			fireLoginEvent(userName.getValue(), password.getValue());
    		}
    	});
    	loginForm.addButton(login);
    	
    	panel.add(loginForm);

	}

	///////////////////////////////////////////////////////////////////////////
	// LoginView implementation
	
	@Override
	public void setPassword(String pw) {
		password.setValue(pw);
	}

	@Override
	public void setUserName(String un) {
		userName.setValue(un);
	}

	@Override
	public void displayError(String info) {
		feedback.addStyleName("feedback-error");
		feedback.setText(info);
	}

	@Override
	public void displayFeedback(String info) {
		feedback.removeStyleName("feedback-error");
		feedback.setText(info);
	}

	///////////////////////////////////////////////////////////////////////////
	// IsWidget implementation
	@Override
	public Widget asWidget() {
		return(panel);
	}

	///////////////////////////////////////////////////////////////////////////
	// Field validation
	
  	protected boolean hasValue(TextField<String> field) {
  		return field.getValue() != null && field.getValue().length() > 0;
  	}

  	protected void validate() {  		
  		login.setEnabled(hasValue(userName) && hasValue(password)
  				&& password.getValue().length() > 0);
  	}

}
