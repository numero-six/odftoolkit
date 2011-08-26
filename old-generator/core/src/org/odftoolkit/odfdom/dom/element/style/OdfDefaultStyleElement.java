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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;

import org.odftoolkit.odfdom.dom.type.chart.OdfSymbolNameType;

/**
 * ODF DOM Element implementation for element "<style:default-style>".
 */
public abstract class OdfDefaultStyleElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "default-style" );

    public OdfDefaultStyleElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfStyleFamily _aFamily)
    {
        setFamily( _aFamily );
    }

    /**
     * Get value of attribute "style:family".
     */
    public OdfStyleFamily getFamily()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "family" ) );
        return OdfStyleFamily.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:family".
     */
    public void setFamily( OdfStyleFamily _aFamily )
    {                    
        String aStringVal = OdfStyleFamily.toString( _aFamily );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "family" ), aStringVal );
    }

    /**
    * Create child element "style:text-properties".
    */
    public OdfTextPropertiesElement createTextPropertiesElement(String   _aDisplay)
    {
        OdfTextPropertiesElement  _nTextProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTextPropertiesElement.class);
        this.appendChild( _nTextProperties);
        return  _nTextProperties;      
    }
    
    /**
    * Create child element "style:text-properties".
    */
    public OdfTextPropertiesElement createTextPropertiesElement(String   _aDisplay, String   _aCondition)
    {
        OdfTextPropertiesElement  _nTextProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTextPropertiesElement.class);
        this.appendChild( _nTextProperties);
        return  _nTextProperties;      
    }
    
    /**
    * Create child element "style:paragraph-properties".
    */
    public OdfParagraphPropertiesElement createParagraphPropertiesElement()
    {
        OdfParagraphPropertiesElement  _nParagraphProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfParagraphPropertiesElement.class);
        this.appendChild( _nParagraphProperties);
        return  _nParagraphProperties;
    }                   
               
    /**
    * Create child element "style:section-properties".
    */
    public OdfSectionPropertiesElement createSectionPropertiesElement()
    {
        OdfSectionPropertiesElement  _nSectionProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSectionPropertiesElement.class);
        this.appendChild( _nSectionProperties);
        return  _nSectionProperties;
    }                   
               
    /**
    * Create child element "style:ruby-properties".
    */
    public OdfRubyPropertiesElement createRubyPropertiesElement()
    {
        OdfRubyPropertiesElement  _nRubyProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRubyPropertiesElement.class);
        this.appendChild( _nRubyProperties);
        return  _nRubyProperties;
    }                   
               
    /**
    * Create child element "style:table-properties".
    */
    public OdfTablePropertiesElement createTablePropertiesElement()
    {
        OdfTablePropertiesElement  _nTableProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTablePropertiesElement.class);
        this.appendChild( _nTableProperties);
        return  _nTableProperties;
    }                   
               
    /**
    * Create child element "style:table-column-properties".
    */
    public OdfTableColumnPropertiesElement createTableColumnPropertiesElement()
    {
        OdfTableColumnPropertiesElement  _nTableColumnProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableColumnPropertiesElement.class);
        this.appendChild( _nTableColumnProperties);
        return  _nTableColumnProperties;
    }                   
               
    /**
    * Create child element "style:table-row-properties".
    */
    public OdfTableRowPropertiesElement createTableRowPropertiesElement()
    {
        OdfTableRowPropertiesElement  _nTableRowProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableRowPropertiesElement.class);
        this.appendChild( _nTableRowProperties);
        return  _nTableRowProperties;
    }                   
               
    /**
    * Create child element "style:table-cell-properties".
    */
    public OdfTableCellPropertiesElement createTableCellPropertiesElement()
    {
        OdfTableCellPropertiesElement  _nTableCellProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableCellPropertiesElement.class);
        this.appendChild( _nTableCellProperties);
        return  _nTableCellProperties;
    }                   
               
    /**
    * Create child element "style:graphic-properties".
    */
    public OdfGraphicPropertiesElement createGraphicPropertiesElement()
    {
        OdfGraphicPropertiesElement  _nGraphicProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfGraphicPropertiesElement.class);
        this.appendChild( _nGraphicProperties);
        return  _nGraphicProperties;
    }                   
               
    /**
    * Create child element "style:drawing-page-properties".
    */
    public OdfDrawingPagePropertiesElement createDrawingPagePropertiesElement()
    {
        OdfDrawingPagePropertiesElement  _nDrawingPageProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDrawingPagePropertiesElement.class);
        this.appendChild( _nDrawingPageProperties);
        return  _nDrawingPageProperties;
    }                   
               
    /**
    * Create child element "style:chart-properties".
    */
    public OdfChartPropertiesElement createChartPropertiesElement(String   _aSymbolType)
    {
        OdfChartPropertiesElement  _nChartProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfChartPropertiesElement.class);
        this.appendChild( _nChartProperties);
        return  _nChartProperties;      
    }
    
    /**
    * Create child element "style:chart-properties".
    */
    public OdfChartPropertiesElement createChartPropertiesElement(String   _aSymbolType, OdfSymbolNameType   _aSymbolName)
    {
        OdfChartPropertiesElement  _nChartProperties = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfChartPropertiesElement.class);
        this.appendChild( _nChartProperties);
        return  _nChartProperties;      
    }
    
}
