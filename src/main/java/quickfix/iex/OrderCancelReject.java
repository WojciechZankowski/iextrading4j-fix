
package quickfix.iex;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(quickfix.iex.field.ClOrdID clOrdID, quickfix.iex.field.OrderID orderID, quickfix.iex.field.OrdStatus ordStatus, quickfix.iex.field.OrigClOrdID origClOrdID, quickfix.iex.field.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(clOrdID);
		setField(orderID);
		setField(ordStatus);
		setField(origClOrdID);
		setField(cxlRejResponseTo);
	}
	
	public void set(quickfix.iex.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.iex.field.ClOrdID get(quickfix.iex.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.iex.field.ClOrdID());
	}

	public boolean isSet(quickfix.iex.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.iex.field.OrderID value) {
		setField(value);
	}

	public quickfix.iex.field.OrderID get(quickfix.iex.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.iex.field.OrderID());
	}

	public boolean isSet(quickfix.iex.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.iex.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.iex.field.OrdStatus get(quickfix.iex.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.iex.field.OrdStatus());
	}

	public boolean isSet(quickfix.iex.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.iex.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.iex.field.OrigClOrdID get(quickfix.iex.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.iex.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.iex.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.iex.field.CxlRejReason value) {
		setField(value);
	}

	public quickfix.iex.field.CxlRejReason get(quickfix.iex.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new quickfix.iex.field.CxlRejReason());
	}

	public boolean isSet(quickfix.iex.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
	}

	public void set(quickfix.iex.field.CxlRejResponseTo value) {
		setField(value);
	}

	public quickfix.iex.field.CxlRejResponseTo get(quickfix.iex.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new quickfix.iex.field.CxlRejResponseTo());
	}

	public boolean isSet(quickfix.iex.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(quickfix.iex.field.Account value) {
		setField(value);
	}

	public quickfix.iex.field.Account get(quickfix.iex.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.iex.field.Account());
	}

	public boolean isSet(quickfix.iex.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
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

	public void set(quickfix.iex.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.iex.field.SymbolSfx get(quickfix.iex.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.iex.field.SymbolSfx());
	}

	public boolean isSet(quickfix.iex.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

}
