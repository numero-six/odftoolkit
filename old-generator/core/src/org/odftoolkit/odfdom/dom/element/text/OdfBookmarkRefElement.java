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
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.text.OdfReferenceFormatType;


/**
 * ODF DOM Element implementation for element "<text:bookmark-ref>".
 */
public abstract class OdfBookmarkRefElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 3260216685699754602L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "bookmark-ref" );

    public OdfBookmarkRefElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "text:ref-name".
     */
    public String getRefName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ref-name" ) );
    }

    /**
     * Set value of attribute "text:ref-name".
     */
    public void setRefName( String _aRefName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "ref-name" ), _aRefName );
    }

    /**
     * Get value of attribute "text:reference-format".
     */
    public OdfReferenceFormatType getReferenceFormat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "reference-format" ) );
        return OdfReferenceFormatType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:reference-format".
     */
    public void setReferenceFormat( OdfReferenceFormatType _aReferenceFormat )
    {                    
        String aStringVal = OdfReferenceFormatType.toString( _aReferenceFormat );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "reference-format" ), aStringVal );
    }

}
