public class timeClaculator{
public static void main (String[] args){

 
long totalMililSecondNow = System.currentTimeMillis();
 long totalCurrentSecondNow = totalMililSecondNow / 1000;

long time = 1;

long previous = 0;

while ( time < 5){


long totalMililSec = System.currentTimeMillis();
long totalCurrentSecond = totalMililSec / 1000;

time = totalCurrentSecond - totalCurrentSecondNow;
if(time != previous){
System.out.print(".");

previous = time;


}


}



}




}


































//long totalMililSec = System.currentTimeMillis();
//long totalCurrentSecond = totalMililSec / 1000;
//long currentSec = totalCurrentSecond % 60;
//long totalMin = totalCurrentSecond / 60;
//long currentMin = totalMin % 60;  