package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.views;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.View.getInterfaceImports(View.java:295)
import java.util.Date;                                                    // View import - (View.java:244)
import java.util.HashMap;                                                 // View import - (View.java:226)
import java.util.List;                                                    // Required by DeleteContactsEvent - (View.java:184)
import org.dmd.dmc.DmcObjectName;                                         // View import - (View.java:226)
import org.dmd.examples.contacts.client.generated.gxt.ContactGXT;         // Required by DeleteContactsEvent - (View.java:184)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                             // View import - (View.java:226)

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ViewFormatter.formatViewInterface(ViewFormatter.java:39)
public interface ContactListViewIF {

    public interface ContactListViewPresenterIF {

        public void onDeleteContactsEvent(List<ContactGXT> deletedContacts);

        /** 
         * This is just an example of how to define a method for your presenter. You can stick with the event paradigm if you wish, but if you need to get information back from the presenter, you'll need to use something like this. Make sure that you provide a presenterImport spec for any  required imports.
         */ 
        void exampleMethod(Date date);

    }

    /** 
     * This is called when the presenter has the contacts available.
     */ 
    public void displayContacts(HashMap<DmcObjectName, GxtWrapper> contacts);

    /** 
     * This is called when the presenter receives a deletion event for a contact.
     */ 
    public void deleteContact(ContactGXT contact);

    /** 
     * This is called when a new contact has been successfully created on the server.
     */ 
    public void addContact(ContactGXT contact);

    /** 
     * The presenter will call this when it wants to wipe the current set of data being displayed.
     */ 
    public void resetToEmpty();

    /** 
     * This method will display the specified feedback message.
     */ 
    public void displayFeedback(String info);

    /** 
     * This message will display an error indication.
     */ 
    public void displayError(String info);

}

