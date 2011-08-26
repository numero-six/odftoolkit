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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;

import org.odftoolkit.odfdom.dom.element.text.OdfSoftPageBreakElement;

/**
 * ODF DOM Element implementation for element "<table:table-row-group>".
 */
public abstract class OdfTableRowGroupElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "table-row-group" );

    public OdfTableRowGroupElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:display".
     */
    public Boolean getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:display".
     */
    public void setDisplay( Boolean _aDisplay )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display" ), aStringVal );
    }

    /**
    * Create child element "table:table-row-group".
    */
    public OdfTableRowGroupElement createTableRowGroupElement()
    {
        OdfTableRowGroupElement  _nTableRowGroup = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableRowGroupElement.class);
        this.appendChild( _nTableRowGroup);
        return  _nTableRowGroup;
    }                   
               
    /**
    * Create child element "table:table-rows".
    */
    public OdfTableRowsElement createTableRowsElement()
    {
        OdfTableRowsElement  _nTableRows = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableRowsElement.class);
        this.appendChild( _nTableRows);
        return  _nTableRows;
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
    * Create child element "table:table-row".
    */
    public OdfTableRowElement createTableRowElement()
    {
        OdfTableRowElement  _nTableRow = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableRowElement.class);
        this.appendChild( _nTableRow);
        return  _nTableRow;
    }                   
               
    /**
    * Create child element "table:table-header-rows".
    */
    public OdfTableHeaderRowsElement createTableHeaderRowsElement()
    {
        OdfTableHeaderRowsElement  _nTableHeaderRows = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableHeaderRowsElement.class);
        this.appendChild( _nTableHeaderRows);
        return  _nTableHeaderRows;
    }                   
               
}
