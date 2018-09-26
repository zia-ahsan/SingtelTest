package com.zia.model;

public interface FlyingAnimal extends Animal {
	public default void fly() {
		System.out.println("I can fly");
	}
}
