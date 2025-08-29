public class timeClaculator{
public static void main (String[] args){

 
long totalMililSecondNow = System.currentTimeMillis();
 long totalCurrentSecondNow = totalMililSecondNow / 1000;


long time = 1;
while ( time < 6){
long totalMililSec = System.currentTimeMillis();
long totalCurrentSecond = totalMililSec / 1000;


time = totalCurrentSecond - totalCurrentSecondNow;


}

System.out.print("hello world");

}


}