package com.prasan.designpattern;

public class HotBeaverage {
	private String fluid;
	private String flavour;
	private String sweetener;

	public String getFluid() {
		return fluid;
	}

	public void setFluid(String fluid) {
		this.fluid = fluid;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getSweetener() {
		return sweetener;
	}

	public void setSweetener(String sweetener) {
		this.sweetener = sweetener;
	}

	@Override
	public String toString() {
		String s = "HotBeverage[";
		if (fluid != null) {
			s += " " + fluid;
		}
		if (flavour != null) {
			s += " " + flavour;
		}
		if (sweetener != null) {
			s += " " + sweetener;
		}
		s += "]";
		return s;

	}

}
