package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {

		List<String> array2List = new ArrayList<String>();      // We will be using the following List declaration:
																//List <Type> name = new ArrayList<Type>();
																// this is a "bucket " or "0 "

		for (String blank: stringArray ) {  // first segment  loops through each element of array we pass
			array2List.add(blank);
		}


		return array2List;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {    // 166 ----175 lecture reference

		String[] stringArr = new String[stringList.size()];

		for (int i = 0; i < stringList.size(); i++){
			stringArr[i] = stringList.get(i);
		}



		return stringArr;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {

		List<String> no4LetterWords = new ArrayList<String>();

		for (String noFour: stringArray ){
			if (noFour.length() !=4 ){
				no4LetterWords.add(noFour);
			}
		}


		return no4LetterWords;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {

		List<Double> divided = new ArrayList<Double>();

		for ( Integer arrayDiv : intArray){
		divided.add(arrayDiv/2.0);

		}



		return divided;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {

		int largeVal = 0;
		 for ( Integer largeNum : integerList){
		 	if (largeNum > largeVal){
		 		largeVal = largeNum;
			}
		 }
		return largeVal;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {

		List<Integer> divided = new ArrayList<Integer>();
		for (Integer placeholder: integerArray){

			if(placeholder % 2 == 1){
				divided.add(placeholder);
			}
		}
		return divided;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {

		int counter = 0;
		for (Integer twice : integerList)
			if( intToFind == twice){
				counter = counter + 1;
			}
		if( counter >= 2){
			return true;
		}

		return false;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {

		List<String> ourList = new ArrayList<String>();

		List<String> fizzList = new ArrayList<String>();
		for (Integer placeholder: integerArray) {
			if (placeholder % 3 == 0 && placeholder % 5 == 0) {
				fizzList.add("FizzBuzz");
			}
			else if (placeholder % 3 == 0) {
				fizzList.add("Fizz");
			}
			else if (placeholder % 5 == 0) {
				fizzList.add("Buzz");
			}
			else {
				fizzList.add(Integer.toString(placeholder));
			}
		}
		return fizzList;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {

		List<Integer> ourList = new ArrayList<Integer>();

		for (int i = 0, x = 0; i < listOne.size() || x < listTwo.size(); i++, x++){

			if (i < listOne.size()) {
				ourList.add(listOne.get(i));
			}
			if (x <listTwo.size()){
				ourList.add(listTwo.get(i));
			}
		}

		return ourList;
	}

}
