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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;
import org.odftoolkit.odfdom.dom.type.OdfId;


/**
 * ODF DOM Element implementation for element "<text:user-index>".
 */
public abstract class OdfUserIndexElement extends OdfStylableElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 5795712000251936321L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-index" );

    public OdfUserIndexElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Section, OdfName.get( OdfNamespace.TEXT, "style-name" ) );
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
     * Get value of attribute "text:style-name".
     */
    @Override
	public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:style-name".
     */
    @Override
	public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ), aStringVal );
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
     * Get value of attribute "text:protected".
     */
    public Boolean getProtected()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protected" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:protected".
     */
    public void setProtected( Boolean _aProtected )
    {                    
        String aStringVal = OdfBoolean.toString( _aProtected );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protected" ), aStringVal );
    }

    /**
     * Get value of attribute "text:protection-key".
     */
    public String getProtectionKey()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protection-key" ) );
    }

    /**
     * Set value of attribute "text:protection-key".
     */
    public void setProtectionKey( String _aProtectionKey )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protection-key" ), _aProtectionKey );
    }

    /**
     * Get value of attribute "text:protection-key-digest-algorithm".
     */
    public String getProtectionKeyDigestAlgorithm()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protection-key-digest-algorithm" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:protection-key-digest-algorithm".
     */
    public void setProtectionKeyDigestAlgorithm( String _aProtectionKeyDigestAlgorithm )
    {                    
        String aStringVal = OdfAnyURI.toString( _aProtectionKeyDigestAlgorithm );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "protection-key-digest-algorithm" ), aStringVal );
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

}
