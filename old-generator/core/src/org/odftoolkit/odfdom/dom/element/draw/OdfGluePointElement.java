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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.draw.OdfAlignType;
import org.odftoolkit.odfdom.dom.type.draw.OdfEscapeDirectionType;

;

/**
 * ODF DOM Element implementation for element "<draw:glue-point>".
 */
public abstract class OdfGluePointElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "glue-point" );

    public OdfGluePointElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aDrawid, String _aX, String _aY, OdfEscapeDirectionType _aEscapeDirection)
    {
        setDrawid( _aDrawid );
        setX( _aX );
        setY( _aY );
        setEscapeDirection( _aEscapeDirection );
    }

    /**
     * Get value of attribute "draw:id".
     */
    public Integer getDrawid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:id".
     */
    public void setDrawid( Integer _aDrawid )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aDrawid );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "draw:align".
     */
    public OdfAlignType getAlign()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "align" ) );
        return OdfAlignType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:align".
     */
    public void setAlign( OdfAlignType _aAlign )
    {                    
        String aStringVal = OdfAlignType.toString( _aAlign );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "align" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:escape-direction".
     */
    public OdfEscapeDirectionType getEscapeDirection()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "escape-direction" ) );
        return OdfEscapeDirectionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:escape-direction".
     */
    public void setEscapeDirection( OdfEscapeDirectionType _aEscapeDirection )
    {                    
        String aStringVal = OdfEscapeDirectionType.toString( _aEscapeDirection );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "escape-direction" ), aStringVal );
    }

}