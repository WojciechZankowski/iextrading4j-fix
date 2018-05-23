
package quickfix.iex;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new quickfix.iex.field.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(quickfix.iex.field.AvgPx avgPx, quickfix.iex.field.CumQty cumQty, quickfix.iex.field.ExecID execID, quickfix.iex.field.OrderID orderID, quickfix.iex.field.Side side, quickfix.iex.field.Symbol symbol, quickfix.iex.field.LeavesQty leavesQty, quickfix.iex.field.ExecTransType execTransType, quickfix.iex.field.OrdStatus ordStatus, quickfix.iex.field.ExecType execType) {
		this();
		setField(avgPx);
		setField(cumQty);
		setField(execID);
		setField(orderID);
		setField(side);
		setField(symbol);
		setField(leavesQty);
		setField(execTransType);
		setField(ordStatus);
		setField(execType);
	}
	
	public void set(quickfix.iex.field.AvgPx value) {
		setField(value);
	}

	public quickfix.iex.field.AvgPx get(quickfix.iex.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.iex.field.AvgPx());
	}

	public boolean isSet(quickfix.iex.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
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

	public void set(quickfix.iex.field.ClientID value) {
		setField(value);
	}

	public quickfix.iex.field.ClientID get(quickfix.iex.field.ClientID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ClientID getClientID() throws FieldNotFound {
		return get(new quickfix.iex.field.ClientID());
	}

	public boolean isSet(quickfix.iex.field.ClientID field) {
		return isSetField(field);
	}

	public boolean isSetClientID() {
		return isSetField(109);
	}

	public void set(quickfix.iex.field.CumQty value) {
		setField(value);
	}

	public quickfix.iex.field.CumQty get(quickfix.iex.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.iex.field.CumQty());
	}

	public boolean isSet(quickfix.iex.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
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

	public void set(quickfix.iex.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.iex.field.LeavesQty get(quickfix.iex.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.iex.field.LeavesQty());
	}

	public boolean isSet(quickfix.iex.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
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

	public void set(quickfix.iex.field.MaxFloor value) {
		setField(value);
	}

	public quickfix.iex.field.MaxFloor get(quickfix.iex.field.MaxFloor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.MaxFloor getMaxFloor() throws FieldNotFound {
		return get(new quickfix.iex.field.MaxFloor());
	}

	public boolean isSet(quickfix.iex.field.MaxFloor field) {
		return isSetField(field);
	}

	public boolean isSetMaxFloor() {
		return isSetField(111);
	}

	public void set(quickfix.iex.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.iex.field.ExpireTime get(quickfix.iex.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.iex.field.ExpireTime());
	}

	public boolean isSet(quickfix.iex.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
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

	public void set(quickfix.iex.field.ExecType value) {
		setField(value);
	}

	public quickfix.iex.field.ExecType get(quickfix.iex.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.iex.field.ExecType());
	}

	public boolean isSet(quickfix.iex.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(quickfix.iex.field.LastMkt value) {
		setField(value);
	}

	public quickfix.iex.field.LastMkt get(quickfix.iex.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new quickfix.iex.field.LastMkt());
	}

	public boolean isSet(quickfix.iex.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
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

	public void set(quickfix.iex.field.LastLiquidityInd value) {
		setField(value);
	}

	public quickfix.iex.field.LastLiquidityInd get(quickfix.iex.field.LastLiquidityInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.LastLiquidityInd getLastLiquidityInd() throws FieldNotFound {
		return get(new quickfix.iex.field.LastLiquidityInd());
	}

	public boolean isSet(quickfix.iex.field.LastLiquidityInd field) {
		return isSetField(field);
	}

	public boolean isSetLastLiquidityInd() {
		return isSetField(851);
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

	public void set(quickfix.iex.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.iex.field.OrdRejReason get(quickfix.iex.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.iex.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.iex.field.OrdRejReason());
	}

	public boolean isSet(quickfix.iex.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
	}

}
