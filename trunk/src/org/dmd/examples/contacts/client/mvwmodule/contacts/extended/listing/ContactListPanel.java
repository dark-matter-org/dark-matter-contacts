package org.dmd.examples.contacts.client.mvwmodule.contacts.extended.listing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dmd.dmc.DmcObjectName;
import org.dmd.examples.contacts.client.generated.gxt.ContactGXT;
import org.dmd.examples.contacts.shared.generated.dmo.ContactsDMSAG;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.gxt.store.GxtListStore;
import org.dmd.mvw.client.gxt.widget.grid.GxtWrapperGrid;

import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.Style.SortDir;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.GridView;

public class ContactListPanel extends LayoutContainer {

	ContactListView	view;
	
	// Our columns
	ColumnConfig				firstNameCol;
	ColumnConfig				lastNameCol;
	ColumnConfig				emailCol;
	ColumnModel					columnModel;
	
	GxtListStore<ContactGXT>	store;
	GridView					gridView;
	GxtWrapperGrid<ContactGXT>	grid;
	List<ContactGXT>			selectedList;

	public ContactListPanel(ContactListView v){
		view = v;
		initColumns();
		
		selectedList = new ArrayList<ContactGXT>();

		store = new GxtListStore<ContactGXT>();
		store.setMonitorChanges(true);
		store.setDefaultSort(ContactsDMSAG.__firstName.name, SortDir.ASC);
		grid = new GxtWrapperGrid<ContactGXT>(store, columnModel);
		grid.setSize(700, 200);
		grid.setBorders(true);
		
		grid.setSelectionMode(SelectionMode.MULTI);
		grid.getSelectionModel().addSelectionChangedListener(new SelectionChangedListener<ContactGXT>() {
			@Override
			public void selectionChanged(SelectionChangedEvent<ContactGXT> se) {
				view.contactsSelected(se.getSelection());
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
			store.add((ContactGXT)contact);
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
	
	public void resetToEmpty(){
		store.removeAll();
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
