package com.peter.pattern.template;

public abstract class HouseTemplate {
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	abstract public  void buildWalls() ;

	public abstract void buildPillars();

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
}
