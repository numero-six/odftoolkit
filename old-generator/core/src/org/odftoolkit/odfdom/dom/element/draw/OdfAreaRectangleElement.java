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
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;
import org.odftoolkit.odfdom.dom.type.office.OdfTargetFrameNameType;
import org.odftoolkit.odfdom.dom.type.xlink.OdfShowType;

import org.odftoolkit.odfdom.dom.element.svg.OdfTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.OdfDescElement;
import org.odftoolkit.odfdom.dom.element.office.OdfEventListenersElement;

/**
 * ODF DOM Element implementation for element "<draw:area-rectangle>".
 */
public abstract class OdfAreaRectangleElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "area-rectangle" );

    public OdfAreaRectangleElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aX, String _aY, String _aWidth, String _aHeight)
    {
        setX( _aX );
        setY( _aY );
        setWidth( _aWidth );
        setHeight( _aHeight );
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
     * Get value of attribute "office:target-frame-name".
     */
    public OdfTargetFrameNameType getTargetFrameName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame-name" ) );
        return OdfTargetFrameNameType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:target-frame-name".
     */
    public void setTargetFrameName( OdfTargetFrameNameType _aTargetFrameName )
    {                    
        String aStringVal = OdfTargetFrameNameType.toString( _aTargetFrameName );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame-name" ), aStringVal );
    }

    /**
     * Get value of attribute "xlink:show".
     */
    public OdfShowType getShow()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ) );
        return OdfShowType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:show".
     */
    public void setShow( OdfShowType _aShow )
    {                    
        String aStringVal = OdfShowType.toString( _aShow );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ), aStringVal );
    }

    /**
     * Get value of attribute "office:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ) );
    }

    /**
     * Set value of attribute "office:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ), _aName );
    }

    /**
     * Get value of attribute "draw:nohref".
     */
    public String getNohref()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "nohref" ) );
    }

    /**
     * Set value of attribute "draw:nohref".
     */
    public void setNohref( String _aNohref )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "nohref" ), _aNohref );
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
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
    * Create child element "svg:title".
    */
    public OdfTitleElement createTitleElement()
    {
        OdfTitleElement  _nTitle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTitleElement.class);
        this.appendChild( _nTitle);
        return  _nTitle;
    }                   
               
    /**
    * Create child element "svg:desc".
    */
    public OdfDescElement createDescElement()
    {
        OdfDescElement  _nDesc = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDescElement.class);
        this.appendChild( _nDesc);
        return  _nDesc;
    }                   
               
    /**
    * Create child element "office:event-listeners".
    */
    public OdfEventListenersElement createEventListenersElement()
    {
        OdfEventListenersElement  _nEventListeners = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEventListenersElement.class);
        this.appendChild( _nEventListeners);
        return  _nEventListeners;
    }                   
               
}
