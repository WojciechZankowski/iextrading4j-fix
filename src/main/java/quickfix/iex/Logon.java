
package quickfix.iex;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.iex.field.HeartBtInt heartBtInt) {
		this();
		setField(heartBtInt);
	}
	
	public void set(quickfix.iex.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.iex.field.HeartBtInt get(quickfix.iex.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.iex.field.HeartBtInt());
	}

	public boolean isSet(quickfix.iex.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField();
	}

}
