package devopsdistilled.operp.client.business.sales.panes.models.impl;

import devopsdistilled.operp.client.abstracts.AbstractEntityPaneModel;
import devopsdistilled.operp.client.business.sales.panes.models.observers.SalePaneModelObserver;
import devopsdistilled.operp.server.data.entity.business.Sale;

public class SalePaneModelImpl extends
		AbstractEntityPaneModel<Sale, SalePaneModelObserver> {

	@Override
	public String getTitle() {
		return "Sale";
	}

}
