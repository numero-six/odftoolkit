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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeLength;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfId;

import org.odftoolkit.odfdom.dom.element.svg.OdfTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.OdfDescElement;
import org.odftoolkit.odfdom.dom.element.office.OdfEventListenersElement;
import org.odftoolkit.odfdom.dom.type.draw.OdfEscapeDirectionType;
import org.odftoolkit.odfdom.dom.element.text.OdfParagraphElement;
import org.odftoolkit.odfdom.dom.element.text.OdfListElement;

/**
 * ODF DOM Element implementation for element "<draw:caption>".
 */
public abstract class OdfCaptionElement extends OdfShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "caption" );

    public OdfCaptionElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "draw:caption-point-x".
     */
    public String getCaptionPointX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-point-x" ) );
    }

    /**
     * Set value of attribute "draw:caption-point-x".
     */
    public void setCaptionPointX( String _aCaptionPointX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-point-x" ), _aCaptionPointX );
    }

    /**
     * Get value of attribute "draw:caption-point-y".
     */
    public String getCaptionPointY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-point-y" ) );
    }

    /**
     * Set value of attribute "draw:caption-point-y".
     */
    public void setCaptionPointY( String _aCaptionPointY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-point-y" ), _aCaptionPointY );
    }

    /**
     * Get value of attribute "draw:corner-radius".
     */
    public String getCornerRadius()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "corner-radius" ) );
        return OdfNonNegativeLength.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:corner-radius".
     */
    public void setCornerRadius( String _aCornerRadius )
    {                    
        String aStringVal = OdfNonNegativeLength.toString( _aCornerRadius );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "corner-radius" ), aStringVal );
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
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "draw:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ) );
    }

    /**
     * Set value of attribute "draw:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "draw:text-style-name".
     */
    public String getTextStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:text-style-name".
     */
    public void setTextStyleName( String _aTextStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aTextStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:caption-id".
     */
    public String getCaptionId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:caption-id".
     */
    public void setCaptionId( String _aCaptionId )
    {                    
        String aStringVal = OdfId.toString( _aCaptionId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ), aStringVal );
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
               
    /**
    * Create child element "draw:glue-point".
    */
    public OdfGluePointElement createGluePointElement(Integer   _aDrawid, String   _aX, String   _aY, OdfEscapeDirectionType   _aEscapeDirection)
    {
        OdfGluePointElement  _nGluePoint = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGluePointElement.class);
        _nGluePoint.setDrawid( _aDrawid);
        _nGluePoint.setX( _aX);
        _nGluePoint.setY( _aY);
        _nGluePoint.setEscapeDirection( _aEscapeDirection);
        this.appendChild( _nGluePoint);
        return  _nGluePoint;      
    }
    
    /**
    * Create child element "text:p".
    */
    public OdfParagraphElement createParagraphElement()
    {
        OdfParagraphElement  _nParagraph = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfParagraphElement.class);
        this.appendChild( _nParagraph);
        return  _nParagraph;
    }                   
               
    /**
    * Create child element "text:list".
    */
    public OdfListElement createListElement()
    {
        OdfListElement  _nList = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfListElement.class);
        this.appendChild( _nList);
        return  _nList;
    }                   
               
}
