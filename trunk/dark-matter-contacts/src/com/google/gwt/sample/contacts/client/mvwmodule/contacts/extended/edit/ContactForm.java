package com.google.gwt.sample.contacts.client.mvwmodule.contacts.extended.edit;

import org.dmd.dmc.presentation.Tracker;
import org.dmd.mvw.client.gxtforms.GxtFormPanel;
import org.dmd.mvw.client.gxtforms.implementation.GxtApplyButton;
import org.dmd.mvw.client.gxtforms.implementation.GxtApplyButtonListenerIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtCancelButton;
import org.dmd.mvw.client.gxtforms.implementation.GxtCancelButtonListenerIF;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.forms.ContactBinding;
import com.google.gwt.sample.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewIF.EditContactViewPresenterIF;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactDMO;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public class ContactForm extends GxtFormPanel implements GxtCancelButtonListenerIF, GxtApplyButtonListenerIF {

	EditContactViewPresenterIF		presenter;
	
    Tracker                      	tracker;
    ContactBinding					binding;

    GxtCancelButton					resetButton;
    GxtApplyButton					applyButton;
    
    Button							cancelButton;
	Listener<ButtonEvent>			cancelListener;

    public ContactForm(EditContactViewPresenterIF p){
    	presenter = p;
    	
    	setWidth(600);
    	setHeaderVisible(false);
    	setBodyBorder(false);
    	setFrame(false);
    	
    	tracker = new Tracker();
    	tracker.debug(true);
    	
    	binding = new ContactBinding();
    	binding.setTracker(tracker);
    	
    	FormLayout layout = new FormLayout();
    	layout.setLabelWidth(150);
    	
    	add(binding.getFirstName());
    	add(binding.getLastName());
    	
        resetButton = new GxtCancelButton("Reset", tracker, this);
        applyButton = new GxtApplyButton("Apply", tracker, this);
    	
        cancelListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					presenter.cancelEdit();
				}
			}
		};
		
		cancelButton = new Button("Cancel");
		cancelButton.addListener(Events.Select, cancelListener);

		addButton(cancelButton);
        addButton(resetButton);
        addButton(applyButton);
    }
    
    public void setContact(ContactDMO contact){
    	binding.setObject(contact);
    }

	@Override
	public void applyButtonClicked() {
		// A note about form bindings. There is a conceptual difference between editing an
		// existing object and editing a new object to be created. And, there is a further 
		// distinction between objects that get their names from the client side versus those
		// that have a name assigned to them on the server.
		//
		// When editing an existing object, you will set the object on the binding, have the
		// user edit it and then be told to apply the changes. In this case, you will call
		// getModRec() - get modification recorder and send the resulting changes in a SetRequest.
		// 
		// When you set the object on the binding, it will check to see if the name has been
		// set on the object - if not, it flags it as a new object (isNewObject() will be true)
		// If there's no name, you can't call getModRec(), you must call getModifiedObject() which
		// will return a complete object that will be sent in a CreateRequest and have a name assigned
		// on the server.
		//
		// If, for some reason, you are assigning names on the client (which can lead to problems
		// in multi-user systems) you will need to aware of the fact and call getModifiedObject()
		// EVEN THOUGH isNewObject() WILL RETURN FALSE IN THIS CASE if you set the name on the
		// object before you start using it in the binding. Generally speaking, you should always
		// assign unique names (keys) on the server.
		
		if (binding.isNewObject()){
			presenter.onNewContactEvent(binding.getModifiedObject());
		}
		else{
			presenter.onContactUpdatedEvent(binding.getModRec());
		}
	}

	@Override
	public void cancelButtonClicked() {
		tracker.reset();
	}
}
