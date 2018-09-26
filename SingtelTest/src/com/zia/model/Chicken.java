package com.zia.model;

public class Chicken implements SingingAnimal, WalkingAnimal {
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}		
}
