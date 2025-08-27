//const prompt = require('prompt-sync')();


items = [];
itemPrices = [];
numberOfItems = [];
totalItem = [];


function mainMenu(){

customerName = prompt("What is the customer's Name");
promptUser();
cashierName = prompt("What is your name");

discount = prompt("How much discount will he get?");
addTotalOfEachItem();

let billTotal = billTotalPrice(subTotal(),vatPrice(subTotal()),discountPrice( discount ,subTotal()));


console.log("    ");
console.log(`
SEMICOLON STORES 

MAIN BRANCH 

LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

TELL: 03293828343

DATE: ${Date()} 

Cashier: ${cashierName}

Customer Name: ${customerName}
`); 

console.log("==========================================================");

console.log("                     ITEM\t     QTY\t    PRICE\t    TOTAL\t");
console.log("-------------------------------------------------------------");
for (let count = 0; count < items.length; count++){

console.log("                     "+items.get(count)+"\t        "+numberOfItems.get(count)+"\t    "+itemPrices.get(count)+"\t  "+totalItem.get(count)+"\t"); 
}
console.log("----------------------------------------------------------------------------------");
console.log(`
                     	Sub Total : ${subTotal()}
			Discount  : ${discountPrice( discount ,subTotal())}
			Vat @ 7.5 : ${vatPrice(subTotal())}

========================================================================			 
			Bill Total: ${billTotal}

=========================================================================

ThIS IS NOT A RECIEPT KINDLY PAY ${billTotal}

======================================================================== 


`);




let amountPaid = prompt("How Much Did The Customer Give You");


console.log("    ");
console.log(`
SEMICOLON STORES 

MAIN BRANCH 

LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

TELL: 03293828343

DATE: {Date()} 

Cashier: {cashierName}

Customer Name: {customerName}
`); 

console.log("==========================================================");

console.log("                     ITEM\t     QTY\t    PRICE\t    TOTAL\t");
console.log("-------------------------------------------------------------");
for (let count = 0; count < items.length; count++){

console.log("                     "+items.get(count)+"\t        "+numberOfItems.get(count)+"\t    "+itemPrices.get(count)+"\t  "+totalItem.get(count)); 
}
console.log("----------------------------------------------------------------------------------");
console.log(`
                     	Sub Total : ${subTotal()}
			Discount  : ${discountPrice( discount ,subTotal())}
			Vat @ 7.5 : ${vatPrice(subTotal())}

========================================================================			 
			Bill Total: ${billTotal}
                       Amount Paid: ${amountPaid}
                           balance: ${billTotal - amountPaid}
=========================================================================

THANKS FOR YOUR PATRONAGE 

======================================================================== 


`);



}




function promptUser(){

do{
let customerItem = prompt("What did the user buy");

items.push(customerItem);

//How many
let numberOfItem = prompt("How many pieces?");

numberOfItems.push(numberOfItem);

// How Much
let pricePerUnit = prompt("How much per unit?");
itemPrices.push(pricePerUnit);

console.log("Add more items? (yes/no)");

}while (!scanner.next().equalsIgnoreCase("no"));

}


function addTotalOfEachItem(){
for (let count = 0; count < itemPrices.length; count++){
let total = itemPrices.get(count) * numberOfItems.get(count); 
totalItem.push(total);
}


}






//Test
function subTotal(){

let subTotal = 0;
for (let count = 0; count < totalItem.size(); count++){
subTotal += totalItem[count];

}
return subTotal;
}

//Test
function discountPrice( number, totalPrice){

let discount = (number / 100) * totalPrice;

return discount;
}

//Test
function vatPrice( subtotal){

let vat = (7.50 / 100) * subtotal;

return vat;
}

function billTotalPrice( subTotal ,  val,  discount){

let billTotal = (subTotal + val) - discount;

return billTotal;
}


























