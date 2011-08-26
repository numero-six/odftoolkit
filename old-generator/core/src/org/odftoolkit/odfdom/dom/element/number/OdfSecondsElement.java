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

package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.number.OdfStyleType;

;

/**
 * ODF DOM Element implementation for element "<number:seconds>".
 */
public abstract class OdfSecondsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.NUMBER, "seconds" );

    public OdfSecondsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "number:style".
     */
    public OdfStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "style" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "short";
        }

        return OdfStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:style".
     */
    public void setStyle( OdfStyleType _aStyle )
    {                    
        String aStringVal = OdfStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "number:decimal-places".
     */
    public Integer getDecimalPlaces()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-places" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0";
        }

        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "number:decimal-places".
     */
    public void setDecimalPlaces( Integer _aDecimalPlaces )
    {                    
        String aStringVal = Integer.toString( _aDecimalPlaces );
        setOdfAttribute( OdfName.get( OdfNamespace.NUMBER, "decimal-places" ), aStringVal );
    }

}
