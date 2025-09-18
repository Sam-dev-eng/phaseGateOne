import java.util.*;
public class StudentGrade{
public static ArrayList <String> StudentNUmbers = new ArrayList<String>();
public static ArrayList <String> StudentSubjects = new ArrayList<String>();
public static void main(String[]args){


mainMenu();
}
public static void mainMenu(){
Scanner scanner = new Scanner (System.in);

//Number of students
System.out.println("How many students do you have?");
int studentNumber = scanner.nextInt();
displayStudentNumber(studentNumber);

//Number of Subjects
System.out.println("How many subjects do they offer");
int studentSubjects = scanner.nextInt();
displayStudentSubjects(studentSubjects);

int [][] scores = collectscores(studentNumber,studentSubjects);

System.out.println("\n\n============================================================================================");
System.out.print("STUDENT    ");
for (int sub = 0; sub < studentSubjects; sub++){
System.out.print("\t"+StudentSubjects.get(sub));

}
System.out.println("\tTOT\tAVE\tPOS");
System.out.println("================================================================================================");
System.out.println("");
for (int count = 0; count <  scores.length; count++){
  System.out.print(StudentNUmbers.get(count)+"		");
  for (int counter = 0; counter < scores[count].length; counter++){
  System.out.print(scores[count][counter]+"\t");


}
System.out.print(total(scores)[count]+"\t"+String.format("%.2f",average(scores)[count])+"\t"+position(total(scores),total(scores)[count]));
System.out.println("");

}

System.out.println("=================================================================================================");
System.out.println("=================================================================================================");
System.out.println("\n\nSUBJECT SUMMARY");

for (int count = 0; count < scores[0].length; count++){
   int highest = 0;
   int lowest = scores[0][count];
   String highestStudent = "";
   int subTotal = 0;
   float average = 0;
   int numberOfPass = 0;
   int numberOfFailed = 0;
   String lowestStudent = StudentNUmbers.get(0);
    for (int counter = 0; counter < scores.length; counter++){

     subTotal += scores[counter][count]; 
     if (scores[counter][count] > highest){
      highest = scores[counter][count]; 
       highestStudent = StudentNUmbers.get(counter);
      
}
     if (scores[counter][count] < lowest){
      lowest = scores[counter][count]; 
      lowestStudent = StudentNUmbers.get(counter);
}   
     if (numberOfPassAndFailed(scores[counter][count]).equals("pass")){
       numberOfPass++;
}else
if (numberOfPassAndFailed(scores[counter][count]).equals("failed")){
       numberOfFailed++;

}
} 
average = (float)(subTotal / scores.length); 
System.out.printf("""

%s      
Highest scoring student is: %s scoring %d

Lowest scoring student is: %s  scoring %d

Total Score is: %d

Average score is: %.2f

Number of passes: %d

Number of Fails: %d
========================================================================

""", StudentSubjects.get(count),highestStudent ,highest,lowestStudent , lowest,
 subTotal,average, numberOfPass,numberOfFailed);


}

String hardestSub = StudentSubjects.get(0);
String easiestSub = StudentSubjects.get(0);
int lowestSub = 0;
int numberOffalures = 0;
int numberOfPasses = 0;
int overallHigest = 0;
String overAllHighStudent = StudentSubjects.get(0);
String highStudent = "";
String overAllLowStudent = StudentSubjects.get(0);
int overallLowest = scores[0][0];
String lowStudent = StudentNUmbers.get(0);
for (int count = 0; count < scores[0].length; count++){
   int highest = 0;
   int lowest = scores[0][count];
   String highestStudent = "";
   int subTotal = 0;
   float average = 0;
   int numberOfPass = 0;
   int numberOfFailed = 0;
   
   String lowestStudent = StudentNUmbers.get(0);
    for (int counter = 0; counter < scores.length; counter++){

     subTotal += scores[counter][count]; 
     if (scores[counter][count] > highest){
      highest = scores[counter][count]; 
       highestStudent = StudentNUmbers.get(counter);
      
}
     if (scores[counter][count] < lowest){
      lowest = scores[counter][count]; 
      lowestStudent = StudentNUmbers.get(counter);
}   
     if (numberOfPassAndFailed(scores[counter][count]).equals("pass")){
       numberOfPass++;
}else
if (numberOfPassAndFailed(scores[counter][count]).equals("failed")){
       numberOfFailed++;

}

} 
average = (float)(subTotal / scores[0].length); 

if (highest > overallHigest){
overallHigest = highest;
overAllHighStudent = StudentSubjects.get(count);
highStudent =  highestStudent;
} 

if (lowest < overallLowest){
overallLowest = lowest;
overAllLowStudent = StudentSubjects.get(count);
lowStudent =  lowestStudent;

} 



if ( numberOfPass > numberOfPasses){
easiestSub = StudentSubjects.get(count);
numberOfPasses = numberOfPass;
}




if (numberOfFailed > numberOffalures){
hardestSub = StudentSubjects.get(count);
numberOffalures = numberOfFailed;


} 

}

int classTotal = 0;
int bestGrad = 0;
int worstGrad = total(scores)[0];
String bestStudentNumber = "";
String worstStudentNumber = StudentNUmbers.get(0);
for (int count = 0; count < total(scores).length; count++){
classTotal += total(scores)[count];


if (total(scores)[count] > bestGrad){
bestGrad = total(scores)[count];
bestStudentNumber = StudentNUmbers.get(count);
}

if (total(scores)[count] < worstGrad){
worstGrad = total(scores)[count];
worstStudentNumber  = StudentNUmbers.get(count);

}


} 
float classAverage = (float)(classTotal / total(scores).length); 


System.out.printf("""
=============================================================================

The Hardest subject is  %s with %d falures

The Easiest subject is  %s with %d passes 
 
The overall highest score is scored by %s in  %s Scoring %d

The overall lowest score is scored by %s in  %s Scoring %d
===============================================================================

Class Summary

===================================================================================

Best Graduating Student is: %s Scoring %d
=============================================================================


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Worst Graduating Student is: %s scoring %d

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

class Total score is: %d

class average score is : %.2f

=======================================================================================

""",hardestSub,numberOffalures ,easiestSub ,numberOfPasses,

highStudent,overAllHighStudent, overallHigest,

lowStudent,overAllLowStudent,overallLowest,

bestStudentNumber , bestGrad,

 worstStudentNumber ,worstGrad,

classTotal,  classAverage);



















}
public static Object displayStudentNumber(int numberOfStudents){
Scanner scanner = new Scanner(System.in);

for (int count = 1; count <= numberOfStudents; count++){
System.out.printf("Enter Name of student %d !In Three Words eg.(ayo)!\n",count);
String studentName = scanner.nextLine();
StudentNUmbers.add(studentName);


}

return StudentNUmbers;
}

public static Object displayStudentSubjects(int numberOfSubjects){
Scanner scanner = new Scanner(System.in);
int counter = 1;
for (int count = 1; count <= numberOfSubjects; count++){
System.out.printf("Enter Name of Subject %d eg.(Eng)\n", count);
String SubjectName = scanner.next(); 
StudentSubjects.add(SubjectName);

}
return StudentSubjects;
}




public static int [][] collectscores(int numberOfStudents , int numberOfSubject){
Scanner scanner = new Scanner (System.in);
int [][]studentScores = new int[numberOfStudents][numberOfSubject];
int number = 1;
for (int count = 0; count < studentScores.length; count++){
System.out.printf("\n   SCORES FOR STUDENT %s%n%n",StudentNUmbers.get(count));
int subNumber = 1;
 for(int counter = 0; counter < studentScores[count].length; counter++){ 
System.out.printf("Enter score for %s%n",StudentSubjects.get(counter));
 int scores = scanner.nextInt();
String valid = checkScores(scores);
while (!valid.equals("true")){
System.out.println("Try again enter a number less than 100 and greater than 0");
 scores = scanner.nextInt();
valid = checkScores(scores);

} 
studentScores[count][counter] = scores;
}
System.out.print("Saving... Please wait.");
timeToAdd(10);
System.out.println("\n\nAdded Sucessfully!!");
}
System.out.print("Fetching Scores... Please Wait a sec.");
timeToAdd(7);

return studentScores;
}

public static int [] total(int[][] scores){
int [] total = new int[scores.length];

for (int count = 0; count < scores.length; count++){
 for (int counter = 0; counter < scores[count].length; counter++){
   total[count] += scores[count][counter];

}
}
return total;

}



public static float [] average(int[][] scores){
float [] average = new float[scores.length];

for (int count = 0; count < scores.length; count++){
float sum = 0;
 for (int counter = 0; counter < scores[count].length; counter++){
    sum += scores[count][counter];
  }
 float averageNum = (float)(sum / scores[0].length); 
   average[count] = averageNum;

}
return average;

}



public static int position(int [] total , int number){
ArrayList <Integer> newArray = new ArrayList<Integer>();

int storeNumber = 0;
for (int count = 0; count < total.length; count++){

for (int counter = 0; counter < total.length - count - 1 ; counter++){

if (total[counter] < total[counter + 1 ]){
storeNumber = total[counter];
total[counter] = total[counter + 1];
total[counter + 1] = storeNumber; 
}

}
}
for (int count = 0; count < total.length; count++){

newArray.add(total[count]);
}
int num = newArray.indexOf(number);

return num + 1;
}


public static String numberOfPassAndFailed(int number){

if ( number >= 50 && number <= 100) return "pass";
else
if ( number >= 0 && number < 50 ) return "failed"; 


 return "Null";    

}

public static String checkScores(int number){

if (number <= 100 && number >= 0)return "true";

return "false";
}


public static void timeToAdd(long seconds){
long totalMililSecondNow = System.currentTimeMillis();
 long totalCurrentSecondNow = totalMililSecondNow / 1000;


long timer = 0;
long time = 0;
while ( time < seconds){
long totalMililSec = System.currentTimeMillis();
long totalCurrentSecond = totalMililSec / 1000;


time = totalCurrentSecond - totalCurrentSecondNow;

if (time != timer){
System.out.print(".");

timer = time;
}

}

}







}
















