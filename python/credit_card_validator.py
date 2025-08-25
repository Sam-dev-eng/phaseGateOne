def splitIntoArrays(numbers):

   return list(numbers)
  
  



def check_card_validity_status(array_numbers):
  new_array = []
  if len(array_numbers) < 13 or len(array_numbers) > 16:
      return "Invalid"
  
  for numbers in array_numbers[::2]:
    double_num = int(numbers) * 2
    
    if double_num >= 10:
      first_num = double_num % 10
      divide_one = double_num // 10
      second_num = divide_one % 10
      sum = first_num + second_num  
      new_array.append(sum)
    else:
       new_array.append(double_num)
  sum = 0
  for numbers in new_array:
   sum += numbers
  odd_sum = 0
  for elements in array_numbers[1::2]:
    odd_sum += int(elements)
  total_sum = odd_sum + sum 
  if total_sum % 10 == 0:
    return "Valid"

  return "Invalid"
      




def check_card_type(list_numbers):

   if list_numbers[0] == "5": 
        return "Master Card" 
   elif list_numbers[0] == "4": 
        return "Visa Card" 
   elif list_numbers[0] == "6": 
        return "Discover Card" 
   elif list_numbers[0] == "3" and list_numbers[1] == "7":
        return "American Express Card"
   else:
       return "Invalid"
         






def main_menu():

    user_input = input("Hello, Kindly Enter card details to verify \n")
    new_list = splitIntoArrays(user_input) 
    print("**Credit Card Type: ",check_card_type(new_list))
    print("**Credit Card Number: ",user_input)
    print("**Credit Digit length: ",len(new_list)) 
    print("**Credit Card Validity Status: ", check_card_validity_status(new_list ))
    print("**************************************")
main_menu()



















