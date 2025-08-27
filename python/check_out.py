from datetime import datetime
list_of_items = []
list_of_prices = []
number_of_items = []
total_item = []

def main_menu():

  customer_name = input("What is the customer's Name")
  promt_user()
  add_total_of_each_item()
  cashier_name = input("What is Your name")
  discount_prince = int(input("How much discount will he get?"))

  current_datetime = datetime.now()
  formatted_datetime = current_datetime.strftime("%d-%m-%Y %H:%M:%S")


  bill_total = bill_total_price(sub_total(),vat_price(sub_total()),discount_price(discount_prince,sub_total()))
  print(f"""

SEMICOLON STORES

MAIN BRANCH 

LOCATION: 312, HERBERT MARCAULAY WAY, SABO YABA, LAGOS.

TELL: 08764357990

DATE: {formatted_datetime}

Cashier: {cashier_name}

Customer Name: {customer_name}
=========================================================================
                    ITEM\t         QTY\t           PRICE\t TOTALs
-------------------------------------------------------------------------
""")

  

  for numbers in range(len(list_of_items)):
      print(f"                    {list_of_items[numbers]}\t       {number_of_items[numbers]}\t       {list_of_prices[numbers]}\t       {total_item[numbers]}")                  

  print(f"""
------------------------------------------------------------------------------------
                          	sub ToTal:{sub_total()}
				 Discount: {discount_price(discount_prince,sub_total())}
			      VAT @ 7.50%: {vat_price(sub_total())}

===========================================================================================================================

 				bill TOTAL: {bill_total}

THIS IS NOT A RECIEPT KINDLY PAY {bill_total}				

""")

  amount_paid = float(input("How much did the customer give you?"))

  print()

  print(f"""

SEMICOLON STORES

MAIN BRANCH 

LOCATION: 312, HERBERT MARCAULAY WAY, SABO YABA, LAGOS.

TELL: 08764357990

DATE: {formatted_datetime}

Cashier: {cashier_name}

Customer Name: {customer_name}
=========================================================================
                    ITEM\t         QTY\t           PRICE\t TOTALs
-------------------------------------------------------------------------
""")



  for numbers in range(len(list_of_items)):
      print(f"                    {list_of_items[numbers]}\t       {number_of_items[numbers]}\t       {list_of_prices[numbers]}\t       {total_item[numbers]}")                  

  print(f"""
------------------------------------------------------------------------------------
                          	sub ToTal:{sub_total()}
				 Discount: {discount_price(discount_prince,sub_total())}
			      VAT @ 7.50%: {vat_price(sub_total())}

===========================================================================================================================

 				bill TOTAL: {bill_total}
			      Amount  Paid: {amount_paid}
			           balance: {bill_total - amount_paid}

     THANKS FOR YOUR PATRONAGE

===========================================================================================================================				

""")










def promt_user():
   lower = ""
   while lower != "no":
       customer_item = input("What did the user buy")
       list_of_items.append(customer_item)
       
       number_of_item = int(input("How many pieces"))
       number_of_items.append(number_of_item)
    
       price_per_unit = float(input("How much per unit?"))
       list_of_prices.append(price_per_unit)

       add_more_item = input("Add more items? (yes/no)")
       lower = add_more_item.lower()
       



def add_total_of_each_item():
   
   for numbers in range(len(list_of_prices)):
    total = list_of_prices[numbers] * number_of_items[numbers] 
    total_item.append(total)    




def sub_total():
   sub_total = 0
   for items in total_item:
    sub_total += items
   return sub_total 


def discount_price(number , total_price):
    
     discount = (number / 100) * total_price
     return discount  



def vat_price(sub_total):

   vat = (7.50 / 100) * sub_total
   return vat



def bill_total_price(sub_total, val , discount):

    bill_total = (sub_total + val) - discount
    return bill_total



main_menu() 















 