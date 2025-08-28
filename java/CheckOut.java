import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
public class CheckOut{
public static ArrayList<String> items = new ArrayList<String>();
public static ArrayList<Double> itemPrices = new ArrayList<Double>();
public static ArrayList<Integer> numberOfItems = new ArrayList<Integer>();
public static ArrayList<Double> totalItem = new ArrayList<Double>();
public static void main(String[] args){

mainMenu();

}
public static void mainMenu(){
Scanner scanner = new Scanner (System.in);


System.out.println("What is the customer's Name");
String customerName = scanner.nextLine();
promptUser();
System.out.println("What is your name");
String cashierName = scanner.next();

System.out.println("How much discount will he get?");
double discount = scanner.nextDouble(); 
addTotalOfEachItem();

//date and time
String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm:ss a"));

double billTotal = billTotalPrice(subTotal(),vatPrice(subTotal()),discountPrice( discount ,subTotal()));


System.out.println("    ");
System.out.printf("""
SEMICOLON STORES 

MAIN BRANCH 

LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

TELL: 03293828343

DATE: %s 

Cashier: %s

Customer Name: %s
""", today,cashierName ,customerName); 

System.out.println("==========================================================");

System.out.println("                     ITEM\t     QTY\t    PRICE\t    TOTAL\t");
System.out.println("-------------------------------------------------------------");
for (int count = 0; count < items.size(); count++){

System.out.println("                     "+items.get(count)+"\t        "+numberOfItems.get(count)+"\t    "+itemPrices.get(count)+"\t  "+totalItem.get(count)+"\t"); 
}
System.out.println("----------------------------------------------------------------------------------");
System.out.printf("""
                     	Sub Total : %f
			Discount  : %f
			Vat @ 7.5 : %f

========================================================================			 
			Bill Total: %f

=========================================================================

ThIS IS NOT A RECIEPT KINDLY PAY %f

======================================================================== 


""",subTotal(), discountPrice( discount ,subTotal()),vatPrice(subTotal()),billTotal ,billTotal);




System.out.println("How Much Did The Customer Give You");
Double amountPaid = scanner.nextDouble();


System.out.println("    ");
System.out.printf("""
SEMICOLON STORES 

MAIN BRANCH 

LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

TELL: 03293828343

DATE: %s 

Cashier: %s

Customer Name: %s
""", today,cashierName ,customerName); 

System.out.println("==========================================================");

System.out.println("                     ITEM\t     QTY\t    PRICE\t    TOTAL\t");
System.out.println("-------------------------------------------------------------");
for (int count = 0; count < items.size(); count++){

System.out.println("                     "+items.get(count)+"\t        "+numberOfItems.get(count)+"\t    "+itemPrices.get(count)+"\t  "+totalItem.get(count)); 
}
System.out.println("----------------------------------------------------------------------------------");
System.out.printf("""
                     	Sub Total : %f
			Discount  : %f
			Vat @ 7.5 : %f

========================================================================			 
			Bill Total: %f
                       Amount Paid: %f
                           balance: %f
=========================================================================

THANKS FOR YOUR PATRONAGE 

======================================================================== 


""",subTotal(), discountPrice( discount ,subTotal()),vatPrice(subTotal()),billTotal ,amountPaid, billTotal - amountPaid);


















}


public static void promptUser(){
Scanner scanner = new Scanner(System.in);
do{
System.out.println("What did the user buy");
String customerItem = scanner.next();
items.add(customerItem);

//How many
System.out.println("How many pieces?");
int numberOfItem = scanner.nextInt();
numberOfItems.add(numberOfItem);

// How Much
System.out.println("How much per unit?");
double pricePerUnit = scanner.nextDouble();
itemPrices.add(pricePerUnit);

System.out.println("Add more items? (yes/no)");

}while (!scanner.next().equalsIgnoreCase("no"));

}


public static void addTotalOfEachItem(){
for (int count = 0; count < itemPrices.size(); count++){
double total = itemPrices.get(count) * numberOfItems.get(count); 
totalItem.add(total);
}


}






//Test
public static double subTotal(){

double subTotal = 0;
for (int count = 0; count < totalItem.size(); count++){
subTotal += totalItem.get(count);

}
return subTotal;
}

//Test
public static double discountPrice(double number, double totalPrice){

double discount = (number / 100) * totalPrice;

return discount;
}

//Test
public static double vatPrice(double subtotal){

double vat = (7.50 / 100) * subtotal;

return vat;
}

public static double billTotalPrice(double subTotal , double val, double discount){

double billTotal = (subTotal + val) - discount;

return billTotal;
}



}






















