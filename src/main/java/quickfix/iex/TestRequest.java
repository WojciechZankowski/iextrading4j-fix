
package quickfix.iex;

import quickfix.FieldNotFound;


public class TestRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "1";
	

	public TestRequest() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public TestRequest(quickfix.iex.field.TestReqID testReqID) {
		this();
		setField(testReqID);
	}
	
	public void set(quickfix.iex.field.TestReqID value) {
		setField(value);
	}

	public quickfix.iex.field.TestReqID get(quickfix.iex.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.iex.field.TestReqID());
	}

	public boolean isSet(quickfix.iex.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
