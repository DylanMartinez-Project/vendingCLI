/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */

function multiplyTogether(firstParameter, secondParameter){
  return firstParameter*secondParameter;
}


/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */

function multiplyNoUndefined(firstParameter= 0, secondParameter=0){
  return firstParameter*secondParameter;
}


/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter,secondParameter){
  if (firstParameter==0){
    console.log('returning second para, times 2');
    return secondParameter*2;
  }
  console.log('returning the sum instead')
  return firstParameter + secondParameter;
}


/**
 * We can use the following technique to extract an unknown number of parameters:
 *
 */
function doSomethingCrazy(){
console.log(arguments);
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */

function scopeTest(){
let inScopeInScopeTest = true;
{
let scopedToBlock = inScopeInScopeTest;

}
console.log(inScopeInScopeTest);
console.log(scopedToBlock);

}




 
/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {

// let total = 0

// for(let i=0; i < numbersToSum.length; i++){

//   total += numbersToSum[i];
// }

// return total;

// 

// let total = numbersToSum.reduce(addNumbers);
// return total;

let total = numbersToSum.reduce( (a,b) => {return a +b;}   );

  return total;
}



function addNumbers(sum, number) {
  return sum + number;
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  
}

function isDivisibleByThree(number) {
  return number % 3 === 0;
}
