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

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.type.OdfCellRangeAddressList;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfId;

import org.odftoolkit.odfdom.dom.type.chart.OdfDimensionType;
import org.odftoolkit.odfdom.dom.type.chart.OdfDimensionType;

/**
 * ODF DOM Element implementation for element "<chart:series>".
 */
public abstract class OdfSeriesElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.CHART, "series" );

    public OdfSeriesElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.get( OdfNamespace.CHART, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "chart:values-cell-range-address".
     */
    public String getValuesCellRangeAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "values-cell-range-address" ) );
        return OdfCellRangeAddressList.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:values-cell-range-address".
     */
    public void setValuesCellRangeAddress( String _aValuesCellRangeAddress )
    {                    
        String aStringVal = OdfCellRangeAddressList.toString( _aValuesCellRangeAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "values-cell-range-address" ), aStringVal );
    }

    /**
     * Get value of attribute "chart:label-cell-address".
     */
    public String getLabelCellAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "label-cell-address" ) );
        return OdfCellRangeAddressList.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:label-cell-address".
     */
    public void setLabelCellAddress( String _aLabelCellAddress )
    {                    
        String aStringVal = OdfCellRangeAddressList.toString( _aLabelCellAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "label-cell-address" ), aStringVal );
    }

    /**
     * Get value of attribute "chart:class".
     */
    public String getChartClass()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.CHART, "class" ) );
    }

    /**
     * Set value of attribute "chart:class".
     */
    public void setChartClass( String _aChartClass )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "class" ), _aChartClass );
    }

    /**
     * Get value of attribute "chart:attached-axis".
     */
    public String getAttachedAxis()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.CHART, "attached-axis" ) );
    }

    /**
     * Set value of attribute "chart:attached-axis".
     */
    public void setAttachedAxis( String _aAttachedAxis )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "attached-axis" ), _aAttachedAxis );
    }

    /**
     * Get value of attribute "chart:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ), aStringVal );
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
    * Create child element "chart:domain".
    */
    public OdfDomainElement createDomainElement()
    {
        OdfDomainElement  _nDomain = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDomainElement.class);
        this.appendChild( _nDomain);
        return  _nDomain;
    }                   
               
    /**
    * Create child element "chart:mean-value".
    */
    public OdfMeanValueElement createMeanValueElement()
    {
        OdfMeanValueElement  _nMeanValue = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfMeanValueElement.class);
        this.appendChild( _nMeanValue);
        return  _nMeanValue;
    }                   
               
    /**
    * Create child element "chart:regression-curve".
    */
    public OdfRegressionCurveElement createRegressionCurveElement()
    {
        OdfRegressionCurveElement  _nRegressionCurve = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfRegressionCurveElement.class);
        this.appendChild( _nRegressionCurve);
        return  _nRegressionCurve;
    }                   
               
    /**
    * Create child element "chart:error-indicator".
    */
    public OdfErrorIndicatorElement createErrorIndicatorElement(OdfDimensionType   _aDimension)
    {
        OdfErrorIndicatorElement  _nErrorIndicator = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfErrorIndicatorElement.class);
        _nErrorIndicator.setDimension( _aDimension);
        this.appendChild( _nErrorIndicator);
        return  _nErrorIndicator;      
    }
    
    /**
    * Create child element "chart:data-point".
    */
    public OdfDataPointElement createDataPointElement()
    {
        OdfDataPointElement  _nDataPoint = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDataPointElement.class);
        this.appendChild( _nDataPoint);
        return  _nDataPoint;
    }                   
               
    /**
    * Create child element "chart:data-label".
    */
    public OdfDataLabelElement createDataLabelElement()
    {
        OdfDataLabelElement  _nDataLabel = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDataLabelElement.class);
        this.appendChild( _nDataLabel);
        return  _nDataLabel;
    }                   
               
}
