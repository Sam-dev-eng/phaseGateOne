import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCreditCardValidator{


@Test
public void testForsplitingIntoArrays(){

//Arrange
String numbers = "123567675433";
//Act
CreditCardValidator validate = new CreditCardValidator();
String [] result = validate.splitIntoArrays(numbers);
//Assert
String[] actual ={"1","2","3","5","6","7","6","7","5","4","3","3"};
assertArrayEquals(result ,actual);


}




@Test
public void testForValidCardValidation(){

//Arrange
String [] numbers = {"4","3","8","8","5","7","6","0","1","8","4","1","0","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardValidityStatus(numbers);
//Assert
assertEquals(result ,"Valid");


}



@Test
public void testForInvalidCardValidation(){

//Arrange
String [] numbers = {"4","3","7","8","5","9","6","0","1","8","5","1","0","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardValidityStatus(numbers);
//Assert
assertEquals(result ,"Invalid");


}



@Test
public void testForIncompleteCardNumberLength(){

//Arrange
String [] numbers = {"4","3","7","8","5","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardValidityStatus(numbers);
//Assert
assertEquals(result ,"Invalid");


}


@Test
public void testForCardTypeVisaCard(){

//Arrange
String [] numbers = {"4","3","7","8","5","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardType(numbers);
//Assert
assertEquals(result ,"Visa Card");


}

@Test
public void testForCardTypeMasterCard(){

//Arrange
String [] numbers = {"5","3","7","8","5","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardType(numbers);
//Assert
assertEquals(result ,"Master Card");


}


@Test
public void testForCardTypeDiscoverCard(){

//Arrange
String [] numbers = {"6","3","7","8","5","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardType(numbers);
//Assert
assertEquals(result ,"Discover Card");


}




@Test
public void testForCardTypeAmericanExpressTypeCard(){

//Arrange
String [] numbers = {"3","7","7","8","5","7","0","7"};
//Act
CreditCardValidator validate = new CreditCardValidator();
String result = validate.checkCardType(numbers);
//Assert
assertEquals(result ,"American Express Card");


}




}




