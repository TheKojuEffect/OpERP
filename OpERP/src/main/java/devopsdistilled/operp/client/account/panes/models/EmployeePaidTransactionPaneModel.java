package devopsdistilled.operp.client.account.panes.models;

import devopsdistilled.operp.client.abstracts.EntityPaneModel;
import devopsdistilled.operp.client.account.panes.models.observers.EmployeePaidTransactionPaneModelObserver;
import devopsdistilled.operp.server.data.entity.account.PaidTransaction;

public interface EmployeePaidTransactionPaneModel
		extends
		EntityPaneModel<PaidTransaction, EmployeePaidTransactionPaneModelObserver> {

}
