import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> subjects =  new ArrayList<>();
    private ArrayList<Integer> scores = new ArrayList<>();


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(String subject) {
        subjects.add(subject);
    }
    public ArrayList<Integer> getScores() {
        return scores;

    }
    public void setScores(int score) {
      scores.add(score);
    }

    }
