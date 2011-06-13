package com.google.gwt.sample.contacts.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.VBoxLayout;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class MainDisplay2 extends ContentPanel implements AcceptsOneWidget {
	
	public MainDisplay2(){
		setLayout(new FitLayout());
		setSize(300, 300);
		
		Text	someText = new Text("Initial text");
		
		add(someText);
		
		System.out.println("ID = " + java.lang.System.identityHashCode(this));
	}

	@Override
	public void setWidget(IsWidget w) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "MainDisplay.setWidget() has been called with widget " + w.getClass().getName());
		System.out.println("ID = " + java.lang.System.identityHashCode(this));

		if (removeAll()){
			logger.log(Level.INFO, "MainDisplay.setWidget() all widgets removed");
			
			Text	otherText = new Text("Secondary text");
			add(otherText);
			
			doLayout();
		}
		else{
			logger.log(Level.INFO, "MainDisplay.setWidget() could not remove widgets");
		}
		
	}

}
