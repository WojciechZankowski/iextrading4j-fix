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

import quickfix.StringField;


public class ExecInst extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 18;
	public static final String MIDPRICE_PEG = "M";
	public static final String PRIMARY_PEG = "R";
	public static final String DISCRETIONARY_PEG = "d";
	public static final String MARKET_MAKER_PEG = "Q";
	public static final String ISO = "f";
	public static final String IEX_ONLY = "i";
	public static final String ROUTER_BASIC = "s";
	public static final String ROUTER = "u";
	public static final String TRADE_AT_ISO = "y";
	
	public ExecInst() {
		super(18);
	}

	public ExecInst(String data) {
		super(18, data);
	}
	
}
