package org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.activities.ListContactsActivityBaseImpl;
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.event.shared.EventBus;
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
		
		logger.info("WHERE: ");
		
		if (commsController.isLoggedIn()){
			logger.log(Level.INFO, "We're logged in, displaying the ContactListView");
			panel = p;
			
//			panel.setWidget(getContactListPresenter().getView());
			
			// This may look weird, but this allows us to instantiate the contact list
			// presenter asynchronously using GWT's code splitting mechanisms. When the 
			// presenter is ready we get called back at asyncContactListPresenterReady().
			getContactListPresenterAsync();
		}
		else{
			logger.log(Level.INFO, "We're not logged in, going to LoginPlace");
			// We're not logged in, someone is trying to access us through the #list: URL
			// without doing the login, so go to login first
			placeController.goTo(new LoginPlace(""));
		}
	}

// Hiding the override so that we can split/unsplit the presenter for code generation testing purposes
//	@Override
	public void asyncContactListPresenterReady(ContactListPresenter p) {
		panel.setWidget(p.getView());
	}

}
