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

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;


/**
 * ODF DOM Element implementation for element "<office:document-settings>".
 */
public abstract class OdfDocumentSettingsElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 6674013072421584391L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.OFFICE, "document-settings" );

    public OdfDocumentSettingsElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aVersion)
    {
        setVersion( _aVersion );
    }

    /**
     * Get value of attribute "office:version".
     */
    public String getVersion()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ) );
    }

    /**
     * Set value of attribute "office:version".
     */
    public void setVersion( String _aVersion )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "version" ), _aVersion );
    }

    /**
     * Get value of attribute "grddl:transformation".
     */
    public String getTransformation()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.GRDDL, "transformation" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "grddl:transformation".
     */
    public void setTransformation( String _aTransformation )
    {                    
        String aStringVal = OdfAnyURI.toString( _aTransformation );
        setOdfAttribute( OdfName.get( OdfNamespace.GRDDL, "transformation" ), aStringVal );
    }

}
