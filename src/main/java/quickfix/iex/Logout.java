
package quickfix.iex;

import quickfix.FieldNotFound;


public class Logout extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "5";
	

	public Logout() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
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
