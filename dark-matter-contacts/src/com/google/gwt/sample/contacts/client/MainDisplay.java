package com.google.gwt.sample.contacts.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class MainDisplay extends Viewport implements AcceptsOneWidget {
	
	public MainDisplay(){
		setLayout(new FitLayout());
		setSize(300, 300);
	}

	@Override
	public void setWidget(IsWidget w) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "MainDisplay.setWidget() has been called with widget " + w.getClass().getName());

		removeAll();

		if (w.asWidget() instanceof Component){
			logger.log(Level.INFO, "MainDisplay.setWidget() adding widget ");
			add((Component)w.asWidget());
			doLayout(true);
		}
		else{
			logger.log(Level.INFO, "MainDisplay.setWidget() will only work with com.extjs.gxt.ui.client.widget.Component derivatives");
		}
	}

}
