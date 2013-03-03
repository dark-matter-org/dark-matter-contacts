//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package com.google.gwt.sample.contacts.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;
import com.google.gwt.sample.contacts.shared.generated.enums.ContactTypeEnum;
/**
 * The ContactTypeEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1741)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:104)
 */
public class ContactTypeEnumIterableDMW extends DmwMVIterator<ContactTypeEnum> {

    public final static ContactTypeEnumIterableDMW emptyList = new ContactTypeEnumIterableDMW();

    protected ContactTypeEnumIterableDMW(){
        super();
    }

    public ContactTypeEnumIterableDMW(Iterator<ContactTypeEnum> it){
        super(it);
    }

}

