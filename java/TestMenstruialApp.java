import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestMenstruialApp{


@Test
public void testFornextMensturialDate(){

//Arrange
int day = 20;
int month = 8;
int year = 2025;
//Act
MenstruialApp days = new MenstruialApp();
String result = days.nextMensturialDate( year, month, day);
//Assert

assertEquals(result , "Your mensturation is likely to start from 2025-09-17 to 2025-09-24");




}




@Test
public void testForZeroInputOnMensturialDate(){

//Arrange
int day = 20;
int month = 0;
int year = 2025;
//Act
MenstruialApp days = new MenstruialApp();
String result = days.nextMensturialDate( year, month, day);
//Assert

assertEquals(result , "Invlid spelling for month input");




}












@Test
public void testFornumberOfMonths(){

//Arrange
String month = "january";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 1);




}



@Test
public void testForMonthOfFebuary(){

//Arrange
String month = "Febuary";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 2);

}


@Test
public void testForMonthOfMarch(){

//Arrange
String month = "march";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 3);




}

@Test
public void testForMonthOfApril(){

//Arrange
String month = "April";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 4);




}


@Test
public void testForMonthMay(){

//Arrange
String month = "May";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 5);




}
@Test
public void testForMonthJune(){

//Arrange
String month = "June";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 6);




}



@Test
public void testForMonthJuly(){

//Arrange
String month = "July";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 7);




}





@Test
public void testForMonthAuguest(){

//Arrange
String month = "August";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 8);




}


@Test
public void testForMonthSemptember(){

//Arrange
String month = "September";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 9);




}

@Test
public void testForMonthOctober(){

//Arrange
String month = "October";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 10);




}

@Test
public void testForMonthNovember(){

//Arrange
String month = "November";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 11);




}




@Test
public void testForMonthDecomber(){

//Arrange
String month = "December";

//Act
MenstruialApp months = new MenstruialApp();
int result = months.numberOfMonths(month);
//Assert

assertEquals(result , 12);




}


@Test
public void testForstartedMensuration(){

//Arrange

int month = 8;
int year = 2025;
int day = 20;
int duration = 28;

//Act
MenstruialApp months = new MenstruialApp();
String result = months.startedMensuration(year,month,day,duration);
//Assert

assertEquals(result , "Remaining days are 24 days");




}



@Test
public void testForInvalidSpellingForstartedMensuration(){

//Arrange

int month = 0;
int year = 2025;
int day = 20;
int duration = 28;

//Act
MenstruialApp months = new MenstruialApp();
String result = months.startedMensuration(year,month,day,duration);
//Assert

assertEquals(result , "invalid spelling of months olodo");




}



@Test
public void testForWhenTheMensurationIsThesameDayForstartedMensuration(){

//Arrange

int month = 7;
int year = 2025;
int day = 27;
int duration = 28;

//Act
MenstruialApp months = new MenstruialApp();
String result = months.startedMensuration(year,month,day,duration);
//Assert

assertEquals(result , "Your mensturation will end today");




}

@Test
public void testForWhenTheMensurationDayHasPassedForstartedMensuration(){

//Arrange

int month = 7;
int year = 2025;
int day = 20;
int duration = 28;

//Act
MenstruialApp months = new MenstruialApp();
String result = months.startedMensuration(year,month,day,duration);
//Assert

assertEquals(result , "Oga your mensturation don pass oo");




}













}