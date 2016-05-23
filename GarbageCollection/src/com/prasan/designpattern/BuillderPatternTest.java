package com.prasan.designpattern;

public class BuillderPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotBeaverage tea = new HotBeaverageBuilder().addFluid("Milk")
				.addFluid("Water").addFlavour("Tea Powder")
				.addSweetener("Sugar").getBeaverage();
		HotBeaverage sugarlessTea = new HotBeaverageBuilder().addFluid("Milk")
				.addFluid("Water").addFlavour("Tea Powder").getBeaverage();
		HotBeaverage milk = new HotBeaverageBuilder().addFluid("Milk")
				.addSweetener("Sugar").getBeaverage();

		HotBeaverage lemonTea = new HotBeaverageBuilder().addFluid("Water")
				.addFlavour("Tea Powder").addFlavour("Lemon")
				.addSweetener("Sugar").getBeaverage();
		System.out.println(tea);
		System.out.println(sugarlessTea);
		System.out.println(milk);
		System.out.println(lemonTea);

	}

}
