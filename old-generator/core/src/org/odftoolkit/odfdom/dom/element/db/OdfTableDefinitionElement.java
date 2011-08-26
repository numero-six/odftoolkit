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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;

;

/**
 * ODF DOM Element implementation for element "<db:table-definition>".
 */
public abstract class OdfTableDefinitionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "table-definition" );

    public OdfTableDefinitionElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "db:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ) );
    }

    /**
     * Set value of attribute "db:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ), _aName );
    }

    /**
     * Get value of attribute "db:catalog-name".
     */
    public String getCatalogName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "catalog-name" ) );
    }

    /**
     * Set value of attribute "db:catalog-name".
     */
    public void setCatalogName( String _aCatalogName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "catalog-name" ), _aCatalogName );
    }

    /**
     * Get value of attribute "db:schema-name".
     */
    public String getSchemaName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "schema-name" ) );
    }

    /**
     * Set value of attribute "db:schema-name".
     */
    public void setSchemaName( String _aSchemaName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "schema-name" ), _aSchemaName );
    }

    /**
     * Get value of attribute "db:type".
     */
    public String getType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "type" ) );
    }

    /**
     * Set value of attribute "db:type".
     */
    public void setType( String _aType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "type" ), _aType );
    }

    /**
    * Create child element "db:column-definitions".
    */
    public OdfColumnDefinitionsElement createColumnDefinitionsElement()
    {
        OdfColumnDefinitionsElement  _nColumnDefinitions = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfColumnDefinitionsElement.class);
        this.appendChild( _nColumnDefinitions);
        return  _nColumnDefinitions;
    }                   
               
    /**
    * Create child element "db:keys".
    */
    public OdfKeysElement createKeysElement()
    {
        OdfKeysElement  _nKeys = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfKeysElement.class);
        this.appendChild( _nKeys);
        return  _nKeys;
    }                   
               
    /**
    * Create child element "db:indices".
    */
    public OdfIndicesElement createIndicesElement()
    {
        OdfIndicesElement  _nIndices = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfIndicesElement.class);
        this.appendChild( _nIndices);
        return  _nIndices;
    }                   
               
}
