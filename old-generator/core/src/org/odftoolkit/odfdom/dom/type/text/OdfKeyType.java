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
package org.odftoolkit.odfdom.dom.type.text;

public enum OdfKeyType
{
              ISSN( "issn" ), VOLUME( "volume" ), TITLE( "title" ), CUSTOM4( "custom4" ), ADDRESS( "address" ), BOOKTITLE( "booktitle" ), PUBLISHER( "publisher" ), CUSTOM3( "custom3" ), REPORT_TYPE( "report-type" ), CUSTOM5( "custom5" ), CUSTOM2( "custom2" ), EDITION( "edition" ), BIBLIOGRAPHY_TYPE( "bibliography-type" ), URL( "url" ), SERIES( "series" ), SCHOOL( "school" ), NUMBER( "number" ), MONTH( "month" ), ORGANIZATIONS( "organizations" ), CUSTOM1( "custom1" ), HOWPUBLISHED( "howpublished" ), ANNOTE( "annote" ), ISBN( "isbn" ), NOTE( "note" ), EDITOR( "editor" ), CHAPTER( "chapter" ), YEAR( "year" ), PAGES( "pages" ), INSTITUTION( "institution" ), JOURNAL( "journal" ), IDENTIFIER( "identifier" ), AUTHOR( "author" );

    private String m_aValue;

    OdfKeyType( String _aValue )
    {
        m_aValue = _aValue;
    }

    @Override
	public String toString()
    {
        return m_aValue;
    }

    public static String toString( OdfKeyType _aEnum )
    {
        return _aEnum.toString();
    }

    public static OdfKeyType enumValueOf( String _aString )
    {
        for( OdfKeyType aIter : values() )
        {
            if( _aString.equals( aIter.toString() ) )
            {
                return aIter;
            }
        }
        return null;
    }

}
