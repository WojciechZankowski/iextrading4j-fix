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

import quickfix.FieldNotFound;
  
import quickfix.field.*;


public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		header = new Header(this);
		trailer = new Trailer();
		
		getHeader().setField(new BeginString("FIX.4.2"));
			
	}

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(quickfix.iex.field.BeginString value) {
		setField(value);
	}

	public quickfix.iex.field.BeginString get(quickfix.iex.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.iex.field.BeginString());
	}

	public boolean isSet(quickfix.iex.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.iex.field.BodyLength value) {
		setField(value);
	}

	public quickfix.iex.field.BodyLength get(quickfix.iex.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.iex.field.BodyLength());
	}

	public boolean isSet(quickfix.iex.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.iex.field.MsgType value) {
		setField(value);
	}

	public quickfix.iex.field.MsgType get(quickfix.iex.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.iex.field.MsgType());
	}

	public boolean isSet(quickfix.iex.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.iex.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.iex.field.MsgSeqNum get(quickfix.iex.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.iex.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.iex.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.iex.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.iex.field.SenderCompID get(quickfix.iex.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.iex.field.SenderCompID());
	}

	public boolean isSet(quickfix.iex.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.iex.field.SendingTime value) {
		setField(value);
	}

	public quickfix.iex.field.SendingTime get(quickfix.iex.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.iex.field.SendingTime());
	}

	public boolean isSet(quickfix.iex.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.iex.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.iex.field.TargetCompID get(quickfix.iex.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.iex.field.TargetCompID());
	}

	public boolean isSet(quickfix.iex.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	}
	
	
	public void set(quickfix.iex.field.CheckSum value) {
		setField(value);
	}

	public quickfix.iex.field.CheckSum get(quickfix.iex.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.iex.field.CheckSum());
	}

	public boolean isSet(quickfix.iex.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
