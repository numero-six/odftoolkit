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
import org.odftoolkit.odfdom.dom.type.text.OdfChapterDisplayType;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;

;

/**
 * ODF DOM Element implementation for element "<text:chapter>".
 */
public abstract class OdfChapterElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "chapter" );

    public OdfChapterElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfChapterDisplayType _aDisplay, Integer _aOutlineLevel)
    {
        setDisplay( _aDisplay );
        setOutlineLevel( _aOutlineLevel );
    }

    /**
     * Get value of attribute "text:display".
     */
    public OdfChapterDisplayType getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ) );
        return OdfChapterDisplayType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display".
     */
    public void setDisplay( OdfChapterDisplayType _aDisplay )
    {                    
        String aStringVal = OdfChapterDisplayType.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ), aStringVal );
    }

    /**
     * Get value of attribute "text:outline-level".
     */
    public Integer getOutlineLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:outline-level".
     */
    public void setOutlineLevel( Integer _aOutlineLevel )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aOutlineLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ), aStringVal );
    }

}
