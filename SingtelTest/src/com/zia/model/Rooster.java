package com.zia.model;

public class Rooster implements SingingAnimal, WalkingAnimal {
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}		
}
