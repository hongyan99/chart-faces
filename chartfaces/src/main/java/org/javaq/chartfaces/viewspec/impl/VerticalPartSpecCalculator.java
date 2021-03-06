package org.javaq.chartfaces.viewspec.impl;

import java.io.IOException;

import org.javaq.chartfaces.api.Box;
import org.javaq.chartfaces.api.IChartPart;


public class VerticalPartSpecCalculator extends AbstractPartSpecCalculator {
	protected VerticalPartSpecCalculator(final SpecHelper specHelper) {
		super(specHelper);
	}

	@Override
	protected Box computeViewBox(final IChartPart part) throws IOException {
		return getSpecHelper().computeVerticalViewBox(part, null);
	}
}
