package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino"
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		//restrictive statements


		Map<String, String> animals = new HashMap<String, String>();

		animals.put("GIRAFFE", "Tower");
		animals.put("ELEPHANT", "Herd");
		animals.put("LION", "Pride");
		animals.put("CROW", "Murder");
		animals.put("PIGEON", "Kit");
		animals.put("FLAMINGO", "Pat");
		animals.put("DEER", "Herd");
		animals.put("RHINO", "Crash");
		animals.put("DOG", "Pack");
		animals.put("CROCODILE", "Float");

		if (animalName == null) {
			return "unknown";
		}

		if (animalName == "") {
			return "unknown";
		}                        // does crocodiles " in upper case" match a key we have
		if (animals.containsKey(animalName.toUpperCase())) {
			return animals.get(animalName.toUpperCase());
		}                        //CROCODILE


		return "unknown";
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {


		if (itemNumber == null) {
			return 0.0;
		}

		if (itemNumber == "") {
			return 0.0;
		}


		System.out.println("value of itemNumber being passed in: " + itemNumber);

		Map<String, Double> sales = new HashMap<String, Double>();


		sales.put("KITCHEN4001", 0.20);
		sales.put("GARAGE1070", 0.15);
		sales.put("LIVINGROOM", 0.10);
		sales.put("KITCHEN6073", 0.40);
		sales.put("BEDROOM3434", 0.60);
		sales.put("BATH0073", 0.15);

		boolean doesItemExist = sales.containsKey(itemNumber.toUpperCase());

		if (doesItemExist) {
			double discount = sales.get(itemNumber.toUpperCase());
			return discount;
		} else {
			return 0.0;
		}
	}


	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {

		int peterGets = peterPaul.get("Peter");
		int paulGets = peterPaul.get("Paul");

		int halfVal = 0;
		int addingPenny = 0;

		if (peterPaul.get("Paul") >= 1000 || peterPaul.get("Peter") == 0) {
			return peterPaul;
		}

		if (peterPaul.get("Peter") % 2 == 1) {
			addingPenny = 1;
		}

		halfVal = peterPaul.get("Peter") / 2;

		int paulHas = peterPaul.get("Paul") + halfVal;

		peterPaul.remove("Peter");
		peterPaul.remove("Paul");

		peterPaul.put("Peter", halfVal + addingPenny);
		peterPaul.put("Paul", paulHas);

		return peterPaul;
	}


	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {

		Map<String, Integer> partnership = new HashMap<>();


		int peterTotal = peterPaul.get("Peter"); //  LOSS
		int paulTotal = peterPaul.get("Paul"); //  LOSS

		int quarterMoneyPeter = 0;
		int quarterMoneyPaul = 0;

		if (peterTotal >= 5000 && paulTotal >= 10000) {
			quarterMoneyPeter = peterTotal / 4;
			quarterMoneyPaul = paulTotal / 4;

			int peterNew = quarterMoneyPeter * 3;
			int paulNew = quarterMoneyPaul * 3;

			int contribMoney = quarterMoneyPaul + quarterMoneyPeter;

			partnership.put("Peter", peterNew);
			partnership.put("Paul", paulNew);
			partnership.put("PeterPaulPartnership", contribMoney);
			return partnership;
		}

		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {

		Map<String, String> valueKey = new HashMap<String, String>();

		for (String strings : words) {

			valueKey.put(strings.substring(0, 1), strings.substring(strings.length() - 1));

		}


		return valueKey;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {

		Map<String, Integer> wordCounter = new HashMap<String, Integer>();


		for (String placeholder2 : words) {
			if (wordCounter.containsKey(placeholder2)) {
				int currentCount = wordCounter.get(placeholder2);
				currentCount++;

				wordCounter.put(placeholder2, currentCount);
			} else {
				wordCounter.put(placeholder2, 1);
			}
		}

		return wordCounter;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {

//		Map<Integer, Integer> intCount = new HashMap<Integer, Integer>();

//		int counter = 0;
//
//		for( Integer	placeholder	:		ints	)
//			if ()
//		public Map<Integer, Integer> integerCount(int[] ints) {
//
		Map<Integer, Integer> counts = new HashMap<>();


		for (int integerCheck : ints) {

			if (counts.containsKey(integerCheck)) {

				int currentCount = counts.get(integerCheck);
				currentCount++;

				counts.put(integerCheck, currentCount);
			} else {
				counts.put(integerCheck, 1);
			}
		}
		return counts;
	}


	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {

		Map<String, Boolean> counts = new HashMap<String, Boolean>();

		for (String jalopeno : words) {
			if (counts.containsKey(jalopeno)) {
				counts.put(jalopeno, true);
			} else {
				counts.put(jalopeno, false);
			}

		}
		return counts;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
													 Map<String, Integer> remoteWarehouse) {

		for (String item :remoteWarehouse.keySet()) {
			if (!mainWarehouse.containsKey(item)) {
				mainWarehouse.put(item, remoteWarehouse.get(item));
			} else {
				mainWarehouse.put(item, mainWarehouse.get(item) + remoteWarehouse.get(item));
			}
		}
		return mainWarehouse;

	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 * 					//EQUALS?
	 *
	 *
	 * 	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {

		Map<String, Integer> keyAndCount = new HashMap<>();
		for (String key : words) {
			Integer count = 0;
			if (key.length() <= 2) {
				keyAndCount.put(key, 0);
			} else {
				for (int i = 0; i < key.length() - 3; i++) {
					if (key.substring(i, i + 2).equals(key.substring(key.length() - 2))) {
						count++;
					}
				}
			}
			keyAndCount.put(key, count);
		}
		return keyAndCount;
	}
}
//public Map<Integer, Integer> integerCount(int[] ints) {
//
//		Map<Integer, Integer> counts = new HashMap<>();
//
//		for (int integerCheck : ints) {
//			if(counts.containsKey(integerCheck)) {
//				int currentCount = counts.get(integerCheck);
//				currentCount++;
//				counts.put(integerCheck, currentCount) ;
//			} else {
//				counts.put(integerCheck, 1);
//			}
//		}
//		return counts;
//	}