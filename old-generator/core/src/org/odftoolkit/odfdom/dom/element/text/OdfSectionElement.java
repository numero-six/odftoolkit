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
import org.odftoolkit.odfdom.dom.type.text.OdfSectionDisplayType;

import org.odftoolkit.odfdom.dom.element.office.OdfDdeSourceElement;
import org.odftoolkit.odfdom.dom.element.table.OdfTableElement;
import org.odftoolkit.odfdom.dom.type.text.OdfSectionDisplayType;
import org.odftoolkit.odfdom.dom.element.draw.OdfRectElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfLineElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfPathElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfGroupElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfControlElement;
import org.odftoolkit.odfdom.dom.element.dr3d.OdfSceneElement;
import org.odftoolkit.odfdom.dom.element.draw.OdfCustomShapeElement;

/**
 * ODF DOM Element implementation for element "<text:section>".
 */
public abstract class OdfSectionElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "section" );

    public OdfSectionElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Section, OdfName.get( OdfNamespace.TEXT, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName, OdfSectionDisplayType _aDisplay, String _aCondition)
    {
        setName( _aName );
        setDisplay( _aDisplay );
        setCondition( _aCondition );
    }

    /**
     * Get value of attribute "text:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:style-name".
     */
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
        if( aStringVal.length()==0 )
        {
            aStringVal = "http://www.w3.org/2000/09/xmldsig#sha1";
        }

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

    /**
     * Get value of attribute "text:display".
     */
    public OdfSectionDisplayType getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ) );
        return OdfSectionDisplayType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display".
     */
    public void setDisplay( OdfSectionDisplayType _aDisplay )
    {                    
        String aStringVal = OdfSectionDisplayType.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ), aStringVal );
    }

    /**
     * Get value of attribute "text:condition".
     */
    public String getCondition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ) );
    }

    /**
     * Set value of attribute "text:condition".
     */
    public void setCondition( String _aCondition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ), _aCondition );
    }

    /**
    * Create child element "text:section-source".
    */
    public OdfSectionSourceElement createSectionSourceElement()
    {
        OdfSectionSourceElement  _nSectionSource = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSectionSourceElement.class);
        this.appendChild( _nSectionSource);
        return  _nSectionSource;
    }                   
               
    /**
    * Create child element "office:dde-source".
    */
    public OdfDdeSourceElement createDdeSourceElement(String   _aDdeApplication, String   _aDdeTopic, String   _aDdeItem)
    {
        OdfDdeSourceElement  _nDdeSource = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDdeSourceElement.class);
        _nDdeSource.setDdeApplication( _aDdeApplication);
        _nDdeSource.setDdeTopic( _aDdeTopic);
        _nDdeSource.setDdeItem( _aDdeItem);
        this.appendChild( _nDdeSource);
        return  _nDdeSource;      
    }
    
    /**
    * Create child element "text:h".
    */
    public OdfHeadingElement createHeadingElement(Integer   _aOutlineLevel)
    {
        OdfHeadingElement  _nHeading = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfHeadingElement.class);
        _nHeading.setOutlineLevel( _aOutlineLevel);
        this.appendChild( _nHeading);
        return  _nHeading;      
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
               
    /**
    * Create child element "text:numbered-paragraph".
    */
    public OdfNumberedParagraphElement createNumberedParagraphElement(String   _aListId)
    {
        OdfNumberedParagraphElement  _nNumberedParagraph = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfNumberedParagraphElement.class);
        _nNumberedParagraph.setListId( _aListId);
        this.appendChild( _nNumberedParagraph);
        return  _nNumberedParagraph;      
    }
    
    /**
    * Create child element "table:table".
    */
    public OdfTableElement createTableElement()
    {
        OdfTableElement  _nTable = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableElement.class);
        this.appendChild( _nTable);
        return  _nTable;
    }                   
               
    /**
    * Create child element "text:section".
    */
    public OdfSectionElement createSectionElement(String   _aName, OdfSectionDisplayType   _aDisplay)
    {
        OdfSectionElement  _nSection = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSectionElement.class);
        _nSection.setName( _aName);
        _nSection.setDisplay( _aDisplay);
        this.appendChild( _nSection);
        return  _nSection;      
    }
    
    /**
    * Create child element "text:section".
    */
    public OdfSectionElement createSectionElement(OdfSectionDisplayType   _aDisplay, String   _aCondition, String   _aName)
    {
        OdfSectionElement  _nSection = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSectionElement.class);
        _nSection.setDisplay( _aDisplay);
        _nSection.setCondition( _aCondition);
        _nSection.setName( _aName);
        this.appendChild( _nSection);
        return  _nSection;      
    }
    
    /**
    * Create child element "text:soft-page-break".
    */
    public OdfSoftPageBreakElement createSoftPageBreakElement()
    {
        OdfSoftPageBreakElement  _nSoftPageBreak = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSoftPageBreakElement.class);
        this.appendChild( _nSoftPageBreak);
        return  _nSoftPageBreak;
    }                   
               
    /**
    * Create child element "text:table-of-content".
    */
    public OdfTableOfContentElement createTableOfContentElement(String   _aName)
    {
        OdfTableOfContentElement  _nTableOfContent = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableOfContentElement.class);
        _nTableOfContent.setName( _aName);
        this.appendChild( _nTableOfContent);
        return  _nTableOfContent;      
    }
    
    /**
    * Create child element "text:illustration-index".
    */
    public OdfIllustrationIndexElement createIllustrationIndexElement(String   _aName)
    {
        OdfIllustrationIndexElement  _nIllustrationIndex = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfIllustrationIndexElement.class);
        _nIllustrationIndex.setName( _aName);
        this.appendChild( _nIllustrationIndex);
        return  _nIllustrationIndex;      
    }
    
    /**
    * Create child element "text:table-index".
    */
    public OdfTableIndexElement createTableIndexElement(String   _aName)
    {
        OdfTableIndexElement  _nTableIndex = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableIndexElement.class);
        _nTableIndex.setName( _aName);
        this.appendChild( _nTableIndex);
        return  _nTableIndex;      
    }
    
    /**
    * Create child element "text:object-index".
    */
    public OdfObjectIndexElement createObjectIndexElement(String   _aName)
    {
        OdfObjectIndexElement  _nObjectIndex = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfObjectIndexElement.class);
        _nObjectIndex.setName( _aName);
        this.appendChild( _nObjectIndex);
        return  _nObjectIndex;      
    }
    
    /**
    * Create child element "text:user-index".
    */
    public OdfUserIndexElement createUserIndexElement(String   _aName)
    {
        OdfUserIndexElement  _nUserIndex = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserIndexElement.class);
        _nUserIndex.setName( _aName);
        this.appendChild( _nUserIndex);
        return  _nUserIndex;      
    }
    
    /**
    * Create child element "text:alphabetical-index".
    */
    public OdfAlphabeticalIndexElement createAlphabeticalIndexElement(String   _aName)
    {
        OdfAlphabeticalIndexElement  _nAlphabeticalIndex = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAlphabeticalIndexElement.class);
        _nAlphabeticalIndex.setName( _aName);
        this.appendChild( _nAlphabeticalIndex);
        return  _nAlphabeticalIndex;      
    }
    
    /**
    * Create child element "text:bibliography".
    */
    public OdfBibliographyElement createBibliographyElement(String   _aName)
    {
        OdfBibliographyElement  _nBibliography = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfBibliographyElement.class);
        _nBibliography.setName( _aName);
        this.appendChild( _nBibliography);
        return  _nBibliography;      
    }
    
    /**
    * Create child element "draw:rect".
    */
    public OdfRectElement createRectElement()
    {
        OdfRectElement  _nRect = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRectElement.class);
        this.appendChild( _nRect);
        return  _nRect;
    }                   
               
    /**
    * Create child element "draw:line".
    */
    public OdfLineElement createLineElement(String   _aX1, String   _aY1, String   _aX2, String   _aY2)
    {
        OdfLineElement  _nLine = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfLineElement.class);
        _nLine.setX1( _aX1);
        _nLine.setY1( _aY1);
        _nLine.setX2( _aX2);
        _nLine.setY2( _aY2);
        this.appendChild( _nLine);
        return  _nLine;      
    }
    
    /**
    * Create child element "draw:polyline".
    */
    public OdfPolylineElement createPolylineElement(String   _aPoints, Integer   _aViewBox)
    {
        OdfPolylineElement  _nPolyline = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPolylineElement.class);
        _nPolyline.setPoints( _aPoints);
        _nPolyline.setViewBox( _aViewBox);
        this.appendChild( _nPolyline);
        return  _nPolyline;      
    }
    
    /**
    * Create child element "draw:polygon".
    */
    public OdfPolygonElement createPolygonElement(String   _aPoints, Integer   _aViewBox)
    {
        OdfPolygonElement  _nPolygon = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPolygonElement.class);
        _nPolygon.setPoints( _aPoints);
        _nPolygon.setViewBox( _aViewBox);
        this.appendChild( _nPolygon);
        return  _nPolygon;      
    }
    
    /**
    * Create child element "draw:regular-polygon".
    */
    public OdfRegularPolygonElement createRegularPolygonElement(Integer   _aCorners, Boolean   _aConcave)
    {
        OdfRegularPolygonElement  _nRegularPolygon = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRegularPolygonElement.class);
        _nRegularPolygon.setCorners( _aCorners);
        _nRegularPolygon.setConcave( _aConcave);
        this.appendChild( _nRegularPolygon);
        return  _nRegularPolygon;      
    }
    
    /**
    * Create child element "draw:regular-polygon".
    */
    public OdfRegularPolygonElement createRegularPolygonElement(Boolean   _aConcave, Integer   _aCorners)
    {
        OdfRegularPolygonElement  _nRegularPolygon = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRegularPolygonElement.class);
        _nRegularPolygon.setConcave( _aConcave);
        _nRegularPolygon.setCorners( _aCorners);
        this.appendChild( _nRegularPolygon);
        return  _nRegularPolygon;      
    }
    
    /**
    * Create child element "draw:path".
    */
    public OdfPathElement createPathElement(String   _aD, Integer   _aViewBox)
    {
        OdfPathElement  _nPath = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPathElement.class);
        _nPath.setD( _aD);
        _nPath.setViewBox( _aViewBox);
        this.appendChild( _nPath);
        return  _nPath;      
    }
    
    /**
    * Create child element "draw:circle".
    */
    public OdfCircleElement createCircleElement()
    {
        OdfCircleElement  _nCircle = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCircleElement.class);
        this.appendChild( _nCircle);
        return  _nCircle;
    }                   
               
    /**
    * Create child element "draw:ellipse".
    */
    public OdfEllipseElement createEllipseElement()
    {
        OdfEllipseElement  _nEllipse = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfEllipseElement.class);
        this.appendChild( _nEllipse);
        return  _nEllipse;
    }                   
               
    /**
    * Create child element "draw:g".
    */
    public OdfGroupElement createGroupElement()
    {
        OdfGroupElement  _nGroup = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGroupElement.class);
        this.appendChild( _nGroup);
        return  _nGroup;
    }                   
               
    /**
    * Create child element "draw:page-thumbnail".
    */
    public OdfPageThumbnailElement createPageThumbnailElement()
    {
        OdfPageThumbnailElement  _nPageThumbnail = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPageThumbnailElement.class);
        this.appendChild( _nPageThumbnail);
        return  _nPageThumbnail;
    }                   
               
    /**
    * Create child element "draw:frame".
    */
    public OdfFrameElement createFrameElement()
    {
        OdfFrameElement  _nFrame = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfFrameElement.class);
        this.appendChild( _nFrame);
        return  _nFrame;
    }                   
               
    /**
    * Create child element "draw:measure".
    */
    public org.odftoolkit.odfdom.dom.element.draw.OdfMeasureElement createdrawMeasureElement(String   _aX1, String   _aY1, String   _aX2, String   _aY2)
    {
        org.odftoolkit.odfdom.dom.element.draw.OdfMeasureElement  _nMeasure = ((OdfFileDom)this.ownerDocument).createOdfElement(org.odftoolkit.odfdom.dom.element.draw.OdfMeasureElement.class);
        _nMeasure.setX1( _aX1);
        _nMeasure.setY1( _aY1);
        _nMeasure.setX2( _aX2);
        _nMeasure.setY2( _aY2);
        this.appendChild( _nMeasure);
        return  _nMeasure;      
    }
    
    /**
    * Create child element "draw:caption".
    */
    public OdfCaptionElement createCaptionElement()
    {
        OdfCaptionElement  _nCaption = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCaptionElement.class);
        this.appendChild( _nCaption);
        return  _nCaption;
    }                   
               
    /**
    * Create child element "draw:connector".
    */
    public OdfConnectorElement createConnectorElement(Integer   _aViewBox)
    {
        OdfConnectorElement  _nConnector = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfConnectorElement.class);
        _nConnector.setViewBox( _aViewBox);
        this.appendChild( _nConnector);
        return  _nConnector;      
    }
    
    /**
    * Create child element "draw:control".
    */
    public OdfControlElement createControlElement(String   _aControl)
    {
        OdfControlElement  _nControl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfControlElement.class);
        _nControl.setControl( _aControl);
        this.appendChild( _nControl);
        return  _nControl;      
    }
    
    /**
    * Create child element "dr3d:scene".
    */
    public OdfSceneElement createSceneElement()
    {
        OdfSceneElement  _nScene = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSceneElement.class);
        this.appendChild( _nScene);
        return  _nScene;
    }                   
               
    /**
    * Create child element "draw:custom-shape".
    */
    public OdfCustomShapeElement createCustomShapeElement()
    {
        OdfCustomShapeElement  _nCustomShape = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCustomShapeElement.class);
        this.appendChild( _nCustomShape);
        return  _nCustomShape;
    }                   
               
    /**
    * Create child element "draw:a".
    */
    public org.odftoolkit.odfdom.dom.element.draw.OdfHyperlinkElement createdrawHyperlinkElement(String   _aHref)
    {
        org.odftoolkit.odfdom.dom.element.draw.OdfHyperlinkElement  _nHyperlink = ((OdfFileDom)this.ownerDocument).createOdfElement(org.odftoolkit.odfdom.dom.element.draw.OdfHyperlinkElement.class);
        _nHyperlink.setHref( _aHref);
        this.appendChild( _nHyperlink);
        return  _nHyperlink;      
    }
    
}
