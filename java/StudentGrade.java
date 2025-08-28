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

System.out.print("STUDENT    ");
for (int sub = 0; sub < studentSubjects; sub++){
System.out.print("\t"+StudentSubjects.get(sub));

}
System.out.println("\tTOT\tAVE\tPOS");
System.out.println("");

for (int count = 0; count <  scores.length; count++){
  System.out.print(StudentNUmbers.get(count)+"\t");
  for (int counter = 0; counter < scores[count].length; counter++){
  System.out.print(scores[count][counter]+"\t");


}
System.out.print(total(scores)[count]+"\t"+average(scores)[count]+"\t"+position(total(scores),total(scores)[count]));
System.out.println("");

}

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
average = (float)(subTotal / scores[0].length); 

System.out.printf("""

Subject %d      
Highest scoring student is: %s scoring %d

Lowest scoring student is: %s  scoring %d

Total Score is: %d

Average score is: %.2f

Number of passes: %d

Number of Fails: %d
""", count + 1,highestStudent ,highest,lowestStudent , lowest,
 subTotal,average, numberOfPass,numberOfFailed);


}

int hardestSub = 0;
int easiestSub = 0;
int lowestSub = 0;
int numberOffalures = 0;
int numberOfPasses = 0;
int overallHigest = 0;
int overAllHighStudent = 0;
String highStudent = "";
int overAllLowStudent = 0;
int overallLowest = scores[0][0];
String lowStudent = "";
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
overAllHighStudent = count + 1;
highStudent =  highestStudent;
} 

if (lowest < overallLowest){
overallLowest = lowest;
overAllLowStudent = count + 1;
System.out.println("---"+overAllLowStudent );

lowStudent =  lowestStudent;

} 



if ( numberOfPass > easiestSub ){
easiestSub = count+1;
numberOfPasses = numberOfPass;
}




if (numberOfFailed > hardestSub){
hardestSub = count+1;
numberOffalures = numberOfFailed;


} 

}

int bestGrad = 0;
String bestStudentNumber = "";
for (int count = 0; count < total(scores).length; count++){

if (total(scores)[count] > bestGrad){
bestGrad = total(scores)[count];
bestStudentNumber = StudentNUmbers.get(count);
}

} 






System.out.printf("""


The Hardest subject is Subject %d with %d falures

The Easiest subject is Subject %d with %d passes 
 
The overall highest score is scored by %s in Subject %d Scoring %d

The overall lowest score is scored by %s in Subject %d Scoring %d
===============================================================================

Class Summary

===================================================================================

Best Graduating Student is: %s Scoring %d
""",hardestSub,numberOffalures ,easiestSub ,numberOfPasses,
highStudent,overAllHighStudent, overallHigest,

lowStudent,overAllLowStudent,overallLowest,

bestStudentNumber , bestGrad );



















}
public static Object displayStudentNumber(int numberOfStudents){


for (int count = 1; count <= numberOfStudents; count++){
StudentNUmbers.add("student "+ count);


}

return StudentNUmbers;
}

public static Object displayStudentSubjects(int numberOfSubjects){

int counter = 1;
for (int count = 1; count <= numberOfSubjects; count++){
StudentSubjects.add("SUB"+ count);

}
return StudentSubjects;
}




public static int [][] collectscores(int numberOfStudents , int numberOfSubject){
Scanner scanner = new Scanner (System.in);
int [][]studentScores = new int[numberOfStudents][numberOfSubject];
int number = 1;
for (int count = 0; count < studentScores.length; count++){
;
int subNumber = 1;
 for(int counter = 0; counter < studentScores[count].length; counter++){ 
System.out.printf("Enter score for student %d%nEnter score for subject %d%n",count + 1,counter + 1);
studentScores[count][counter] = scanner.nextInt();

}
}
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
 float averageNum = (float)(sum / scores[count].length); 
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

if ( number > 20 && number <= 100) return "pass";
else
if ( number < 20 && number >= 0) return "failed"; 


 return "Null";    

}












}
















