package com.peter.pattern.facade.bridge;

public class BridgePatternTest {
	public static void main(String[] args) { 
		Triangle tri = new Triangle(new RedColor());
		tri.applyColor();
	}
}
