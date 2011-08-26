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
import org.odftoolkit.odfdom.dom.type.text.OdfIndexEntryChapterDisplayType;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;


/**
 * ODF DOM Element implementation for element "<text:index-entry-chapter>".
 */
public abstract class OdfIndexEntryChapterElement extends OdfStylableElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 7520872680769945175L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "index-entry-chapter" );

    public OdfIndexEntryChapterElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Text, OdfName.get( OdfNamespace.TEXT, "style-name" ) );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
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
     * Get value of attribute "text:display".
     */
    public OdfIndexEntryChapterDisplayType getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ) );
        return OdfIndexEntryChapterDisplayType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display".
     */
    public void setDisplay( OdfIndexEntryChapterDisplayType _aDisplay )
    {                    
        String aStringVal = OdfIndexEntryChapterDisplayType.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ), aStringVal );
    }

    /**
     * Get value of attribute "text:outline-level".
     */
    public Integer getOutlineLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:outline-level".
     */
    public void setOutlineLevel( Integer _aOutlineLevel )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aOutlineLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ), aStringVal );
    }

}
