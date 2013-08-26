package devopsdistilled.operp.client.account.panes.models.impl;

import devopsdistilled.operp.client.abstracts.AbstractEntityPaneModel;
import devopsdistilled.operp.client.account.panes.models.EmployeePaidTransactionPaneModel;
import devopsdistilled.operp.client.account.panes.models.observers.EmployeePaidTransactionPaneModelObserver;
import devopsdistilled.operp.server.data.entity.account.PaidTransaction;

public class EmployeePaidTransactionPaneModelImpl
		extends
		AbstractEntityPaneModel<PaidTransaction, EmployeePaidTransactionPaneModelObserver>
		implements EmployeePaidTransactionPaneModel {

	@Override
	public String getTitle() {
		return "Pay Employee Transaction";
	}

}
