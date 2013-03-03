package org.dmd.examples.contacts.client.mvwmodule.contacts.extended.edit;

import org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views.EditContactViewBaseImpl;
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.google.gwt.user.client.ui.Widget;

public class EditContactView extends EditContactViewBaseImpl {
	
	ContentPanel	panel;
	
	ContactForm		form;

	public EditContactView(EditContactViewPresenterIF p, MvwRunContextIF rc) {
		super(p, rc);

		panel = new ContentPanel();
		panel.setHeading("Edit Contact");
		panel.setSize(600, 400);
		
		form = new ContactForm(p);
		
		panel.add(form);
		
		
	}

	@Override
	public void setContact(ContactDMO contact) {
		form.setContact(contact);
	}

	@Override
	public Widget asWidget() {
		return(panel);
	}

}
