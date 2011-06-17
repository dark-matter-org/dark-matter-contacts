package com.google.gwt.sample.contacts.client.extended.activities;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.sample.contacts.client.extended.views.ContactListView;
import com.google.gwt.sample.contacts.client.generated.mvw.activities.ListContactsActivityBaseImpl;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * The ListContactsActivity merely retrieves the contacts view from the ContactAppController
 * and displays it; the activity has no real behaviour. This is because the app controller 
 * maintains our list of contacts throughout the livespan of our application and maintains
 * the associated view.
 */
public class ListContactsActivity extends ListContactsActivityBaseImpl {
	
	AcceptsOneWidget panel;
	
	public ListContactsActivity(MvwRunContextIF rc) {
		super(rc);
	}

	@Override
	public void start(AcceptsOneWidget p, EventBus eventBus) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "Login activity has been started.");
		
		panel = p;

		ContactListView view = ContactAppControllerRCI.getContactsListView(this);
		if (view != null)
			panel.setWidget(view);
		// The controller will tell us when the view is ready
	}
	
	public void viewReady(ContactListView view){
		panel.setWidget(view);
	}

}
