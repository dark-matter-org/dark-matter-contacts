package com.google.gwt.sample.contacts.client.extended.listing;

import java.util.HashMap;
import java.util.List;

import org.dmd.dmc.DmcObjectName;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Dialog;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListViewBaseImpl;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Widget;

/**
 * The ContactListView extends the generated ContactListViewBaseImpl and implements
 * the interfaces/methods implied by that class.
 */
public class ContactListView extends ContactListViewBaseImpl {
	
	ContentPanel				scrollPanel;
	
	LayoutContainer				panel;
	
	ContactListPanel			contactList;
	ContactGXT					currentSelection;

	// A place to display feedback and errors
	Text						feedback;
	
	Listener<ButtonEvent>		addListener;
	Button						addButton;
	
	Listener<ButtonEvent>		deleteListener;
	Button						deleteButton;
	
	Listener<MessageBoxEvent>	warningDialogListener;
	
	boolean 					proceed;
	
	public ContactListView(ContactListViewPresenterIF presenter, MvwRunContextIF rc) {
		super(presenter, rc);
		
		scrollPanel = new ContentPanel();
		scrollPanel.setHeading("Contacts");
		scrollPanel.setWidth(800);
		scrollPanel.setLayout(new FlowLayout());
		scrollPanel.setScrollMode(Scroll.AUTO);

		panel = new LayoutContainer();
		
		BorderLayoutData layoutData = null;
		panel.setLayout(new BorderLayout());
		
		contactList = new ContactListPanel(this);
		
		layoutData = new BorderLayoutData(LayoutRegion.CENTER);
		layoutData.setMargins(new Margins(0,0,0,10));
		panel.add(contactList);

    	feedback = new Text();
    	feedback.setWidth(300);
    	feedback.setBorders(false);
    	feedback.addStyleName("feedback");
    	
		layoutData = new BorderLayoutData(LayoutRegion.SOUTH, 200);
		layoutData.setMargins(new Margins(10,0,5,10));
    	panel.add(feedback,layoutData);
    	
    	scrollPanel.add(panel);
    	
		addListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					
				}
			}
		};
		
		addButton = new Button("Add");
		addButton.setIcon(AbstractImagePrototype.create(images.add()));
		addButton.addListener(Events.Select, addListener);
		scrollPanel.addButton(addButton);

		deleteListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
						proceedWarning("Warning", "Are you sure you want to delete " + currentSelection.getFirstName() + "?");
					
				}
			}
		};
		
		deleteButton = new Button("Delete");
		deleteButton.setIcon(AbstractImagePrototype.create(images.delete()));
		deleteButton.addListener(Events.Select,deleteListener);
		deleteButton.setEnabled(false);
//		deleteButton.addStyleName("button-spacing");
		scrollPanel.addButton(deleteButton);
		scrollPanel.setButtonAlign(HorizontalAlignment.RIGHT);
		
		warningDialogListener = new Listener<MessageBoxEvent>(){
			@Override
			public void handleEvent(MessageBoxEvent be) {
				if (be.getButtonClicked().getItemId().equals(Dialog.YES)){
//					presenter.deleteProfile(currentSelection);
				}
			}
		
		};

	}
	
	void proceedWarning(String title, String message){
		MessageBox.confirm(title, message, warningDialogListener);
	}
	
	@Override
	public void addContact(ContactGXT contact) {
		contactList.addContact(contact);
	}

	@Override
	public void deleteContact(ContactGXT contact) {
		
	}

	@Override
	public void updateContact(ContactGXT contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget asWidget() {
		return(scrollPanel);
	}

	@Override
	public void displayFeedback(String info) {
		feedback.setText(info);
		
	}

	@Override
	public void displayError(String info) {
		// TODO Auto-generated method stub
		
	}

	public void profileSelected(ContactGXT gxt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayContacts(HashMap<DmcObjectName, GxtWrapper> contacts) {
		contactList.setContacts(contacts);
		
	}


}
