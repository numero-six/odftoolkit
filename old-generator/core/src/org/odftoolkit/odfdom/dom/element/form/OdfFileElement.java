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

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.OdfCellAddress;


/**
 * ODF DOM Element implementation for element "<form:file>".
 */
public abstract class OdfFileElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -253576497091786935L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "file" );

    public OdfFileElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aId, String _aXmlid)
    {
        setId( _aId );
        setXmlid( _aXmlid );
    }

    /**
     * Get value of attribute "form:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ) );
    }

    /**
     * Set value of attribute "form:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ), _aName );
    }

    /**
     * Get value of attribute "form:control-implementation".
     */
    public String getControlImplementation()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ) );
    }

    /**
     * Set value of attribute "form:control-implementation".
     */
    public void setControlImplementation( String _aControlImplementation )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ), _aControlImplementation );
    }

    /**
     * Get value of attribute "form:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ) );
    }

    /**
     * Set value of attribute "form:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ), _aId );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xforms:bind".
     */
    public String getBind()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ) );
    }

    /**
     * Set value of attribute "xforms:bind".
     */
    public void setBind( String _aBind )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ), _aBind );
    }

    /**
     * Get value of attribute "form:current-value".
     */
    public String getCurrentValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ) );
    }

    /**
     * Set value of attribute "form:current-value".
     */
    public void setCurrentValue( String _aCurrentValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ), _aCurrentValue );
    }

    /**
     * Get value of attribute "form:disabled".
     */
    public Boolean getDisabled()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:disabled".
     */
    public void setDisabled( Boolean _aDisabled )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisabled );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ), aStringVal );
    }

    /**
     * Get value of attribute "form:max-length".
     */
    public Integer getMaxLength()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:max-length".
     */
    public void setMaxLength( Integer _aMaxLength )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aMaxLength );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ), aStringVal );
    }

    /**
     * Get value of attribute "form:printable".
     */
    public Boolean getPrintable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:printable".
     */
    public void setPrintable( Boolean _aPrintable )
    {                    
        String aStringVal = OdfBoolean.toString( _aPrintable );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ), aStringVal );
    }

    /**
     * Get value of attribute "form:readonly".
     */
    public Boolean getReadonly()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:readonly".
     */
    public void setReadonly( Boolean _aReadonly )
    {                    
        String aStringVal = OdfBoolean.toString( _aReadonly );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-index".
     */
    public Integer getTabIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-index".
     */
    public void setTabIndex( Integer _aTabIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aTabIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-stop".
     */
    public Boolean getTabStop()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-stop".
     */
    public void setTabStop( Boolean _aTabStop )
    {                    
        String aStringVal = OdfBoolean.toString( _aTabStop );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ), aStringVal );
    }

    /**
     * Get value of attribute "form:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ) );
    }

    /**
     * Set value of attribute "form:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "form:value".
     */
    public String getValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ) );
    }

    /**
     * Set value of attribute "form:value".
     */
    public void setValue( String _aValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ), _aValue );
    }

    /**
     * Get value of attribute "form:linked-cell".
     */
    public String getLinkedCell()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "linked-cell" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:linked-cell".
     */
    public void setLinkedCell( String _aLinkedCell )
    {                    
        String aStringVal = OdfCellAddress.toString( _aLinkedCell );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "linked-cell" ), aStringVal );
    }

}
