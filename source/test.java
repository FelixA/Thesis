/*--
 Copyright (C) 2000-2004 Jason Hunter & Brett McLaughlin.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows
    these conditions in the documentation and/or other materials
    provided with the distribution.

 3. The name "JDOM" must not be used to endorse or promote products
    derived from this software without prior written permission.  For
    written permission, please contact <request_AT_jdom_DOT_org>.

 4. Products derived from this software may not be called "JDOM", nor
    may "JDOM" appear in their name, without prior written permission
    from the JDOM Project Management <request_AT_jdom_DOT_org>.
 */

package org.jdom;

/**
 * An XML DOCTYPE declaration.  Method allow the user to get and set the
 * root element name, public id, and system id.
 *
 * @author Brett McLaughlin
 * @author Jason Hunter
 * @version $Revision: 1.31 $, $Date: 2004/02/27 11:32:57 $
 */
public class DocType extends Content {

    private static final String CVS_ID =
      "@(#) $RCSfile: DocType.java,v $ $Revision: 1.31 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";

    /** The element being constrained */
    protected String elementName;

    /** The public ID of the DOCTYPE */
    protected String publicID;

    /** The system ID of the DOCTYPE */
    protected String systemID;

    /** The internal subset of the DOCTYPE */
    protected String internalSubset;

    /**
     * Default, no-args constructor for implementations to use if needed.
     */
    protected DocType() {}

	...
	...
	...
}	