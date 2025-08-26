//const prompt = require('prompt-sync')();

function  mainMenu(){

input = prompt("Hello, Kindly Enter Card details to verify");

let split = splitIntoArrays(input);
console.log("**Credit Card Type: " + checkCardType(split));
console.log("**Credit Card Number: " + input);
console.log("**Credit Digit Length: "+ split.length);
console.log("**Credit Card Validity Status: "+ checkCardValidityStatus(split));
console.log("**************************************");



}












function splitIntoArrays(arrayNumbers){

let cardNumbers = numbers.split("");
return cardNumbers;

}








function checkCardValidityStatus(arrayNumbers){

if (numbers.length < 13 || numbers.length > 16) return "Invalid";

newArray = [];
addArray = [];
for (let count = numbers.length -1 ; count >= 0; count--){
if (count % 2 == 0){

newArray[count] = Number(numbers[count]);
let doubleNumber = newArray[count] * 2;

if (doubleNumber >= 10){
let firstNum = doubleNumber % 10;
let divideNum = doubleNumber / 10;
let secondNum = divideNum % 10;
let sum = firstNum + secondNum ;
AddArray.push(sum);
}else{
AddArray.push(doubleNumber); 
}
}
}


let result = 0;
for (let counter = 0; counter < AddArray.length; counter++){
result += AddArray[counter]; 

}

let oddPlaces = [];
let sumOdd = 0;
for (let countOddPlaces = numbers.length - 1; countOddPlaces >= 0; countOddPlaces--){
if (countOddPlaces % 2 != 0){
sumOdd += Number(numbers[countOddPlaces]);

}
}



let totalSum = sumOdd + result;

if (totalSum % 10 == 0) return "Valid";
return "Invalid";










}















