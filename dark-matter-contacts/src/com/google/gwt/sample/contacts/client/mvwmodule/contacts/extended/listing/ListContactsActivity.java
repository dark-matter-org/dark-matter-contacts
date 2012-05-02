package com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.listing;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.sample.contacts.client.extended.listing.ContactListView;
import com.google.gwt.sample.contacts.client.generated.mvw.places.ListContactsPlace;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.activities.ListContactsActivityBaseImpl;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ListContactsActivity extends ListContactsActivityBaseImpl {

	AcceptsOneWidget panel;
	
	public ListContactsActivity(MvwRunContextIF rc) {
		super(rc);
	}

	@Override
	public void start(AcceptsOneWidget p, EventBus eventBus) {
		Logger logger = Logger.getLogger("dmcontacts");
		logger.log(Level.INFO, "List Contacts activity has been started.");
		
		panel = p;

//		ContactListView view = ContactAppControllerRCI.getContactsListView(this);
//		
//		if (view != null)
//			panel.setWidget(view);
		// The controller will tell us when the view is ready
		
		ListContactsPlace place = (ListContactsPlace) placeController.getWhere();
		
		logger.log(Level.INFO, "ListContactsActivity running in place: " + place.getToken());
	}

}
