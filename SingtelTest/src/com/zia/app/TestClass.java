package com.zia.app;

import com.zia.model.Animal;
import com.zia.model.Bird;
import com.zia.model.Butterfly;
import com.zia.model.Caterpillar;
import com.zia.model.Chicken;
import com.zia.model.Dolphin;
import com.zia.model.Duck;
import com.zia.model.Fish;
import com.zia.model.FlyingAnimal;
import com.zia.model.Rooster;
import com.zia.model.SingingAnimal;
import com.zia.model.SwimmingAnimal;
import com.zia.model.WalkingAnimal;

public class TestClass {

	public static void main(String[] args) {
				
		int canFly = 0, canWalk=0, canSing=0, canSwim = 0;
		Animal[] animals = new Animal[] {
				new Bird(),
				new Butterfly(),
				new Caterpillar(),
				new Chicken(),
				new Dolphin(),
				new Duck(),
				new Fish(),
				new Rooster()
		};
		
		for(int i=0; i<animals.length;i++) {
			if(animals[i] instanceof FlyingAnimal)
				canFly++;
			if(animals[i] instanceof WalkingAnimal)
				canWalk++;
			if(animals[i] instanceof SingingAnimal)
				canSing++;
			if(animals[i] instanceof SwimmingAnimal)
				canSwim++;
			
		}
		
		System.out.println("Number of animals that can fly = " + canFly);
		System.out.println("Number of animals that can walk = " + canWalk);
		System.out.println("Number of animals that can sing = " + canSing);
		System.out.println("Number of animals that can swim = " + canSwim);

	}

}
