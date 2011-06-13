package com.google.gwt.sample.contacts.client.extended.views;

import com.extjs.gxt.ui.client.event.Events;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.event.WidgetListener;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.extjs.gxt.ui.client.widget.layout.VBoxLayout;
import com.google.gwt.sample.contacts.client.generated.mvw.views.LoginViewBaseImpl;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends LoginViewBaseImpl {
	
	Viewport 			viewport;
	ContentPanel		panel;
	TextField<String> 	userName;
	TextField<String> 	password;
	Button 				login;

	public LoginView(){
		super();
		
		WidgetListener widgetListener = new WidgetListener() {
			@Override
			public void handleEvent(ComponentEvent e) {
				System.out.println("LoginView widget listener got: " + e.toString());
			}
		};
		
		viewport = new Viewport();
		viewport.addListener(Events.BeforeShow, widgetListener);
		viewport.setWidth(300);
		
		viewport.setLayout(new CenterLayout());
		
		panel = new ContentPanel();
		panel.setWidth(300);
		panel.setHeight(200);
		panel.setLayout(new VBoxLayout());
		
		Text	someText = new Text("Login text");
		
		panel.add(someText);

//		panel.setButtonAlign(HorizontalAlignment.LEFT);
		
//	  	FormLayout layout = new FormLayout();
//    	layout.setLabelWidth(90);
//    	layout.setDefaultWidth(180);
//    	panel.setLayout(layout);
//		
//    	KeyListener keyListener = new KeyListener() {
//    		public void componentKeyUp(ComponentEvent event) {
//    			validate();
//    		}
//    	};
//    	
//    	userName = new TextField<String>();
//    	userName.setMinLength(4);
//    	userName.setFieldLabel("Username");
//    	userName.addKeyListener(keyListener);
//    	panel.add(userName);
//
//    	password = new TextField<String>();
//    	password.setMinLength(4);
//    	password.setPassword(true);
//    	password.setFieldLabel("Password");
//    	password.addKeyListener(keyListener);
//    	panel.add(password);
//    	
//    	viewPanel.add(panel);

//    	viewport.add(panel);
    	
	}

	@Override
	public void setPassword(String pw) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUserName(String un) {
		// TODO Auto-generated method stub

	}

	@Override
	public Widget asWidget() {
		return(panel);
	}


  	protected boolean hasValue(TextField<String> field) {
  		return field.getValue() != null && field.getValue().length() > 0;
  	}

  	protected void validate() {  		
  		login.setEnabled(hasValue(userName) && hasValue(password)
  				&& password.getValue().length() > 3);
  	}

}
