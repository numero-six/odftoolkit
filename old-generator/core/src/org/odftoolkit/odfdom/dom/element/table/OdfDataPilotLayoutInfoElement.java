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
import org.odftoolkit.odfdom.dom.type.table.OdfLayoutModeType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<table:data-pilot-layout-info>".
 */
public abstract class OdfDataPilotLayoutInfoElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 5697590672147501813L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "data-pilot-layout-info" );

    public OdfDataPilotLayoutInfoElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(OdfLayoutModeType _aLayoutMode, Boolean _aAddEmptyLines)
    {
        setLayoutMode( _aLayoutMode );
        setAddEmptyLines( _aAddEmptyLines );
    }

    /**
     * Get value of attribute "table:layout-mode".
     */
    public OdfLayoutModeType getLayoutMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "layout-mode" ) );
        return OdfLayoutModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:layout-mode".
     */
    public void setLayoutMode( OdfLayoutModeType _aLayoutMode )
    {                    
        String aStringVal = OdfLayoutModeType.toString( _aLayoutMode );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "layout-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "table:add-empty-lines".
     */
    public Boolean getAddEmptyLines()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "add-empty-lines" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:add-empty-lines".
     */
    public void setAddEmptyLines( Boolean _aAddEmptyLines )
    {                    
        String aStringVal = OdfBoolean.toString( _aAddEmptyLines );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "add-empty-lines" ), aStringVal );
    }

}
