package org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing;

import java.util.HashMap;
import java.util.List;

import org.dmd.dmc.DmcObjectName;
import org.dmd.examples.contacts.client.generated.gxt.ContactGXT;
import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.ContactListViewBaseImpl;
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
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Widget;

public class ContactListView extends ContactListViewBaseImpl {

	ContentPanel				scrollPanel;
	
	LayoutContainer				panel;
	
	ContactListPanel			contactList;
	List<ContactGXT>			currentSelection;

	// A place to display feedback and errors
	Text						feedback;
	
	Listener<ButtonEvent>		addListener;
	Button						addButton;
	
	Listener<ButtonEvent>		deleteListener;
	Button						deleteButton;
	
	Listener<ButtonEvent>		editListener;
	Button						editButton;
	
	Listener<ButtonEvent>		logoutListener;
	Button						logoutButton;
	
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
    	
		logoutListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					fireLogoutEvent();
				}
			}
		};
		
		logoutButton = new Button("Logout");
//		logoutButton.setIcon(AbstractImagePrototype.create(images.add()));
		logoutButton.addListener(Events.Select, logoutListener);
		scrollPanel.addButton(logoutButton);
    	
		///////////////////////////////////////////////////////////////////////
		
		addListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					fireAddContactEvent();
				}
			}
		};
		
		addButton = new Button("Add");
		addButton.setIcon(AbstractImagePrototype.create(images.add()));
		addButton.addListener(Events.Select, addListener);
		scrollPanel.addButton(addButton);
		
		///////////////////////////////////////////////////////////////////////
		
		editListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					fireEditContactEvent(currentSelection.get(0).getDMO());
				}
			}
		};
		
		editButton = new Button("Edit");
		editButton.setIcon(AbstractImagePrototype.create(images.documentEdit()));
		editButton.addListener(Events.Select, editListener);
		editButton.disable();
		scrollPanel.addButton(editButton);
		
		///////////////////////////////////////////////////////////////////////

		deleteListener = new Listener<ButtonEvent>() {
			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select){
					if (currentSelection.size() > 1)
						proceedWarning("Warning", "Are you sure you want to delete the selected contacts?");
					else
						proceedWarning("Warning", "Are you sure you want to delete the selected contact?");
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
					fireDeleteContactsEvent(currentSelection);
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
		contactList.deleteContact(contact);
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
		feedback.setText(info);
	}

	@Override
	public void displayContacts(HashMap<DmcObjectName, GxtWrapper> contacts) {
		contactList.setContacts(contacts);
	}

	/**
	 * This is just a local method that the list panel can call to let us know
	 * that the selection has changed. Depending on how picky you want to be, this
	 * could have been defined as a viewMethod.
	 * @param contacts the currently selected contacts.
	 */
	public void contactsSelected(List<ContactGXT> contacts) {
		if (contacts.size() > 0)
			deleteButton.enable();
		else
			deleteButton.disable();
		
		if (contacts.size() == 1)
			editButton.enable();
		else
			editButton.disable();
		
		currentSelection = contacts;
	}

	@Override
	public void resetToEmpty() {
		contactList.resetToEmpty();
	}


}
