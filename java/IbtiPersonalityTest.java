import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class IbtiPersonalityTest{
public static void main(String[] args){

mainMenu();

}

public static void mainMenu(){
Scanner scanner = new Scanner (System.in);
System.out.println("Hello Whats your Name");
String name = scanner.nextLine();

int stop = 0;

int extrovertCount = 0;
int introvertCount = 0;
ArrayList<String> extroIntroAnswers = new ArrayList<String>();
ArrayList<String> eiObjectives = new ArrayList<String>();


int senSingCount = 0;
int inttuitiveCount = 0;
ArrayList<String> sensiIntiutiveAnswers = new ArrayList<String>();
ArrayList<String> SNObjectives = new ArrayList<String>();

int thinkingCount = 0;
int feelingCount = 0;
ArrayList<String> thinkFeelAnswers = new ArrayList<String>();
ArrayList<String> TFObjectives = new ArrayList<String>();

int judgingCount = 0;
int perceptiveCount = 0;
ArrayList<String> judgePerceptiveAnswers = new ArrayList<String>();
ArrayList<String> JPObjectives = new ArrayList<String>();

while (stop != 20){


int index = 1; 
for (int count = 0; count < 20; count++){
System.out.println("A: "+ displayQuestions()[count][0][0] + " B: "+ displayQuestions()[count][1][0]);
String answer = scanner.nextLine();
String lowercase = answer.toLowerCase();

//Extrovert and Introvert count

if (lowercase.equals("a") && count == 0 || lowercase.equals("a") && count == 4 || lowercase.equals("a") && count == 8 || lowercase.equals("a") && count == 12 || lowercase.equals("a") && count == 16){
extrovertCount++;
extroIntroAnswers.add(displayQuestions()[count][0][0]);
eiObjectives.add(lowercase);
} else
if (lowercase.equals("b") && count == 0 || lowercase.equals("b") && count == 4 || lowercase.equals("b") && count == 8 || lowercase.equals("b") && count == 12 || lowercase.equals("b") && count == 16){
extroIntroAnswers.add(displayQuestions()[count][1][0]);
eiObjectives.add(lowercase);
introvertCount++; 

}



//SenSing and intuitive count

if (lowercase.equals("a") && count == 1 || lowercase.equals("a") && count == 5 || lowercase.equals("a") && count == 9 || lowercase.equals("a") && count == 13 || lowercase.equals("a") && count == 17){
sensiIntiutiveAnswers.add(displayQuestions()[count][0][0]);
SNObjectives.add(lowercase);
senSingCount++; 
} else
if (lowercase.equals("b") && count == 1 || lowercase.equals("b") && count == 5 || lowercase.equals("b") && count == 9 || lowercase.equals("b") && count == 13 || lowercase.equals("b") && count == 17){
sensiIntiutiveAnswers.add(displayQuestions()[count][1][0]);
SNObjectives.add(lowercase);
inttuitiveCount++; 
}


//Thinking and feeling count

if (lowercase.equals("a") && count == 2 || lowercase.equals("a") && count == 6 || lowercase.equals("a") && count == 10 || lowercase.equals("a") && count == 14 || lowercase.equals("a") && count == 18){
thinkFeelAnswers.add(displayQuestions()[count][0][0]);
TFObjectives.add(lowercase);
thinkingCount++; 
} else
if (lowercase.equals("b") && count == 2 || lowercase.equals("b") && count == 6 || lowercase.equals("b") && count == 10 || lowercase.equals("b") && count == 14 || lowercase.equals("b") && count == 18){
thinkFeelAnswers.add(displayQuestions()[count][1][0]);
TFObjectives.add(lowercase);
feelingCount++; 
}

//Judging and perceptive count


if (lowercase.equals("a") && count == 3 || lowercase.equals("a") && count == 7 || lowercase.equals("a") && count == 11 || lowercase.equals("a") && count == 15 || lowercase.equals("a") && count == 19){
judgePerceptiveAnswers.add(displayQuestions()[count][0][0]);
JPObjectives.add(lowercase);
judgingCount++; 
} else
if (lowercase.equals("b") && count == 3 || lowercase.equals("b") && count == 7 || lowercase.equals("b") && count == 11 || lowercase.equals("b") && count == 15 || lowercase.equals("b") && count == 19){
judgePerceptiveAnswers.add(displayQuestions()[count][1][0]);
JPObjectives.add(lowercase);
perceptiveCount++; 
}


stop++;
}
}


System.out.printf("Hello %s You Selected\n\n",name);
for (int countEI = 0; countEI < eiObjectives.size(); countEI++){
System.out.println(eiObjectives.get(countEI)+": " + extroIntroAnswers.get(countEI));
}
System.out.println("NUmbers of A selected: "+ extrovertCount);
System.out.println("NUmbers of B selected: "+ introvertCount);

System.out.println("");

for (int countSN = 0; countSN < SNObjectives.size(); countSN++){
System.out.println(SNObjectives.get(countSN)+": " + sensiIntiutiveAnswers.get(countSN));
}
System.out.println("NUmbers of A selected: "+ senSingCount);
System.out.println("NUmbers of B selected: "+ inttuitiveCount);

System.out.println("");

for (int countTF = 0; countTF < TFObjectives.size(); countTF++){
System.out.println(TFObjectives.get(countTF)+": " + thinkFeelAnswers.get(countTF));
}
System.out.println("NUmbers of A selected: "+ thinkingCount);
System.out.println("NUmbers of B selected: "+ feelingCount);

System.out.println(""); 

for (int countJP = 0; countJP < JPObjectives.size(); countJP++){
System.out.println(JPObjectives.get(countJP)+": " + judgePerceptiveAnswers.get(countJP));
}
System.out.println("NUmbers of A selected: "+ judgingCount);
System.out.println("NUmbers of B selected: "+ perceptiveCount);

System.out.println("");

String personality = displayPersonalities(introvertCount,extrovertCount,
senSingCount,inttuitiveCount, thinkingCount ,feelingCount ,judgingCount , perceptiveCount);

System.out.println("Your Personality is :"+ personality);
System.out.println(displayPersonalityMeaning(personality));


}


public static String displayPersonalities(int introvert , int extrovert,
int sensing, int inttuitive, int thinking, int feeling, int judging, int perceptive){

String [] persnality = new String[4];
if (introvert > extrovert)persnality[0] = "I";
else persnality[0] = "E";


if (sensing > inttuitive)persnality[1] = "S";
else persnality[1] = "N";

if (feeling > thinking) persnality[2] = "F";
else persnality[2] = "T";

if (judging > perceptive) persnality[3] = "J";
else persnality[3] = "P";

String line = "";
for(String item : persnality){
line = line + item;

}

return line;


}















public static String[][][] displayQuestions(){

String[][][] questions = {
{{"expand energy, enjoy groups"},{"conserve energy, enjoy one-on-one"}},
{{"interpret literally"},{"look for meaning and possibilities"}},
{{"logical, thinking, questioning"},{"empathetic, feeling, accommodating"}},
{{"organized, orderly"},{"flexible, adaptable"}},
{{"more outgoing, thinking out loud"},{"more reserved, thinking to yourself"}},
{{"practical, realistic, experiential"},{"imaginative, innovative, theoretical"}},
{{"candid, straight forward, frank"},{"tectful, kind, encouraging"}},
{{"plan, schedule"},{"unplanned, spontaneous"}},
{{"seek many tasks, public activities, interaction with others"},{"seek private, solitary activities with quiet to concentrate"}},
{{"standard, usual, conventional"},{"different, novel, unique"}},
{{"firm, tend to criticize, hold the line"},{"gentle, tend to appreciate, concile"}},
{{"regulated, structured"},{"easy-going, live and let live"}},
{{"external, communicative, express yourself"},{"internal, reticent, keep to yourself"}},
{{"focus on here-and-now"},{"look to the future, global perspective, big picture"}},
{{"tough-minded, just"},{"tender-hearted, merciful"}},
{{"preparation, plan ahead"},{"go with the flow, adapt as you go"}},
{{"active, initiate"},{"reflective, deliberate"}},
{{"facts, things, what is"},{"ideas, what could be, philosophical"}},
{{"matter of fact, issue-oriented"},{"sensitive, people-oriented, compassionate"}},
{{"control, govern"},{"latitude, freedom"}}
};
return questions;
}


public static String displayPersonalityMeaning(String personality){

if (personality.equals("INTJ")){
return """
Who is the Architect personality type?

INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. 
These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. 
Their inner world is often a private, complex one. Thought constitutes the greatness of man. 
Man is a reed, the feeblest thing in nature, but he is a thinking reed.Their Minds are never at rest, 
these personalities may sometimes struggle to find people who can keep up with their nonstop analysis of everything around them.
 But when they do find like-minded individuals who appreciate their intensity and depth of thought, 
INTJs form profound and intellectually stimulating relationships that they deeply treasure

""";

}else 
if (personality.equals("INTP")){
return """
Who is the Logician personality type?

INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. 
These flexible thinkers enjoy taking an unconventional approach to many aspects of life. 
They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
""";


}else
if (personality.equals("ENTJ")){
return  """
Who is the Commander personality type?

ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.
They are decisive people who love momentum and accomplishment.They gather information to construct 
their creative visions but rarely hesitate for long before acting on them.
""";

}else
if (personality.equals("ENTP")){
return  """
Who is the Debater personality type?

ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. 
They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. 
They pursue their goals vigorously despite any resistance they might encounter.
""";

}else 

if (personality.equals("INFJ")){
return  """
Who is the Advocate personality type?

INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits.
They tend to approach life with deep thoughtfulness and imagination.Their inner vision, personal values, 
and a quiet, principled version of humanism guide them in all things.
""";

}else 
if (personality.equals("INFP")){
return """
Who is the Mediator personality type?

INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits.
These rare personality types tend to be quiet, open-minded, and imaginative,
and they apply a caring and creative approach to everything they do.
""";

}else 

if (personality.equals("ENFJ")){
return  """
Who is the Protagonist personality type?

ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. 
These warm, forthright types love helping others, and they tend to have strong ideas and values. 
They back their perspective with the creative energy to achieve their goals.
""";


}else

if (personality.equals("ENFP")){
return  """
Who is the Campaigner personality type?

ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. 
These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. 
Their vibrant energy can flow in many directions.
""";


}else

if (personality.equals("ISTJ")){
return  """
Who is the Logistician personality type?

ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits.
These people tend to be reserved yet willful, with a rational outlook on life. 
They compose their actions carefully and carry them out with methodical purpose.
""";


}else 

if (personality.equals("ISFJ")){
return  """
Who is the Defender personality type?
ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. 
These people tend to be warm and unassuming in their own steady way. 
They’re efficient and responsible, giving careful attention to practical details in their daily lives.
""";

}else 

if (personality.equals("ESTJ")){
return """
Who is the Executive personality type?

ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits.
 They possess great fortitude, emphatically following their own sensible judgment.
 They often serve as a stabilizing force among others, 
able to offer solid direction amid adversity.
""";


}else

if (personality.equals("ESFJ")){
return """
Who is the Consul personality type?

ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. 
They are attentive and people-focused, and they enjoy taking part in their social community. 
Their achievements are guided by decisive values, and they willingly offer guidance to others.
""";


}else

if (personality.equals("ISTP")){
return"""
Who is the Virtuoso personality type?

ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. 
They tend to have an individualistic mindset, pursuing goals without needing much external connection. 
They engage in life with inquisitiveness and personal skill, varying their approach as needed.
""";


}else 

if (personality.equals("ISFP")){
return """
Who is the Adventurer personality type?

ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. 
They tend to have open minds, approaching life, new experiences, and people with grounded warmth. 
Their ability to stay in the moment helps them uncover exciting potentials.
""";


}else

if (personality.equals("ESTP")){
return """
Who is the Entrepreneur personality type?
ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. 
They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. 
They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
""";


}else

if (personality.equals("ESFP")){
return """
Who is the Entertainer personality type?

ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. 
These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
 They can be very social, often encouraging others into shared activities.
""";

}

return "We don't have that personality Meaning for now you can go online and check for more";

}




















}