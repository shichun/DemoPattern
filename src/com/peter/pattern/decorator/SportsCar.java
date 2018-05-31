package com.peter.pattern.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	public void assemble() {
		car.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}
