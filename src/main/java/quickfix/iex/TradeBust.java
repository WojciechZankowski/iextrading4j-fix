
package quickfix.iex;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradeBust extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "UCC";
	

	public TradeBust() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public TradeBust(quickfix.iex.field.ClOrdID clOrdID, quickfix.iex.field.ExecID execID, quickfix.iex.field.ExecRefID execRefID, quickfix.iex.field.ExecTransType execTransType, quickfix.iex.field.LastPx lastPx, quickfix.iex.field.LastShares lastShares, quickfix.iex.field.OrderID orderID, quickfix.iex.field.Side side, quickfix.iex.field.Symbol symbol, quickfix.iex.field.TransactTime transactTime) {
		this();
		setField(clOrdID);
		setField(execID);
		setField(execRefID);
		setField(execTransType);
		setField(lastPx);
		setField(lastShares);
		setField(orderID);
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

	public void set(quickfix.iex.field.ExecID value) {
		setField(value);
	}

	public quickfix.iex.field.ExecID get(quickfix.iex.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.iex.field.ExecID());
	}

	public boolean isSet(quickfix.iex.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.iex.field.ExecRefID value) {
		setField(value);
	}

	public quickfix.iex.field.ExecRefID get(quickfix.iex.field.ExecRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExecRefID getExecRefID() throws FieldNotFound {
		return get(new quickfix.iex.field.ExecRefID());
	}

	public boolean isSet(quickfix.iex.field.ExecRefID field) {
		return isSetField(field);
	}

	public boolean isSetExecRefID() {
		return isSetField(19);
	}

	public void set(quickfix.iex.field.ExecTransType value) {
		setField(value);
	}

	public quickfix.iex.field.ExecTransType get(quickfix.iex.field.ExecTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExecTransType getExecTransType() throws FieldNotFound {
		return get(new quickfix.iex.field.ExecTransType());
	}

	public boolean isSet(quickfix.iex.field.ExecTransType field) {
		return isSetField(field);
	}

	public boolean isSetExecTransType() {
		return isSetField(20);
	}

	public void set(quickfix.iex.field.LastPx value) {
		setField(value);
	}

	public quickfix.iex.field.LastPx get(quickfix.iex.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.iex.field.LastPx());
	}

	public boolean isSet(quickfix.iex.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(quickfix.iex.field.LastShares value) {
		setField(value);
	}

	public quickfix.iex.field.LastShares get(quickfix.iex.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.iex.field.LastShares());
	}

	public boolean isSet(quickfix.iex.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
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

	public void set(quickfix.iex.field.OrigTime value) {
		setField(value);
	}

	public quickfix.iex.field.OrigTime get(quickfix.iex.field.OrigTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrigTime getOrigTime() throws FieldNotFound {
		return get(new quickfix.iex.field.OrigTime());
	}

	public boolean isSet(quickfix.iex.field.OrigTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigTime() {
		return isSetField(42);
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

	public void set(quickfix.iex.field.NoContraBrokers value) {
		setField(value);
	}

	public quickfix.iex.field.NoContraBrokers get(quickfix.iex.field.NoContraBrokers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.NoContraBrokers getNoContraBrokers() throws FieldNotFound {
		return get(new quickfix.iex.field.NoContraBrokers());
	}

	public boolean isSet(quickfix.iex.field.NoContraBrokers field) {
		return isSetField(field);
	}

	public boolean isSetNoContraBrokers() {
		return isSetField(382);
	}

	public static class NoContraBrokers extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {375, 0};

		public NoContraBrokers() {
			super(382, 375, ORDER);
		}
		
	public void set(quickfix.iex.field.ContraBroker value) {
		setField(value);
	}

	public quickfix.iex.field.ContraBroker get(quickfix.iex.field.ContraBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ContraBroker getContraBroker() throws FieldNotFound {
		return get(new quickfix.iex.field.ContraBroker());
	}

	public boolean isSet(quickfix.iex.field.ContraBroker field) {
		return isSetField(field);
	}

	public boolean isSetContraBroker() {
		return isSetField(375);
	}

	}

	public void set(quickfix.iex.field.TradeLiquidityIndicator value) {
		setField(value);
	}

	public quickfix.iex.field.TradeLiquidityIndicator get(quickfix.iex.field.TradeLiquidityIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.TradeLiquidityIndicator getTradeLiquidityIndicator() throws FieldNotFound {
		return get(new quickfix.iex.field.TradeLiquidityIndicator());
	}

	public boolean isSet(quickfix.iex.field.TradeLiquidityIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTradeLiquidityIndicator() {
		return isSetField(9730);
	}

	public void set(quickfix.iex.field.FeeCode value) {
		setField(value);
	}

	public quickfix.iex.field.FeeCode get(quickfix.iex.field.FeeCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.FeeCode getFeeCode() throws FieldNotFound {
		return get(new quickfix.iex.field.FeeCode());
	}

	public boolean isSet(quickfix.iex.field.FeeCode field) {
		return isSetField(field);
	}

	public boolean isSetFeeCode() {
		return isSetField(9882);
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
