/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.iex.field;

import quickfix.CharField;


public class ExecType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 150;
	public static final char NEW = '0';
	public static final char PARTIAL_FILL = '1';
	public static final char FILL = '2';
	public static final char CANCELED = '4';
	public static final char REPLACE = '5';
	public static final char PENDING_CANCEL = '6';
	public static final char REJECTED = '8';
	public static final char PENDING_REPLACE = 'E';
	
	public ExecType() {
		super(150);
	}

	public ExecType(char data) {
		super(150, data);
	}
	
}
