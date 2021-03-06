
package quickfix.iex;

import quickfix.FieldNotFound;


public class OrderCancelReplaceRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "G";
	

	public OrderCancelReplaceRequest() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReplaceRequest(quickfix.iex.field.ClOrdID clOrdID, quickfix.iex.field.HandlInst handlInst, quickfix.iex.field.OrdType ordType, quickfix.iex.field.OrigClOrdID origClOrdID, quickfix.iex.field.Side side, quickfix.iex.field.Symbol symbol, quickfix.iex.field.TransactTime transactTime) {
		this();
		setField(clOrdID);
		setField(handlInst);
		setField(ordType);
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

	public void set(quickfix.iex.field.ExecInst value) {
		setField(value);
	}

	public quickfix.iex.field.ExecInst get(quickfix.iex.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.iex.field.ExecInst());
	}

	public boolean isSet(quickfix.iex.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(quickfix.iex.field.HandlInst value) {
		setField(value);
	}

	public quickfix.iex.field.HandlInst get(quickfix.iex.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.iex.field.HandlInst());
	}

	public boolean isSet(quickfix.iex.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
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

	public void set(quickfix.iex.field.OrdType value) {
		setField(value);
	}

	public quickfix.iex.field.OrdType get(quickfix.iex.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.iex.field.OrdType());
	}

	public boolean isSet(quickfix.iex.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
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

	public void set(quickfix.iex.field.OrderCapacity value) {
		setField(value);
	}

	public quickfix.iex.field.OrderCapacity get(quickfix.iex.field.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new quickfix.iex.field.OrderCapacity());
	}

	public boolean isSet(quickfix.iex.field.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(47);
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

	public void set(quickfix.iex.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.iex.field.TimeInForce get(quickfix.iex.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.iex.field.TimeInForce());
	}

	public boolean isSet(quickfix.iex.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
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

	public void set(quickfix.iex.field.Price value) {
		setField(value);
	}

	public quickfix.iex.field.Price get(quickfix.iex.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.iex.field.Price());
	}

	public boolean isSet(quickfix.iex.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
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

	public void set(quickfix.iex.field.MinQty value) {
		setField(value);
	}

	public quickfix.iex.field.MinQty get(quickfix.iex.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.iex.field.MinQty());
	}

	public boolean isSet(quickfix.iex.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

}
