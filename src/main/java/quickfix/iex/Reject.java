
package quickfix.iex;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public Reject(quickfix.iex.field.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(quickfix.iex.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.iex.field.RefSeqNum get(quickfix.iex.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.iex.field.RefSeqNum());
	}

	public boolean isSet(quickfix.iex.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.iex.field.SessionRejectReason value) {
		setField(value);
	}

	public quickfix.iex.field.SessionRejectReason get(quickfix.iex.field.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new quickfix.iex.field.SessionRejectReason());
	}

	public boolean isSet(quickfix.iex.field.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
	}

	public void set(quickfix.iex.field.Text value) {
		setField(value);
	}

	public quickfix.iex.field.Text get(quickfix.iex.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.Text getText() throws FieldNotFound {
		return get(new quickfix.iex.field.Text());
	}

	public boolean isSet(quickfix.iex.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
