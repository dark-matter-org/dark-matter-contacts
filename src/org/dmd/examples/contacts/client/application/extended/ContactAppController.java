package org.dmd.examples.contacts.client.application.extended;

import java.util.logging.Logger;

import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.examples.contacts.client.application.generated.mvw.ContactWebApplicationRunContextIF;
import org.dmd.examples.contacts.client.application.generated.mvw.controllers.ContactAppControllerBaseImpl;
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.places.EditPlace;
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.places.ListContactsPlace;
import org.dmd.examples.contacts.client.mvwmodule.login.generated.mvw.places.LoginPlace;
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;

import com.extjs.gxt.ui.client.widget.MessageBox;

public class ContactAppController extends ContactAppControllerBaseImpl {
	
	Logger logger = Logger.getLogger("dmcontacts");

	public ContactAppController(ContactWebApplicationRunContextIF rc) {
		super(rc);
				
		// For the purposes of this example, we turn on message tracking throughout the system.
		// All messages that are sent will be tracked via logging messages on the server.
		// Logging on the server must be at level TRACE.
		commsController.setGlobalMessageTracking(true);
		
		// This turns on tracing of the messages and events as they pass through the comms controller
		// The GWT logging level must be FINEST in order to see these logs.
		commsController.setControllerTracing(true);
	}
	
	@Override
	protected void onAddContactEvent() {
		placeController.goTo(new EditPlace(""));
	}

	@Override
	protected void onEditContactCancelledEvent() {
		placeController.goTo(new ListContactsPlace(""));
	}

	@Override
	protected void onEditContactEvent(ContactDMO contact) {
		placeController.goTo(new EditPlace(contact.getObjectName().getNameString()));
	}

	@Override
	protected void onLoginCompleteEvent() {
		placeController.goTo(new ListContactsPlace(""));
	}
		
	@Override
	public void handleRPCFailureCentrally(Throwable caught, RequestDMO request) {
		MessageBox.alert("GWT RPC Error","A GWT RPC error has occurred while handling this request: " + request.toOIF(), null);
		fireForceCommsReset();
		gxtCache.wipeData();
		placeController.goTo(new LoginPlace(""));
	}

	@Override
	protected void onLogoutCompleteEvent() {
		gxtCache.wipeData();
		placeController.goTo(new LoginPlace(""));
	}

	/**
	 * We receive this when the user hits the Logout button on the ContactListView.
	 */
	@Override
	protected void onLogoutEvent() {
		LogoutRequestDMO request = getLogoutRequest();
		sendLogoutRequest(request);
	}

	@Override
	protected void handleLogoutResponseError(LogoutResponseDMO response) {
		MessageBox.alert("Logout failure", "Logout failed (resetting communications):\n" + response.getResponseText(), null);
		fireForceCommsReset();
		gxtCache.wipeData();
		placeController.goTo(new LoginPlace(""));
	}

	@Override
	protected void handleLogoutResponse(LogoutResponseDMO response) {
		// Nothing to do - the comms controller will fire the LogoutComplete event
		// and we'll go to the login place from there. We could do it here - six
		// of one, half a dozen of another.
	}

	/**
	 * Since we're using the codeSplit flag on several of our components, there has to be a controller 
	 * that handles async code loading errors, and  this is it. If the code loading ever fails, we 
	 * wind up here.
	 */
	@Override
	public void handleAsyncCodeError(String error, Throwable reason) {
		MessageBox.alert("GWT Error.","GWT dynamic code loading error: " + error + "\n\n" + reason.getLocalizedMessage(), null);
		fireForceCommsReset();
		gxtCache.wipeData();
		placeController.goTo(new LoginPlace(""));
	}


}
