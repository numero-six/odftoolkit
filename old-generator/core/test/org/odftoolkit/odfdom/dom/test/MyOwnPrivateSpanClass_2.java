/*
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
 */

package org.odftoolkit.odfdom.dom.test;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.text.OdfSpanElement;


public class MyOwnPrivateSpanClass_2 extends OdfSpanElement {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3782225493052113393L;

	/** Creates a new instance of this class */
    public MyOwnPrivateSpanClass_2(OdfFileDom ownerDoc) {
        super(ownerDoc);
    }
}
