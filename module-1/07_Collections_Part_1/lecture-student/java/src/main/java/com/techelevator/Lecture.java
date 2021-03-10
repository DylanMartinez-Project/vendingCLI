package com.techelevator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


		List<String> names = new ArrayList<String>();
		names.add("Fredo");
		names.add("San");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");


		int sizeOfList = names.size();
		System.out.println(sizeOfList);


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++) {

			/// with ARRAYS TO ACCESS  == ARR[1]
			// NEED TO USE GET METHOD

			String name = names.get(i);
			System.out.println(name);
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");


		names.add("San"); //name of list = name name.
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "David"); // INSERT DAVID AT POSITION 2

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");


		boolean containgsBol = names.contains("Gimli");
		System.out.println(containgsBol);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int gandLocation = names.indexOf("Gandalf");
		System.out.println(gandLocation);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

//		for( int i = 0 ; i < names.size(); i ++){
//			System.out.println(names.get(i));
//		}

		for (String name : names) {
			System.out.println(name);
		}


		System.out.println("STRANGE SITUATIONS");
		// CREATE A LIST FAST

		List<Integer> numList = List.of(1, 2, 3, 14, 8, 1, 30, -1);  // not AN ARRAY

		// QUICK PRINT LIST
		System.out.println(numList);

		// List.of (...) == IMMUTABLE


		//		numList.add(34);          WONT WORK


		// lets TRANFORM LIST TO ARRAY

		List<Boolean> booleanList = new ArrayList<Boolean>();

		booleanList.add(true);
		booleanList.add(false);
		booleanList.add(true);

		// SHORTCUT ARRAY        SYNTAX IS HARD TO REMEMBER

//		Boolean [] booleanArr = booleanList.toArray(new Boolean[0]);
//		for (int i = 0; i < booleanArr.length; i++){
//
//			System.out.println(booleanArr[i]);
//		}


		// RECOMMENDED METHOD

		Boolean[] booleanArr = new Boolean[booleanList.size()];

		for (int i = 0; i < booleanList.size(); i++)
		{
			booleanArr[i] = booleanList.get(i);
		}
		for ( int i = 0; i < booleanArr.length; i++) {
			System.out.println(booleanArr[i]);
		}

		// STRANGE 3 CONVERT AN ARRAY TO A LIST
		//SHORTCUT BUT HAS DRAWBACKS
		System.out.println("############################################");
		String[] arrString = {" POT", "CARR", "TOMOT"};

		List<String> arrList = Arrays.asList(arrString);

		List<String> soupIng = new ArrayList<String>();
		for (int i = 0 ; i < arrString.length; i++) {
			soupIng.add(arrString[i]);
		}
		// PRINT ARRAY
		for (int i = 0 ; i < arrString.length; i++){
			System.out.println(arrString[i]);

		}


		//PRINT LIST

		System.out.println(soupIng);



	}
}
