package com.zia.model;

public interface Animal {
	public default void eat() {
		System.out.println("I eat something.");
	}
}
