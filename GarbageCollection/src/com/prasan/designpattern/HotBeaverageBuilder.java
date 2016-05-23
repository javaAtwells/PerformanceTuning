package com.prasan.designpattern;

public class HotBeaverageBuilder {
	private HotBeaverage beaverage;

	public HotBeaverageBuilder() {
		beaverage = new HotBeaverage();
	}

	public HotBeaverageBuilder addFluid(String fluid) {
		if (beaverage.getFluid() == null) {
			beaverage.setFluid(fluid);
		} else {
			beaverage.setFluid(beaverage.getFluid() + "," + fluid);
		}
		return this;
	}

	public HotBeaverageBuilder addFlavour(String flavour) {
		if (beaverage.getFlavour() == null) {
			beaverage.setFlavour(flavour);
		} else {
			beaverage.setFlavour(beaverage.getFlavour() + "," + flavour);
		}
		return this;
	}

	public HotBeaverageBuilder addSweetener(String sweetener) {
		if (beaverage.getSweetener() == null) {
			beaverage.setSweetener(sweetener);
		} else {
			beaverage.setSweetener(beaverage.getSweetener() + "," + sweetener);
		}
		return this;
	}

	public HotBeaverage getBeaverage() {
		return beaverage;
	}
}
