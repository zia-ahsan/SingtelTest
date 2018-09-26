package com.zia.model;

public interface SingingAnimal extends Animal {
	public default void sing() {
		System.out.println("I can sing");
	}
}
