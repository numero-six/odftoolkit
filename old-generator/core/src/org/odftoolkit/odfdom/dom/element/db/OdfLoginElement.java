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
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;


/**
 * ODF DOM Element implementation for element "<db:login>".
 */
public abstract class OdfLoginElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -6195443469778249389L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "login" );

    public OdfLoginElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "db:user-name".
     */
    public String getUserName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "user-name" ) );
    }

    /**
     * Set value of attribute "db:user-name".
     */
    public void setUserName( String _aUserName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "user-name" ), _aUserName );
    }

    /**
     * Get value of attribute "db:use-system-user".
     */
    public Boolean getUseSystemUser()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "use-system-user" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:use-system-user".
     */
    public void setUseSystemUser( Boolean _aUseSystemUser )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseSystemUser );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "use-system-user" ), aStringVal );
    }

    /**
     * Get value of attribute "db:is-password-required".
     */
    public Boolean getIsPasswordRequired()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-password-required" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-password-required".
     */
    public void setIsPasswordRequired( Boolean _aIsPasswordRequired )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsPasswordRequired );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-password-required" ), aStringVal );
    }

    /**
     * Get value of attribute "db:login-timeout".
     */
    public Integer getLoginTimeout()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "login-timeout" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:login-timeout".
     */
    public void setLoginTimeout( Integer _aLoginTimeout )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aLoginTimeout );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "login-timeout" ), aStringVal );
    }

}
