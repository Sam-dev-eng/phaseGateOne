import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class CreditCardValidator{
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
mainMenu();

}

public static void mainMenu(){
Scanner scanner = new Scanner (System.in);
System.out.println("Hello, Kindly Enter Card details to verify");
String input = scanner.nextLine();
String [] split = splitIntoArrays(input);
System.out.printf("**Credit Card Type: %s%n",checkCardType(split));
System.out.printf("**Credit Card Number: %s%n", input);
System.out.printf("**Credit Digit Length: %d%n", split.length);
System.out.printf("**Credit Card Validity Status: %s%n", checkCardValidityStatus(split));
System.out.printf("**************************************");



}
public static String[] splitIntoArrays(String numbers){

String [] cardNumbers = numbers.split("");
return cardNumbers;

}

public static String checkCardValidityStatus(String[] numbers){

if (numbers.length < 13 || numbers.length > 16) return "Invalid";

int [] newArray = new int [16];
ArrayList<Integer> AddArray = new ArrayList<Integer>();
for (int count = numbers.length -1 ; count >= 0; count--){
if (count % 2 == 0){

newArray[count] = Integer.parseInt(numbers[count]);
int doubleNumber = newArray[count] * 2;

if (doubleNumber >= 10){
int firstNum = doubleNumber % 10;
int divideNum = doubleNumber / 10;
int secondNum = divideNum % 10;
int sum = firstNum + secondNum ;
AddArray.add(sum);
}else{
AddArray.add(doubleNumber); 
}

}



}
int result = 0;
for (int counter = 0; counter < AddArray.size(); counter++){
result += AddArray.get(counter); 

}

int [] oddPlaces = new int [16];
int sumOdd = 0;
for (int countOddPlaces = numbers.length - 1; countOddPlaces >= 0; countOddPlaces--){
if (countOddPlaces % 2 != 0){
sumOdd += Integer.parseInt(numbers[countOddPlaces]);


}


} 
int totalSum = sumOdd + result;

if (totalSum % 10 == 0) return "Valid";
return "Invalid";

}




public static String checkCardType(String[] numbers){

if (numbers[0].equals("5")) return "Master Card";
else
if (numbers[0].equals("4")) return "Visa Card";
else
if (numbers[0].equals("6")) return "Discover Card";
else
if (numbers[0].equals("3") && numbers[1].equals("7")) return "American Express Card";

return "Invalid";
}

















}