package devopsdistilled.operp.client.account.panes.controllers.impl;

import javax.inject.Inject;

import devopsdistilled.operp.client.abstracts.EntityOperation;
import devopsdistilled.operp.client.account.models.PaidTransactionModel;
import devopsdistilled.operp.client.account.panes.EmployeePaidTransactionPane;
import devopsdistilled.operp.client.account.panes.controllers.EmployeePaidTransactionPaneController;
import devopsdistilled.operp.client.account.panes.models.EmployeePaidTransactionPaneModel;
import devopsdistilled.operp.client.employee.models.EmployeeModel;
import devopsdistilled.operp.client.exceptions.EntityValidationException;
import devopsdistilled.operp.client.exceptions.NullFieldException;
import devopsdistilled.operp.server.data.entity.account.PaidTransaction;

public class EmployeePaidTransactionPaneControllerImpl implements
		EmployeePaidTransactionPaneController {

	@Inject
	private EmployeePaidTransactionPane view;

	@Inject
	private EmployeePaidTransactionPaneModel model;

	@Inject
	private EmployeeModel employeeModel;

	@Inject
	private PaidTransactionModel paidTransactionModel;

	@Override
	public void validate() throws EntityValidationException {
		if (model.getEntity().getAccount() == null)
			throw new NullFieldException("Employee must be selected");

		if (model.getEntity().getAmount().compareTo(0.0) < 1)
			throw new NullFieldException("Amount must be greater than 0");

		if (model.getEntity().getAccount().getBalance()
				.compareTo(model.getEntity().getAmount()) < 0)
			throw new EntityValidationException(
					"Paid Amount must not be greater than balance");

	}

	@Override
	public PaidTransaction save() {
		return paidTransactionModel.saveAndUpdateModel(model.getEntity());
	}

	@Override
	public EmployeePaidTransactionPaneModel getModel() {
		return model;
	}

	@Override
	public EmployeePaidTransactionPane getView() {
		return view;
	}

	@Override
	public void init(PaidTransaction paidTransaction,
			EntityOperation entityOperation) {

		if (EntityOperation.Edit == entityOperation) {
			paidTransactionModel.getService().delete(paidTransaction);
		}

		view.setController(this);
		view.resetComponents();

		model.registerObserver(view);
		model.setEntityAndEntityOperation(paidTransaction, entityOperation);
		employeeModel.registerObserver(view);

		view.init();
	}

}
