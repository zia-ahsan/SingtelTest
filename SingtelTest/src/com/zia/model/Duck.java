package com.zia.model;

public class Duck implements FlyingAnimal, SingingAnimal, WalkingAnimal, SwimmingAnimal {
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	
}
