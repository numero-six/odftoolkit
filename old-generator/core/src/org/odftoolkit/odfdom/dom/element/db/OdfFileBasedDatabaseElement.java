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
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;

;

/**
 * ODF DOM Element implementation for element "<db:file-based-database>".
 */
public abstract class OdfFileBasedDatabaseElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "file-based-database" );

    public OdfFileBasedDatabaseElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aHref, String _aMediaType)
    {
        setHref( _aHref );
        setMediaType( _aMediaType );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "type" ), "simple" );
    }

    /**
     * Get value of attribute "db:media-type".
     */
    public String getMediaType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "media-type" ) );
    }

    /**
     * Set value of attribute "db:media-type".
     */
    public void setMediaType( String _aMediaType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "media-type" ), _aMediaType );
    }

    /**
     * Get value of attribute "db:extension".
     */
    public String getExtension()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "extension" ) );
    }

    /**
     * Set value of attribute "db:extension".
     */
    public void setExtension( String _aExtension )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "extension" ), _aExtension );
    }

}
