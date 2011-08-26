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

package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<dr3d:light>".
 */
public abstract class OdfLightElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -9093021378317517565L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DR3D, "light" );

    public OdfLightElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aDirection)
    {
        setDirection( _aDirection );
    }

    /**
     * Get value of attribute "dr3d:diffuse-color".
     */
    public String getDiffuseColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "diffuse-color" ) );
    }

    /**
     * Set value of attribute "dr3d:diffuse-color".
     */
    public void setDiffuseColor( String _aDiffuseColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "diffuse-color" ), _aDiffuseColor );
    }

    /**
     * Get value of attribute "dr3d:direction".
     */
    public String getDirection()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "direction" ) );
    }

    /**
     * Set value of attribute "dr3d:direction".
     */
    public void setDirection( String _aDirection )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "direction" ), _aDirection );
    }

    /**
     * Get value of attribute "dr3d:enabled".
     */
    public Boolean getEnabled()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "enabled" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:enabled".
     */
    public void setEnabled( Boolean _aEnabled )
    {                    
        String aStringVal = OdfBoolean.toString( _aEnabled );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "enabled" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:specular".
     */
    public Boolean getSpecular()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "specular" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:specular".
     */
    public void setSpecular( Boolean _aSpecular )
    {                    
        String aStringVal = OdfBoolean.toString( _aSpecular );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "specular" ), aStringVal );
    }

}
