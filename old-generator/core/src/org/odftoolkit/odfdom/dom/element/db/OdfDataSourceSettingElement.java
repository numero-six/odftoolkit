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
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.db.OdfDataSourceSettingType;


/**
 * ODF DOM Element implementation for element "<db:data-source-setting>".
 */
public abstract class OdfDataSourceSettingElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -1208408949954803822L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "data-source-setting" );

    public OdfDataSourceSettingElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aDataSourceSettingName, OdfDataSourceSettingType _aDataSourceSettingType)
    {
        setDataSourceSettingName( _aDataSourceSettingName );
        setDataSourceSettingType( _aDataSourceSettingType );
    }

    /**
     * Get value of attribute "db:data-source-setting-is-list".
     */
    public Boolean getDataSourceSettingIsList()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-is-list" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:data-source-setting-is-list".
     */
    public void setDataSourceSettingIsList( Boolean _aDataSourceSettingIsList )
    {                    
        String aStringVal = OdfBoolean.toString( _aDataSourceSettingIsList );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-is-list" ), aStringVal );
    }

    /**
     * Get value of attribute "db:data-source-setting-name".
     */
    public String getDataSourceSettingName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-name" ) );
    }

    /**
     * Set value of attribute "db:data-source-setting-name".
     */
    public void setDataSourceSettingName( String _aDataSourceSettingName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-name" ), _aDataSourceSettingName );
    }

    /**
     * Get value of attribute "db:data-source-setting-type".
     */
    public OdfDataSourceSettingType getDataSourceSettingType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-type" ) );
        return OdfDataSourceSettingType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:data-source-setting-type".
     */
    public void setDataSourceSettingType( OdfDataSourceSettingType _aDataSourceSettingType )
    {                    
        String aStringVal = OdfDataSourceSettingType.toString( _aDataSourceSettingType );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "data-source-setting-type" ), aStringVal );
    }

}
