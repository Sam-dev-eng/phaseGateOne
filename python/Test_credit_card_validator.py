import unittest
import credit_card_validator



class TestSplitFunction(unittest.TestCase):

  def test_if_the_function_exist(self):
     credit_card_validator.splitIntoArrays("79124")
 
  def test_if_the_function_returns_an_array(self):
     result = credit_card_validator.splitIntoArrays("79124")
     self.assertEqual(result , ["7","9","1","2","4"])

  def test_for_value_error_when_not_a_string(self):
     self.assertRaises(ValueError ,credit_card_validator.splitIntoArrays,6789) 



class TestForValidityCheck(unittest.TestCase):
   
  def test_if_the_function_is_returnIng_invalid(self):
     result =  credit_card_validator.check_card_validity_status(["2","3","4","5","6","7","8","9","0","3","4","5","6","7"]) 
     self.assertEqual(result , "Invalid")


  def test_if_the_function_returns_valid(self):
     result =  credit_card_validator.check_card_validity_status(["4","3","8","8","5","7","6","0","1","8","4","1","0","7","0","7"]) 
     self.assertEqual(result , "Valid")

  
  def test_for_value_error_for_non_list_values(self):
     self.assertRaises(ValueError , credit_card_validator.check_card_validity_status , 5678)

  def test_for_non_string_value_inside_the_list(self):
      self.assertRaises(ValueError ,credit_card_validator.check_card_validity_status , [5678]) 





class TestCardType(unittest.TestCase):
  
   def test_if_the_function_exist(self):
      credit_card_validator.check_card_type(["0"])

   def test_if_the_function_returns_Master_card(self):
       result = credit_card_validator.check_card_type(["5","6","7"])
       self.assertEqual(result , "Master Card")

   def test_if_the_function_returns_Visa_Card(self):
       result = credit_card_validator.check_card_type(["4","6","7"])
       self.assertEqual(result , "Visa Card")
   
   def test_if_the_function_returns_Discover_Card(self):
       result = credit_card_validator.check_card_type(["6","6","7"])
       self.assertEqual(result , "Discover Card")
  
   def test_if_the_function_returns_American_Express_Card(self):
       result = credit_card_validator.check_card_type(["3","7","7"])
       self.assertEqual(result , "American Express Card")
  
   def test_if_the_function_returns_Invalid_for_wrong_input(self):
       result = credit_card_validator.check_card_type(["0","8","8"])
       self.assertEqual(result , "Invalid")

   def value_error_for_non_list(self):
      self.assertRaises(ValueError , credit_card_validator.check_card_type,"")
   
   def value_error_for_list_integer_input(self):
      self.assertRaises(ValueError , credit_card_validator.check_card_type,[7675])






 