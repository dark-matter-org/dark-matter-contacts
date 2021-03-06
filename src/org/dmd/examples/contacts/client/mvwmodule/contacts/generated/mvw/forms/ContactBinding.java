package org.dmd.examples.contacts.client.mvwmodule.contacts.generated.mvw.forms;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:73)
import org.dmd.dmc.DmcNamedObjectIF;                                         // Used when testing if an object named - (FormBindingFormatter.java:47)
import org.dmd.dmc.DmcValueException;                                        // Required if we have modification errors - (FormBindingFormatter.java:48)
import org.dmd.dmc.DmcValueExceptionSet;                                     // Required if we have modification errors - (FormBindingFormatter.java:49)
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;                    // Presentation tracker - (FormBindingFormatter.java:59)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required when edit object has no name - (FormBindingFormatter.java:50)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required when edit object has no name - (FormBindingFormatter.java:51)
import org.dmd.dms.generated.types.adapters.StringSVAdapter;                 // Adapter for firstName - (FormBindingFormatter.java:61)
import org.dmd.examples.contacts.shared.generated.dmo.ContactDMO;            // For the object we're editting - (FormBindingFormatter.java:69)
import org.dmd.examples.contacts.shared.generated.dmo.ContactsDMSAG;         // Required schema - (FormBindingFormatter.java:64)
import org.dmd.mvw.client.gxtforms.editors.GxtTextField;                     // Editor - (FormBindingFormatter.java:62)

// org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:75)
public class ContactBinding {

    ContactDMO dmo;

    // If the object set on the binding doesn't have a name, it is considered a new object
    boolean isNewObject;

    DmcPresentationTrackerIF	tracker;

    GxtTextField firstName;
    StringSVAdapter firstNameAdapter;

    GxtTextField lastName;
    StringSVAdapter lastNameAdapter;


    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:90)
    public ContactBinding(){

        isNewObject = false;

        firstName = new GxtTextField();
        firstName.setLabel("First name");
        firstName.setMandatory(true);
        firstNameAdapter = new StringSVAdapter(ContactsDMSAG.__firstName);
        firstName.setAdapter(firstNameAdapter);

        lastName = new GxtTextField();
        lastName.setLabel("Last name");
        lastName.setMandatory(true);
        lastNameAdapter = new StringSVAdapter(ContactsDMSAG.__lastName);
        lastName.setAdapter(lastNameAdapter);

    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:105)
    public boolean isNewObject(){
        return(isNewObject);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:112)
    public void setObject(ContactDMO obj){
        dmo = obj;

        if (obj instanceof DmcNamedObjectIF){
            if (((DmcNamedObjectIF)obj).getObjectName() == null)
                isNewObject = true;
        }
        firstName.setDMO(dmo);
        lastName.setDMO(dmo);

        firstNameAdapter.setEmpty();
        if (dmo == null)
            firstNameAdapter.setExisting(null);
        else
            firstNameAdapter.setExisting(dmo.get(ContactsDMSAG.__firstName));
        firstName.setAdapter(firstNameAdapter);

        lastNameAdapter.setEmpty();
        if (dmo == null)
            lastNameAdapter.setExisting(null);
        else
            lastNameAdapter.setExisting(dmo.get(ContactsDMSAG.__lastName));
        lastName.setAdapter(lastNameAdapter);


        tracker.reset();
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:138)
    public void setTracker(DmcPresentationTrackerIF t){
        tracker = t;

        tracker.track(firstName);
        tracker.track(lastName);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:149)
    public void setEnabledAll(boolean enabled){
        firstName.setEnabled(enabled);
        lastName.setEnabled(enabled);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:193)
    public ContactDMO getModRec(){
        if (dmo == null)
            return(null);

        if (isNewObject)
            throw(new IllegalStateException("You are dealing with a new object, call getModifiedObject(), not getModRec()"));

        ContactDMO modrec = dmo.getModificationRecorder();

        if (firstNameAdapter.valueChanged())
            firstNameAdapter.addMods(modrec.getModifier());
        if (lastNameAdapter.valueChanged())
            lastNameAdapter.addMods(modrec.getModifier());

        return(modrec);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:213)
    public ContactDMO getModifiedObject(){
        if (dmo == null)
            return(null);

        ContactDMO modrec = (ContactDMO) dmo.getNew();
        modrec.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));

        if (firstNameAdapter.valueChanged())
            firstNameAdapter.addMods(modrec.getModifier());
        if (lastNameAdapter.valueChanged())
            lastNameAdapter.addMods(modrec.getModifier());

        ContactDMO rc = (ContactDMO) dmo.cloneIt();

        try {
            rc.applyModifier(modrec.getModifier());
        } catch(DmcValueExceptionSet ex){
            throw(new IllegalStateException("Your form should not permit invalid data", ex));
        } catch(DmcValueException ex){
            throw(new IllegalStateException("Your form should not permit invalid data", ex));
        }
        
        return(rc);
    }

    public GxtTextField getFirstName(){
        return(firstName);
    }

    public GxtTextField getLastName(){
        return(lastName);
    }

}

