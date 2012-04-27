package com.google.gwt.sample.contacts.client.extended.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dmd.dmc.DmcObjectName;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.gxt.store.GxtListStore;
import org.dmd.mvw.client.gxt.widget.grid.GxtGrid;

import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.Style.SortDir;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.GridView;
import com.google.gwt.sample.contacts.client.generated.gxt.ContactGXT;
import com.google.gwt.sample.contacts.shared.generated.dmo.ContactsDMSAG;

public class ContactListPanel extends LayoutContainer {

	ContactListView	view;
	
	// Our columns
	ColumnConfig				firstNameCol;
	ColumnConfig				lastNameCol;
	ColumnConfig				emailCol;
	ColumnModel					columnModel;
	
	GxtListStore<GxtWrapper>	store;
	GridView					gridView;
	GxtGrid						grid;
	List<GxtWrapper>			selectedList;

	public ContactListPanel(ContactListView v){
		view = v;
		initColumns();
		
		selectedList = new ArrayList<GxtWrapper>();

		store = new GxtListStore<GxtWrapper>();
		store.setMonitorChanges(true);
		store.setDefaultSort(ContactsDMSAG.__firstName.name, SortDir.ASC);
		grid = new GxtGrid(store, columnModel);
		grid.setSize(700, 200);
		grid.setBorders(true);
		
		grid.setSelectionMode(SelectionMode.SINGLE);
		grid.getSelectionModel().addSelectionChangedListener(new SelectionChangedListener<GxtWrapper>() {
			@Override
			public void selectionChanged(SelectionChangedEvent<GxtWrapper> se) {
				ContactGXT gxt = (ContactGXT) se.getSelectedItem();
				view.profileSelected(gxt);
			}
		});
		
		gridView = new GridView();
		gridView.setForceFit(true);
		grid.setView(gridView);

		add(grid);

	}
	
	public void setContacts(HashMap<DmcObjectName, GxtWrapper> contacts){
		store.removeAll();
		for(GxtWrapper contact: contacts.values()){
			store.add(contact);
		}
		store.sort(ContactsDMSAG.__firstName.name, SortDir.ASC);
	}
	
	public void addContact(ContactGXT contact){
		store.add(contact);
		store.sort(ContactsDMSAG.__firstName.name, SortDir.ASC);
	}
	
	public void deleteContact(ContactGXT contact){
		store.remove(contact);
	}

	void initColumns(){
		List<ColumnConfig>	config = new ArrayList<ColumnConfig>();

		firstNameCol	= new ColumnConfig(ContactsDMSAG.__firstName.name, "First Name", 100);
		firstNameCol.setSortable(true);
		firstNameCol.setMenuDisabled(true);
		config.add(firstNameCol);
		
		lastNameCol		= new ColumnConfig("lastName", "Last Name", 100);
		lastNameCol.setSortable(true);
		lastNameCol.setMenuDisabled(true);
		config.add(lastNameCol);

		emailCol		= new ColumnConfig("emailCE", "email", 200);
		emailCol.setSortable(true);
		emailCol.setMenuDisabled(true);
		config.add(emailCol);
		
		columnModel = new ColumnModel(config);		
	}
}
