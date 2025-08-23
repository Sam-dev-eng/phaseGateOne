import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;
public class MenstruialApp{
public static void main(String[] args){
mainMenu();
//System.out.println(numberOfMonths("FEBuARY"));


//System.out.println(startedMensuration(2025, 8 , 13 , 10));

}

public static void mainMenu(){
Scanner scanner = new Scanner(System.in);
String menu = """

     Welcome Dear User
	whats on your mind today

1 -> Check Menstruial date

2 -> Check when your menstruial will end...

""";
System.out.println(menu);
int menuInput = scanner.nextInt();

switch (menuInput){

case 1: 
	System.out.println("Enter your last mensturial date\neg. (YY/MM/DD)");
	int mensYear = scanner.nextInt();
	String mensMonth = scanner.next();
	int monthInNum = numberOfMonths(mensMonth);
	int mensDay = scanner.nextInt();
	System.out.println(nextMensturialDate(mensYear , monthInNum , mensDay));
	
	System.out.println("press 0 to go back to main menu\n\npress 1 to quit");
	int back = scanner.nextInt();
	switch(back){
		case 0: mainMenu();
		case 1: System.out.println("Goodbye fam");
				}
	
break;

case 2: System.out.println("Enter the date your mensuration started\neg.(YY/MM/DD)");
  	int startYear = scanner.nextInt();
	String startMonth = scanner.next();
	int monthInNumbers = numberOfMonths(startMonth);
	int startDay = scanner.nextInt();
	System.out.println("Enter how many days your mensturation do last\n eg. 10 days");
	int duration = scanner.nextInt();
	System.out.println(startedMensuration(startYear , monthInNumbers , startDay , duration));


	System.out.println("press 0 to go back to main menu\n\npress 1 to quit");
 	int goBack = scanner.nextInt();
	switch(goBack){
		case 0: mainMenu();
		case 1: System.out.println("Goodbye fam");
				}

	
break;


}
}

public static String nextMensturialDate(int Year , int Month, int Day){

if (Month == 0) return "Invlid spelling for month input";
LocalDate endlastMens = LocalDate.of(Year , Month , Day);
LocalDate beginNewMens = endlastMens.plusDays(28);
LocalDate endNewMens = endlastMens.plusDays(35);



return "Your mensturation is likely to start from "+beginNewMens+" to "+endNewMens;

}

public static int numberOfMonths(String months){

String lowerCase = months.toLowerCase();

if (lowerCase.equals("january"))return 1;

else 
if (lowerCase.equals("febuary"))return 2;
else
if (lowerCase.equals("march")) return 3;
else
if (lowerCase.equals("april")) return 4;
else
if (lowerCase.equals("may")) return 5;
else
if (lowerCase.equals("june")) return 6;
else
if (lowerCase.equals("july")) return 7;
else
if (lowerCase.equals("august")) return 8;
else
if (lowerCase.equals("september")) return 9;
else
if (lowerCase.equals("october")) return 10;
else
if (lowerCase.equals("november")) return 11;
else
if (lowerCase.equals("december")) return 12;
return 0;


}

public static String startedMensuration(int Year , int Month, int Day, int duration){

if ( Month == 0){
return "invalid spelling of months olodo";
}

LocalDate mensStart = LocalDate.of(Year , Month, Day);
LocalDate mensEnd = mensStart.plusDays(duration);

LocalDate currentDate = LocalDate.now();

if (currentDate.isBefore(mensEnd)){
long remainingDays = ChronoUnit.DAYS.between(currentDate , mensEnd);
return "Remaining days are "+ remainingDays+" days";
}else 
if (currentDate.isEqual(mensEnd)){
return "Your mensturation will end today";


}
return "Oga your mensturation don pass oo";
}









}