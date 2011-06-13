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

public class MainDisplay2 extends Viewport implements AcceptsOneWidget {
	
	ContentPanel	mainPanel;
	
	public MainDisplay2(){
		setLayout(new FitLayout());
		setSize(300, 300);
		
		mainPanel = new ContentPanel();
		mainPanel.setSize(300, 300);
		mainPanel.setLayout(new FitLayout());
		mainPanel.setBodyBorder(true);
		add(mainPanel);
		
		
		ContentPanel panel = new ContentPanel();
		panel.setWidth(300);
		panel.setHeight(200);
		panel.setLayout(new VBoxLayout());
		
		Text	someText = new Text("Initial text");
		
		panel.add(someText);
		
		mainPanel.add(panel);
		
		ContentPanel secondPanel = new ContentPanel();
		secondPanel.setWidth(300);
		secondPanel.setHeight(200);
		secondPanel.setLayout(new VBoxLayout());
		
		Text	otherText = new Text("Secondary text");
		
		secondPanel.add(otherText);
		
		mainPanel.removeAll();
		
		mainPanel.add(secondPanel);
	}

	@Override
	public void setWidget(IsWidget w) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "MainDisplay.setWidget() has been called with widget " + w.getClass().getName());

		if (mainPanel.removeAll()){
			logger.log(Level.INFO, "MainDisplay.setWidget() all widgets removed");
			ContentPanel thirdPanel = new ContentPanel();
			thirdPanel.setWidth(300);
			thirdPanel.setHeight(200);
			thirdPanel.setLayout(new VBoxLayout());
			
			Text	otherText = new Text("Tertiary text");
			
			thirdPanel.add(otherText);
			mainPanel.add(thirdPanel);
			
			doLayout();
		}
		else{
			logger.log(Level.INFO, "MainDisplay.setWidget() could not remove widgets");
		}
		
	}

}
