package devopsdistilled.operp.client.main;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import devopsdistilled.operp.client.abstracts.TaskPane;

public class DefaultTaskPane extends TaskPane {

	@Override
	public String toString() {
		return "";
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public JComponent getPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout(""));
		panel.add(new JLabel("DefaultTaskPane"));
		return panel;
	}

	@Override
	public Icon getIcon() {
		Icon icon = new ImageIcon(getClass().getResource(
				"/client/icons/OpErpLogo.jpg"));
		return icon;

	}
}
