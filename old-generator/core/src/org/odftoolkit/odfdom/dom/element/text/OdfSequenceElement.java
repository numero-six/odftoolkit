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
import org.odftoolkit.odfdom.dom.type.OdfBoolean;

;

/**
 * ODF DOM Element implementation for element "<text:sequence>".
 */
public abstract class OdfSequenceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "sequence" );

    public OdfSequenceElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "text:formula".
     */
    public String getFormula()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "formula" ) );
    }

    /**
     * Set value of attribute "text:formula".
     */
    public void setFormula( String _aFormula )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "formula" ), _aFormula );
    }

    /**
     * Get value of attribute "style:num-format".
     */
    public String getNumFormat()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ) );
    }

    /**
     * Set value of attribute "style:num-format".
     */
    public void setNumFormat( String _aNumFormat )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ), _aNumFormat );
    }

    /**
     * Get value of attribute "style:num-letter-sync".
     */
    public Boolean getNumLetterSync()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:num-letter-sync".
     */
    public void setNumLetterSync( Boolean _aNumLetterSync )
    {                    
        String aStringVal = OdfBoolean.toString( _aNumLetterSync );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ), aStringVal );
    }

    /**
     * Get value of attribute "text:ref-name".
     */
    public String getRefName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ref-name" ) );
    }

    /**
     * Set value of attribute "text:ref-name".
     */
    public void setRefName( String _aRefName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ref-name" ), _aRefName );
    }

}