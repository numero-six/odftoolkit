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

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;

;

/**
 * ODF DOM Element implementation for element "<office:body>".
 */
public abstract class OdfBodyElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.OFFICE, "body" );

    public OdfBodyElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
    * Create child element "office:text".
    */
    public OdfTextElement createTextElement()
    {
        OdfTextElement  _nText = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTextElement.class);
        this.appendChild( _nText);
        return  _nText;
    }                   
               
    /**
    * Create child element "office:drawing".
    */
    public OdfDrawingElement createDrawingElement()
    {
        OdfDrawingElement  _nDrawing = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDrawingElement.class);
        this.appendChild( _nDrawing);
        return  _nDrawing;
    }                   
               
    /**
    * Create child element "office:presentation".
    */
    public OdfPresentationElement createPresentationElement()
    {
        OdfPresentationElement  _nPresentation = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfPresentationElement.class);
        this.appendChild( _nPresentation);
        return  _nPresentation;
    }                   
               
    /**
    * Create child element "office:spreadsheet".
    */
    public OdfSpreadsheetElement createSpreadsheetElement()
    {
        OdfSpreadsheetElement  _nSpreadsheet = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSpreadsheetElement.class);
        this.appendChild( _nSpreadsheet);
        return  _nSpreadsheet;
    }                   
               
    /**
    * Create child element "office:chart".
    */
    public OdfChartElement createChartElement()
    {
        OdfChartElement  _nChart = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfChartElement.class);
        this.appendChild( _nChart);
        return  _nChart;
    }                   
               
    /**
    * Create child element "office:image".
    */
    public OdfImageElement createImageElement()
    {
        OdfImageElement  _nImage = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfImageElement.class);
        this.appendChild( _nImage);
        return  _nImage;
    }                   
               
    /**
    * Create child element "office:database".
    */
    public OdfDatabaseElement createDatabaseElement()
    {
        OdfDatabaseElement  _nDatabase = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDatabaseElement.class);
        this.appendChild( _nDatabase);
        return  _nDatabase;
    }                   
               
}
