/*
1. **sumDouble** Given two int values, return their sum. Unless the two values are the 
    same, then return double their sum.

		sumDouble(1, 2) → 3
		sumDouble(3, 2) → 5
		sumDouble(2, 2) → 8
*/
		function sumDouble(x, y) {
			// do logic here
			// return result;

			if(x===y){
				return 2 *(x+y)
			}
			return x + y;
        }


/*
2. **hasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen.
	
		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true
*/
		function hasTeen(a,b,c){
		const numbers = [a,b,c];

		for (let i=0; i < numbers.length; i++){
			if (numbers[i] >= 13 && numbers[i] <=19){
				return true;
			}
		}
		return false;



	}

/*
3. **lastDigit** Given two non-negative int values, return true if they have the same 
    last digit, such as with 27 and 57.

		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true
*/
		function lastDigit(first, second){
		const firstStr = first.toString();
		const secondStr = second.toString();
		const firstStrLast = firstStr.charAt(firstStr.length-1);
		const secondStrLast = secondStr.charAt(secondStr.length-1);

		if(firstStrLast===secondStrLast){
			return true;
		}
			return false;

		}
/*

4. **seeColor** Given a string, if the string begins with "red" or "blue" return that color 
    string, otherwise return the empty string.

		seeColor("redxx") → "red"
		seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"

*/
			function seeColor(str){
				

			if(str.substring(0,3)=== "red"){
						return str.substring(0,3);
					} else if (str.substring(0,4)=== "blue"){
						return str.substring(0,4);
					} else {
						return "";
			}
		}


/*
5. **oddOnly** Write a function that given an array of integer of any length, filters out 
    the even number, and returns a new array of just the the odd numbers.

		oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
		oddOnly([2, 4, 8, 32, 256]); → []
*/
			function oddOnly(x){
				let oddArray = []
				for (let i = 0; i < x.length; i++){
					if(x[i]%2 == 1){
						oddArray.push(x[i]);
						
					}
					
				}
				return oddArray;



			}



// 6. **frontAgain** Given a string, return true if the first 2 chars in the string also appear 
//     at the end of the string, such as with "edited".

// 		frontAgain("edited") → true
// 		frontAgain("edit") → false
// 		frontAgain("ed") → true

		function frontAgain(myStr){
			if(myStr.length==2){
				return true;
			} else if(myStr.substring(0,1) == myStr.substring(myStr.length - 2, myStr.length - 1)){
				return true;
			} else {
				return false
			}


		}



// 7. **cigarParty** When squirrels get together for a party, they like to have cigars. 
// A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
// Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
// Write a squirrel party function that return true if the party with the given values is successful, 
// or false otherwise.

		// cigarParty(30, false) → false
		// cigarParty(50, false) → true
		// cigarParty(70, true) → true



		function cigarParty(cigar, weekend) {
    if (weekend == true) {
        if (cigar >= 40) {
            return true;
        }
    } else if (weekend == false) {
        if (cigar >= 40 && cigar <= 60) {
            return true;
        } else {
            return false;
        }
    }
}



// // 
// 8. **fizzBuzz** Because you know you can't live without it, FizzBuzz.

// 		fizzBuzz(3) → "Fizz"
// 		fizzBuzz(1) → 1
// 		fizzBuzz(10) → "Buzz"
// 		fizzBuzz(15) → "FizzBuzz"
// 		fizzBuzz(8) → 8
// */
function fizzBuzz(myNum) {
    if (myNum % 15 == 0) {
        return "FizzBuzz";
    } else if (myNum % 3 == 0) {
        return "Fizz";
    } else if (myNum % 5 == 0) {
        return "Buzz";
    } else {
        return myNum;
    }
}

/*
9. **filterEvens** Write a function that filters an array to only include even numbers.

	filterEvens([]) → []
	filterEvens([1, 3, 5]) → []
	filterEvens([2, 4, 6]) → [2, 4, 6]
	filterEvens([100, 8, 21, 24, 62, 9, 7]) → [100, 8, 24, 62]
*/
function filterEvens(myArr) {
    let newArr = [];
    for (let i = 0; i < myArr.length; i++) {
        if (myArr[i]%2 == 0) {
            newArr.push(myArr[i]);
        }
    }
    return newArr;
}
/*
10. **filterBigNumbers** Write a function that filters numbers greater than or equal to 100.

	filterBigNumbers([7, 10, 121, 100, 24, 162, 200]) → [121, 100, 162, 200]
	filterBigNumbers([3, 2, 7, 1, -100, -120]) → []
	filterBigNumbers([]) → []
*/
function filterBigNumbers(myArr) {

let newArr = [];
for (let i = 0; i < myArr.length; i++) {
	if (myArr[i] >= 100) {
		newArr.push(myArr[i]);
	}
}
return newArr;
}
/*
11. **filterMultiplesOfX** Write a function to filter numbers that are a multiple of a 
parameter, `x` passed in.

	filterMultiplesOfX([3, 5, 1, 9, 18, 21, 42, 67], 3) → [3, 9, 18, 21, 42]
	filterMultiplesOfX([3, 5, 10, 20, 18, 21, 42, 67], 5) → [5, 10, 20]
*/
function filterMultiplesOfX(myArr, x) {
    let newArr = [];
    for (let i = 0; i < myArr.length; i++) {
        if (myArr[i] % x == 0) {
        newArr.push(myArr[i]);
        }
    }
    return newArr;
}
/*
12. **createObject** Write a function that creates an object with a property called 
firstName, lastName, and age. Populate the properties with your values.

	createObject() →

	{
		firstName,
		lastName,
		age
	}
	
*/
function createObject() {
    const result = {
    firstName:"dilly",
    lastName:"M",
    age:26,
    }
    return result;
}