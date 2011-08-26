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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;


/**
 * ODF DOM Element implementation for element "<text:bookmark-start>".
 */
public abstract class OdfBookmarkStartElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -4642985720068003833L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "bookmark-start" );

    public OdfBookmarkStartElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "text:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ) );
    }

    /**
     * Set value of attribute "text:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ), _aName );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xhtml:about".
     */
    public String getAbout()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XHTML, "about" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xhtml:about".
     */
    public void setAbout( String _aAbout )
    {                    
        String aStringVal = OdfAnyURI.toString( _aAbout );
        setOdfAttribute( OdfName.get( OdfNamespace.XHTML, "about" ), aStringVal );
    }

    /**
     * Get value of attribute "xhtml:property".
     */
    public String getProperty()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XHTML, "property" ) );
    }

    /**
     * Set value of attribute "xhtml:property".
     */
    public void setProperty( String _aProperty )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XHTML, "property" ), _aProperty );
    }

    /**
     * Get value of attribute "xhtml:datatype".
     */
    public String getDatatype()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XHTML, "datatype" ) );
    }

    /**
     * Set value of attribute "xhtml:datatype".
     */
    public void setDatatype( String _aDatatype )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XHTML, "datatype" ), _aDatatype );
    }

    /**
     * Get value of attribute "xhtml:content".
     */
    public String getContent()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XHTML, "content" ) );
    }

    /**
     * Set value of attribute "xhtml:content".
     */
    public void setContent( String _aContent )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XHTML, "content" ), _aContent );
    }

}
