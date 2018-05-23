
package quickfix.iex;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.iex.field.BeginSeqNo beginSeqNo, quickfix.iex.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.iex.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.iex.field.BeginSeqNo get(quickfix.iex.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.iex.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.iex.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.iex.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.iex.field.EndSeqNo get(quickfix.iex.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.iex.field.EndSeqNo());
	}

	public boolean isSet(quickfix.iex.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
