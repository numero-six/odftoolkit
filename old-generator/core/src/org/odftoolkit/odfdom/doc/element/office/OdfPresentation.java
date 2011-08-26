
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

package org.odftoolkit.odfdom.doc.element.office;

import java.util.Iterator;
import java.util.Vector;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.doc.element.draw.OdfPage;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.element.office.OdfPresentationElement;
import org.w3c.dom.Node;

/**
 *
 */
public class OdfPresentation extends OdfPresentationElement
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4270501450912600653L;
	private Vector< OdfPage > mPages;
    
    public OdfPresentation( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc );
    }

    public OdfPage getPageAt( int index )
    {
        if( (mPages != null) || (mPages.size() <= index) )
            return mPages.get(index);
        else
            return null;
    }    
    
    public int getPageCount()
    {
        if( mPages != null )
            return mPages.size();
        else
            return 0;
    }                
    
    public OdfPage getPage( String name )
    {
        if( mPages != null )
        {
            Iterator< OdfPage > iter = mPages.iterator();
            while( iter.hasNext() )
            {
                OdfPage page = iter.next();
                if( page.getName().equals( name ) )
                    return page;
            }
        }
        return null;
    }
    
    public Iterator< OdfPage > getPages()
    {
        if( mPages != null )
            return mPages.iterator();
        else
            return new Vector< OdfPage >().iterator();
    }

    /** override this method to get notified about element insertion
     */
    @Override
	protected void onOdfNodeInserted( OdfElement node, Node refNode )
    {
        if( node instanceof OdfPage )
        {
            OdfPage page = (OdfPage)node;
            
            if( mPages == null )
            {
                mPages = new Vector< OdfPage >();
            }
            else if( refNode != null )
            {                    
                int index = -1;
                OdfPage refPage = findPreviousChildNode( OdfPage.class, node );
                if( refPage != null )
                    index = mPages.indexOf(refPage);
                mPages.insertElementAt(page, index+1);
                return;
            }
            mPages.add(page);
        }
    }
            
    /** override this method to get notified about element insertion
     */
    @Override
	protected void onOdfNodeRemoved( OdfElement node )
    {
        if( node instanceof OdfPage )
        {
            if( mPages != null )
            {
                OdfPage page = (OdfPage)node;
                mPages.remove( page );            
            }
        }
    }    
}
