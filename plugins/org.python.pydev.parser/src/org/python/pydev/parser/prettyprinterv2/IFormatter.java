/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on Feb 17, 2006
 */
package org.python.pydev.parser.prettyprinterv2;

import org.eclipse.jface.text.IDocument;
import org.python.pydev.core.IPyEdit;
import org.python.pydev.core.docutils.SyntaxErrorException;
import org.python.pydev.core.docutils.PySelection;

/**
 * This interface is provided for clients that want to implement code-formatting
 */
public interface IFormatter {

    /**
     * Formats the whole doc
     * @throws SyntaxErrorException 
     */
    void formatAll(IDocument doc, IPyEdit edit, boolean isOpenedFile, boolean throwSyntaxError) throws SyntaxErrorException;

    /**
     * Formats the selection.
     */
    void formatSelection(IDocument doc, int startLine, int endLineIndex, IPyEdit edit, PySelection ps);

}
