package devopsdistilled.operp.client.account.panes.controllers;

import devopsdistilled.operp.client.abstracts.EntityPaneController;
import devopsdistilled.operp.client.account.panes.EmployeePaidTransactionPane;
import devopsdistilled.operp.client.account.panes.models.EmployeePaidTransactionPaneModel;
import devopsdistilled.operp.server.data.entity.account.PaidTransaction;

public interface EmployeePaidTransactionPaneController
		extends
		EntityPaneController<PaidTransaction, EmployeePaidTransactionPaneModel, EmployeePaidTransactionPane> {

}
