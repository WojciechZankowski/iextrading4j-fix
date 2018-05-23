
package quickfix.iex;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.iex.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.iex.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.iex.field.GapFillFlag get(quickfix.iex.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.iex.field.GapFillFlag());
	}

	public boolean isSet(quickfix.iex.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.iex.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.iex.field.NewSeqNo get(quickfix.iex.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.iex.field.NewSeqNo());
	}

	public boolean isSet(quickfix.iex.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
