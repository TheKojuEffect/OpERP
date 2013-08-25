package devopsdistilled.operp.client.account;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.inject.Inject;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import devopsdistilled.operp.client.abstracts.TaskPane;
import devopsdistilled.operp.client.account.controllers.PaidTransactionController;
import devopsdistilled.operp.client.account.controllers.ReceivedTransactionController;

public class AccountMgmtPane extends TaskPane {

	@Inject
	private ReceivedTransactionController receivedTransactionController;

	@Inject
	private PaidTransactionController paidTransactionController;

	@Override
	public String toString() {
		return new String("Account");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public JComponent getPane() {
		JPanel pane = new JPanel();
		pane.setLayout(new MigLayout("", "[136px,grow]", "[15px][][][][][][][]"));
		pane.add(new JLabel("Account Management"),
				"cell 0 0,alignx center,aligny top");

		JButton btnReceivePayment = new JButton(
				"Receive Payment  from Customer");
		btnReceivePayment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				receivedTransactionController.create();
			}
		});
		btnReceivePayment.setFont(new Font("DejaVu Sans", Font.PLAIN, 12));
		pane.add(btnReceivePayment, "cell 0 2");

		JButton btnPayPayment = new JButton("Pay Payment to Vendor");
		btnPayPayment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paidTransactionController.create();
			}
		});
		pane.add(btnPayPayment, "cell 0 4");

		JButton btnPayEmployee = new JButton("Pay Employee");
		btnPayEmployee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JButton btnUpdateEmployeesAccount = new JButton("Update Employees Account");
		btnUpdateEmployeesAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		pane.add(btnUpdateEmployeesAccount, "cell 0 6");
		pane.add(btnPayEmployee, "cell 0 7");
		return pane;
	}

}
