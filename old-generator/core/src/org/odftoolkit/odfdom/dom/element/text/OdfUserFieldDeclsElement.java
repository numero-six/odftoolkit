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

import org.odftoolkit.odfdom.dom.type.office.OdfValueType;
import org.odftoolkit.odfdom.dom.type.office.OdfValueType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.Duration;

/**
 * ODF DOM Element implementation for element "<text:user-field-decls>".
 */
public abstract class OdfUserFieldDeclsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-field-decls" );

    public OdfUserFieldDeclsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
    * Create child element "text:user-field-decl".
    */
    public OdfUserFieldDeclElement createUserFieldDeclElement(OdfValueType   _aValueType, Double   _aValue, String   _aName)
    {
        OdfUserFieldDeclElement  _nUserFieldDecl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserFieldDeclElement.class);
        _nUserFieldDecl.setValueType( _aValueType);
        _nUserFieldDecl.setValue( _aValue);
        _nUserFieldDecl.setName( _aName);
        this.appendChild( _nUserFieldDecl);
        return  _nUserFieldDecl;      
    }
    
    /**
    * Create child element "text:user-field-decl".
    */
    public OdfUserFieldDeclElement createUserFieldDeclElement(OdfValueType   _aValueType, XMLGregorianCalendar   _aDateValue, String   _aName)
    {
        OdfUserFieldDeclElement  _nUserFieldDecl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserFieldDeclElement.class);
        _nUserFieldDecl.setValueType( _aValueType);
        _nUserFieldDecl.setDateValue( _aDateValue);
        _nUserFieldDecl.setName( _aName);
        this.appendChild( _nUserFieldDecl);
        return  _nUserFieldDecl;      
    }
    
    /**
    * Create child element "text:user-field-decl".
    */
    public OdfUserFieldDeclElement createUserFieldDeclElement(OdfValueType   _aValueType, Duration   _aTimeValue, String   _aName)
    {
        OdfUserFieldDeclElement  _nUserFieldDecl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserFieldDeclElement.class);
        _nUserFieldDecl.setValueType( _aValueType);
        _nUserFieldDecl.setTimeValue( _aTimeValue);
        _nUserFieldDecl.setName( _aName);
        this.appendChild( _nUserFieldDecl);
        return  _nUserFieldDecl;      
    }
    
    /**
    * Create child element "text:user-field-decl".
    */
    public OdfUserFieldDeclElement createUserFieldDeclElement(OdfValueType   _aValueType, Boolean   _aBooleanValue, String   _aName)
    {
        OdfUserFieldDeclElement  _nUserFieldDecl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserFieldDeclElement.class);
        _nUserFieldDecl.setValueType( _aValueType);
        _nUserFieldDecl.setBooleanValue( _aBooleanValue);
        _nUserFieldDecl.setName( _aName);
        this.appendChild( _nUserFieldDecl);
        return  _nUserFieldDecl;      
    }
    
    /**
    * Create child element "text:user-field-decl".
    */
    public OdfUserFieldDeclElement createUserFieldDeclElement(OdfValueType   _aValueType, String   _aName)
    {
        OdfUserFieldDeclElement  _nUserFieldDecl = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfUserFieldDeclElement.class);
        _nUserFieldDecl.setValueType( _aValueType);
        _nUserFieldDecl.setName( _aName);
        this.appendChild( _nUserFieldDecl);
        return  _nUserFieldDecl;      
    }
    
}
