
package quickfix.iex;

import quickfix.FieldNotFound;


public class OrderCancelRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "F";
	

	public OrderCancelRequest() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelRequest(quickfix.iex.field.ClOrdID clOrdID, quickfix.iex.field.OrigClOrdID origClOrdID, quickfix.iex.field.Side side, quickfix.iex.field.Symbol symbol, quickfix.iex.field.TransactTime transactTime) {
		this();
		setField(clOrdID);
		setField(origClOrdID);
		setField(side);
		setField(symbol);
		setField(transactTime);
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

	public void set(quickfix.iex.field.OrderQty value) {
		setField(value);
	}

	public quickfix.iex.field.OrderQty get(quickfix.iex.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.iex.field.OrderQty());
	}

	public boolean isSet(quickfix.iex.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
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

	public void set(quickfix.iex.field.Side value) {
		setField(value);
	}

	public quickfix.iex.field.Side get(quickfix.iex.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.iex.field.Side());
	}

	public boolean isSet(quickfix.iex.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.iex.field.Symbol value) {
		setField(value);
	}

	public quickfix.iex.field.Symbol get(quickfix.iex.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.iex.field.Symbol());
	}

	public boolean isSet(quickfix.iex.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.iex.field.TransactTime value) {
		setField(value);
	}

	public quickfix.iex.field.TransactTime get(quickfix.iex.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.iex.field.TransactTime());
	}

	public boolean isSet(quickfix.iex.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
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
