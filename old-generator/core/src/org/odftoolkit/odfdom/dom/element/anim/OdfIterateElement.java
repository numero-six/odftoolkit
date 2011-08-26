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

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.presentation.OdfNodeType;
import org.odftoolkit.odfdom.dom.type.presentation.OdfPresetClassType;
import org.odftoolkit.odfdom.dom.type.OdfId;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.smil.OdfRestartType;
import org.odftoolkit.odfdom.dom.type.smil.OdfRestartDefaultType;
import org.odftoolkit.odfdom.dom.type.smil.OdfFillType;
import org.odftoolkit.odfdom.dom.type.smil.OdfFillDefaultType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.smil.OdfEndsyncType;

import org.odftoolkit.odfdom.dom.type.svg.OdfType;
import org.odftoolkit.odfdom.dom.type.svg.OdfType;

/**
 * ODF DOM Element implementation for element "<anim:iterate>".
 */
public abstract class OdfIterateElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.ANIM, "iterate" );

    public OdfIterateElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "presentation:node-type".
     */
    public OdfNodeType getPresentationNode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfNodeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:node-type".
     */
    public void setPresentationNode( OdfNodeType _aPresentationNode )
    {                    
        String aStringVal = OdfNodeType.toString( _aPresentationNode );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:preset-id".
     */
    public String getPresetId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ) );
    }

    /**
     * Set value of attribute "presentation:preset-id".
     */
    public void setPresetId( String _aPresetId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ), _aPresetId );
    }

    /**
     * Get value of attribute "presentation:preset-sub-type".
     */
    public String getPresetSubType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ) );
    }

    /**
     * Set value of attribute "presentation:preset-sub-type".
     */
    public void setPresetSubType( String _aPresetSubType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ), _aPresetSubType );
    }

    /**
     * Get value of attribute "presentation:preset-class".
     */
    public OdfPresetClassType getPresetClass()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "custom";
        }

        return OdfPresetClassType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:preset-class".
     */
    public void setPresetClass( OdfPresetClassType _aPresetClass )
    {                    
        String aStringVal = OdfPresetClassType.toString( _aPresetClass );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:master-element".
     */
    public String getMasterElement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:master-element".
     */
    public void setMasterElement( String _aMasterElement )
    {                    
        String aStringVal = OdfId.toString( _aMasterElement );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:group-id".
     */
    public String getGroupId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ) );
    }

    /**
     * Set value of attribute "presentation:group-id".
     */
    public void setGroupId( String _aGroupId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ), _aGroupId );
    }

    /**
     * Get value of attribute "anim:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ) );
    }

    /**
     * Set value of attribute "anim:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ), _aId );
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
     * Get value of attribute "smil:targetElement".
     */
    public String getTargetElement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:targetElement".
     */
    public void setTargetElement( String _aTargetElement )
    {                    
        String aStringVal = OdfId.toString( _aTargetElement );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ), aStringVal );
    }

    /**
     * Get value of attribute "anim:sub-item".
     */
    public String getSubItem()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ) );
    }

    /**
     * Set value of attribute "anim:sub-item".
     */
    public void setSubItem( String _aSubItem )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ), _aSubItem );
    }

    /**
     * Get value of attribute "anim:iterate-type".
     */
    public String getIterateType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "iterate-type" ) );
    }

    /**
     * Set value of attribute "anim:iterate-type".
     */
    public void setIterateType( String _aIterateType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "iterate-type" ), _aIterateType );
    }

    /**
     * Get value of attribute "anim:iterate-interval".
     */
    public Duration getIterateInterval()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "iterate-interval" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "anim:iterate-interval".
     */
    public void setIterateInterval( Duration _aIterateInterval )
    {                    
        String aStringVal = OdfDuration.toString( _aIterateInterval );
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "iterate-interval" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:begin".
     */
    public String getBegin()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ) );
    }

    /**
     * Set value of attribute "smil:begin".
     */
    public void setBegin( String _aBegin )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ), _aBegin );
    }

    /**
     * Get value of attribute "smil:end".
     */
    public String getEnd()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ) );
    }

    /**
     * Set value of attribute "smil:end".
     */
    public void setEnd( String _aEnd )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ), _aEnd );
    }

    /**
     * Get value of attribute "smil:dur".
     */
    public String getDur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ) );
    }

    /**
     * Set value of attribute "smil:dur".
     */
    public void setDur( String _aDur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ), _aDur );
    }

    /**
     * Get value of attribute "smil:repeatDur".
     */
    public String getRepeatDur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ) );
    }

    /**
     * Set value of attribute "smil:repeatDur".
     */
    public void setRepeatDur( String _aRepeatDur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ), _aRepeatDur );
    }

    /**
     * Get value of attribute "smil:repeatCount".
     */
    public Integer getRepeatCount()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:repeatCount".
     */
    public void setRepeatCount( Integer _aRepeatCount )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aRepeatCount );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restart".
     */
    public OdfRestartType getRestart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfRestartType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restart".
     */
    public void setRestart( OdfRestartType _aRestart )
    {                    
        String aStringVal = OdfRestartType.toString( _aRestart );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restartDefault".
     */
    public OdfRestartDefaultType getRestartDefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "inherit";
        }

        return OdfRestartDefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restartDefault".
     */
    public void setRestartDefault( OdfRestartDefaultType _aRestartDefault )
    {                    
        String aStringVal = OdfRestartDefaultType.toString( _aRestartDefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fill".
     */
    public OdfFillType getFill()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ) );
        return OdfFillType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fill".
     */
    public void setFill( OdfFillType _aFill )
    {                    
        String aStringVal = OdfFillType.toString( _aFill );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fillDefault".
     */
    public OdfFillDefaultType getFillDefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ) );
        return OdfFillDefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fillDefault".
     */
    public void setFillDefault( OdfFillDefaultType _aFillDefault )
    {                    
        String aStringVal = OdfFillDefaultType.toString( _aFillDefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:accelerate".
     */
    public Double getAccelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:accelerate".
     */
    public void setAccelerate( Double _aAccelerate )
    {                    
        String aStringVal = Double.toString( _aAccelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:decelerate".
     */
    public Double getDecelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:decelerate".
     */
    public void setDecelerate( Double _aDecelerate )
    {                    
        String aStringVal = Double.toString( _aDecelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:autoReverse".
     */
    public Boolean getAutoReverse()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:autoReverse".
     */
    public void setAutoReverse( Boolean _aAutoReverse )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutoReverse );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:endsync".
     */
    public OdfEndsyncType getEndsync()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "endsync" ) );
        return OdfEndsyncType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:endsync".
     */
    public void setEndsync( OdfEndsyncType _aEndsync )
    {                    
        String aStringVal = OdfEndsyncType.toString( _aEndsync );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "endsync" ), aStringVal );
    }

    /**
    * Create child element "anim:animate".
    */
    public OdfAnimateElement createAnimateElement(String   _aAttributeName)
    {
        OdfAnimateElement  _nAnimate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAnimateElement.class);
        _nAnimate.setAttributeName( _aAttributeName);
        this.appendChild( _nAnimate);
        return  _nAnimate;      
    }
    
    /**
    * Create child element "anim:set".
    */
    public OdfSetElement createSetElement(String   _aAttributeName)
    {
        OdfSetElement  _nSet = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSetElement.class);
        _nSet.setAttributeName( _aAttributeName);
        this.appendChild( _nSet);
        return  _nSet;      
    }
    
    /**
    * Create child element "anim:animateMotion".
    */
    public OdfAnimateMotionElement createAnimateMotionElement(String   _aAttributeName)
    {
        OdfAnimateMotionElement  _nAnimateMotion = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAnimateMotionElement.class);
        _nAnimateMotion.setAttributeName( _aAttributeName);
        this.appendChild( _nAnimateMotion);
        return  _nAnimateMotion;      
    }
    
    /**
    * Create child element "anim:animateColor".
    */
    public OdfAnimateColorElement createAnimateColorElement(String   _aAttributeName)
    {
        OdfAnimateColorElement  _nAnimateColor = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAnimateColorElement.class);
        _nAnimateColor.setAttributeName( _aAttributeName);
        this.appendChild( _nAnimateColor);
        return  _nAnimateColor;      
    }
    
    /**
    * Create child element "anim:animateTransform".
    */
    public OdfAnimateTransformElement createAnimateTransformElement(String   _aAttributeName, OdfType   _aType)
    {
        OdfAnimateTransformElement  _nAnimateTransform = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAnimateTransformElement.class);
        _nAnimateTransform.setAttributeName( _aAttributeName);
        _nAnimateTransform.setType( _aType);
        this.appendChild( _nAnimateTransform);
        return  _nAnimateTransform;      
    }
    
    /**
    * Create child element "anim:transitionFilter".
    */
    public OdfTransitionFilterElement createTransitionFilterElement(String   _aType)
    {
        OdfTransitionFilterElement  _nTransitionFilter = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTransitionFilterElement.class);
        _nTransitionFilter.setType( _aType);
        this.appendChild( _nTransitionFilter);
        return  _nTransitionFilter;      
    }
    
    /**
    * Create child element "anim:par".
    */
    public OdfParElement createParElement()
    {
        OdfParElement  _nPar = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfParElement.class);
        this.appendChild( _nPar);
        return  _nPar;
    }                   
               
    /**
    * Create child element "anim:seq".
    */
    public OdfSeqElement createSeqElement()
    {
        OdfSeqElement  _nSeq = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfSeqElement.class);
        this.appendChild( _nSeq);
        return  _nSeq;
    }                   
               
    /**
    * Create child element "anim:iterate".
    */
    public OdfIterateElement createIterateElement()
    {
        OdfIterateElement  _nIterate = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfIterateElement.class);
        this.appendChild( _nIterate);
        return  _nIterate;
    }                   
               
    /**
    * Create child element "anim:audio".
    */
    public OdfAudioElement createAudioElement()
    {
        OdfAudioElement  _nAudio = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfAudioElement.class);
        this.appendChild( _nAudio);
        return  _nAudio;
    }                   
               
    /**
    * Create child element "anim:command".
    */
    public OdfCommandElement createCommandElement(String   _aCommand)
    {
        OdfCommandElement  _nCommand = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCommandElement.class);
        _nCommand.setCommand( _aCommand);
        this.appendChild( _nCommand);
        return  _nCommand;      
    }
    
}
