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

package quickfix.iex;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.iex.Logon.MSGTYPE:
				return new quickfix.iex.Logon();
	
			case quickfix.iex.Heartbeat.MSGTYPE:
				return new quickfix.iex.Heartbeat();
	
			case quickfix.iex.TestRequest.MSGTYPE:
				return new quickfix.iex.TestRequest();
	
			case quickfix.iex.ResendRequest.MSGTYPE:
				return new quickfix.iex.ResendRequest();
	
			case quickfix.iex.Reject.MSGTYPE:
				return new quickfix.iex.Reject();
	
			case quickfix.iex.SequenceReset.MSGTYPE:
				return new quickfix.iex.SequenceReset();
	
			case quickfix.iex.Logout.MSGTYPE:
				return new quickfix.iex.Logout();
	
			case quickfix.iex.NewOrderSingle.MSGTYPE:
				return new quickfix.iex.NewOrderSingle();
	
			case quickfix.iex.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.iex.OrderCancelReplaceRequest();
	
			case quickfix.iex.OrderCancelRequest.MSGTYPE:
				return new quickfix.iex.OrderCancelRequest();
	
			case quickfix.iex.ExecutionReport.MSGTYPE:
				return new quickfix.iex.ExecutionReport();
	
			case quickfix.iex.OrderCancelReject.MSGTYPE:
				return new quickfix.iex.OrderCancelReject();
	
			case quickfix.iex.TradeBust.MSGTYPE:
				return new quickfix.iex.TradeBust();
	
		}

		return new quickfix.iex.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.iex.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.iex.field.NoContraBrokers.FIELD:
					return new quickfix.iex.ExecutionReport.NoContraBrokers();
	
				}
				break;
	
			case quickfix.iex.TradeBust.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.iex.field.NoContraBrokers.FIELD:
					return new quickfix.iex.TradeBust.NoContraBrokers();
	
				}
				break;
	
		}

		return null;
	}
}
