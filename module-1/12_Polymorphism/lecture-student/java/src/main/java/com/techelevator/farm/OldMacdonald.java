package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable tractor = new Tractor();
		Singable cow = new Cow();
		Singable chicken = new Chicken();
		Singable pig = new Pig();

		Singable [] singables = new Singable[] {tractor, cow, chicken, pig};

		System.out.println("DJ KHALED .....!");

		for(Singable singable : singables){
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println(" OLD MACDONALD HAD A FARM ....");


			System.out.println("AND ON THIS FARM THERE WAS A " + name);
			System.out.println("and its makes the sound " + sound);
		}

//		Sellable tractor2 = new Tractor();
		Sellable cow2 = new Cow();
		Sellable pig2 = new Pig();


		List<Sellable> farmAnimals = new ArrayList<Sellable>;

		farmAnimals.add(cow2);
		farmAnimals.add(pig2);

		for(Sellable sellable : farmAnimals){
			System.out.println(sellable.getName() + " " + sellable.getPrice());
		}



	}
}