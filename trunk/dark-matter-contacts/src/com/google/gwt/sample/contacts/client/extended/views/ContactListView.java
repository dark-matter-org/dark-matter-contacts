package com.google.gwt.sample.contacts.client.extended.views;

import java.util.ArrayList;
import java.util.List;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridView;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;
import com.google.gwt.sample.contacts.client.generated.mvw.views.ContactListViewBaseImpl;
import com.google.gwt.user.client.ui.Widget;

public class ContactListView extends ContactListViewBaseImpl {
	
	// Our widget
	ContentPanel			panel;
	
	ContentPanel			gridPanel;
	
	// The backing store for our grid display
	ListStore<ContactGXT>	store;
	
	// Our table of contacts
	Grid<ContactGXT>		grid;
	
	// Our columns
	ColumnConfig			firstNameCol;
	ColumnConfig			lastNameCol;
	ColumnConfig			emailCol;
	ColumnModel				columnModel;
	
	public ContactListView(MvwRunContextIF rc) {
		super(rc);
		
		panel = new ContentPanel();
		panel.setSize(500, 300);
		panel.setHeaderVisible(false);
		panel.setBodyBorder(false);
		panel.setLayout(new CenterLayout());
		
		gridPanel = new ContentPanel();
		gridPanel.setHeaderVisible(false);
		gridPanel.setBodyBorder(false);
		gridPanel.setSize(400, 200);
		
		initGrid();
		
		gridPanel.add(grid);
		
		panel.add(gridPanel);
		
	}
	
	void initGrid(){
		firstNameCol	= new ColumnConfig("firstName", "First Name", 50);
		lastNameCol		= new ColumnConfig("lastName", "Last Name", 50);
		emailCol		= new ColumnConfig("emailCE", "email", 50);
		
		List<ColumnConfig> config = new ArrayList<ColumnConfig>();
		config.add(firstNameCol);
		config.add(lastNameCol);
		config.add(emailCol);
		
		columnModel = new ColumnModel(config);
		
		store = new ListStore<ContactGXT>();
		
		GridView view = new GridView();
		view.setForceFit(true);
		
		grid = new Grid<ContactGXT>(store, columnModel);
		grid.setView(view);
		grid.setBorders(true);
		
		grid.setTitle("Contacts");

	}

	@Override
	public void addContact(ContactGXT contact) {
		store.add(contact);
	}

	@Override
	public void deleteContact(ContactGXT contact) {
		
		
	}

	@Override
	public void displayContacts(List<ContactGXT> contacts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContact(ContactGXT contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget asWidget() {
		return(panel);
	}


}
