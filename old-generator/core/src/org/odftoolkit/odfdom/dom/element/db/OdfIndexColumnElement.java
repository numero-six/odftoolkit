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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<db:index-column>".
 */
public abstract class OdfIndexColumnElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 2923315927621081416L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "index-column" );

    public OdfIndexColumnElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, Boolean _aIsAscending)
    {
        setName( _aName );
        setIsAscending( _aIsAscending );
    }

    /**
     * Get value of attribute "db:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ) );
    }

    /**
     * Set value of attribute "db:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ), _aName );
    }

    /**
     * Get value of attribute "db:is-ascending".
     */
    public Boolean getIsAscending()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-ascending" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-ascending".
     */
    public void setIsAscending( Boolean _aIsAscending )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsAscending );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-ascending" ), aStringVal );
    }

}
