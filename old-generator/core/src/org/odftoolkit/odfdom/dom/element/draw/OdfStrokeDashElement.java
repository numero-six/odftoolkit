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
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.draw.OdfStrokeStyleType;


/**
 * ODF DOM Element implementation for element "<draw:stroke-dash>".
 */
public abstract class OdfStrokeDashElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -7727504785384053664L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "stroke-dash" );

    public OdfStrokeDashElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "draw:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:display-name".
     */
    public String getDisplayName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ) );
    }

    /**
     * Set value of attribute "draw:display-name".
     */
    public void setDisplayName( String _aDisplayName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ), _aDisplayName );
    }

    /**
     * Get value of attribute "draw:style".
     */
    public OdfStrokeStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ) );
        return OdfStrokeStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style".
     */
    public void setStyle( OdfStrokeStyleType _aStyle )
    {                    
        String aStringVal = OdfStrokeStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:dots1".
     */
    public Integer getDots1()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots1" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:dots1".
     */
    public void setDots1( Integer _aDots1 )
    {                    
        String aStringVal = Integer.toString( _aDots1 );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots1" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:dots1-length".
     */
    public String getDots1Length()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots1-length" ) );
    }

    /**
     * Set value of attribute "draw:dots1-length".
     */
    public void setDots1Length( String _aDots1Length )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots1-length" ), _aDots1Length );
    }

    /**
     * Get value of attribute "draw:dots2".
     */
    public Integer getDots2()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots2" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:dots2".
     */
    public void setDots2( Integer _aDots2 )
    {                    
        String aStringVal = Integer.toString( _aDots2 );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots2" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:dots2-length".
     */
    public String getDots2Length()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots2-length" ) );
    }

    /**
     * Set value of attribute "draw:dots2-length".
     */
    public void setDots2Length( String _aDots2Length )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "dots2-length" ), _aDots2Length );
    }

    /**
     * Get value of attribute "draw:distance".
     */
    public String getDistance()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "distance" ) );
    }

    /**
     * Set value of attribute "draw:distance".
     */
    public void setDistance( String _aDistance )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "distance" ), _aDistance );
    }

}
