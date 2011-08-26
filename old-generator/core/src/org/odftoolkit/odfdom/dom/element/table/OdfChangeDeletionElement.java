/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;


/**
 * ODF DOM Element implementation for element "<table:change-deletion>".
 */
public abstract class OdfChangeDeletionElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -1790904819105656409L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "change-deletion" );

    public OdfChangeDeletionElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ) );
    }

    /**
     * Set value of attribute "table:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ), _aId );
    }

}
