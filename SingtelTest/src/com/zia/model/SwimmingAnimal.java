package com.zia.model;

public interface SwimmingAnimal extends Animal {
	public default void swim() {
		System.out.println("I can swim");
	}
}
