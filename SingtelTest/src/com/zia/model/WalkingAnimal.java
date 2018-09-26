package com.zia.model;

public interface WalkingAnimal extends Animal {
	public default void walk() {
		System.out.println("I can walk");
	}
}
