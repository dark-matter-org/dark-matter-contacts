package com.google.gwt.sample.contacts.client.extended.views;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.WidgetListener;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginViewBaseImpl;
import com.google.gwt.user.client.ui.Widget;

/**
 * The LoginView displays fields for the username and password and a button
 * to request login.
 */
public class LoginView extends LoginViewBaseImpl {
	
	ContentPanel		panel;
	
	ContentPanel		loginForm;
	TextField<String> 	userName;
	TextField<String> 	password;
	TextField<String>	feedback;
	Button 				login;

	public LoginView(){
		super();
		
		// Listener to set focus on the user name field when we're displayed
		WidgetListener widgetListener = new WidgetListener() {
			@Override
			public void handleEvent(ComponentEvent e) {
				userName.focus();
			}
		};
				
		panel = new ContentPanel();
		panel.setHeaderVisible(false);
		panel.setBodyBorder(false);
		panel.setWidth(300);
		panel.setHeight(200);
		panel.setLayout(new CenterLayout());
		panel.addListener(Events.AfterLayout, widgetListener);
		
		loginForm = new ContentPanel();
		loginForm.setHeaderVisible(false);
		loginForm.setBodyBorder(false);
		loginForm.setButtonAlign(HorizontalAlignment.CENTER);
		
	  	FormLayout layout = new FormLayout();
    	layout.setLabelWidth(90);
    	layout.setDefaultWidth(180);
    	loginForm.setLayout(layout);
		
    	KeyListener keyListener = new KeyListener() {
    		public void componentKeyUp(ComponentEvent event) {
    			validate();
    		}
    	};
    	
    	userName = new TextField<String>();
    	userName.setMinLength(4);
    	userName.setFieldLabel("Username");
    	userName.addKeyListener(keyListener);
    	loginForm.add(userName);

    	password = new TextField<String>();
    	password.setMinLength(4);
    	password.setPassword(true);
    	password.setFieldLabel("Password");
    	password.addKeyListener(keyListener);
    	loginForm.add(password);
    	
    	feedback = new TextField<String>();
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
	public void setFeedback(String info) {
		feedback.setValue(info);
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
  				&& password.getValue().length() > 3);
  	}

}
