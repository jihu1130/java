package Student;

public class Student {
    private String  name;           // 이름
    private int     score;          // 점수

    public Student(){}

    public  Student(String name){
        this.name       = name;
    }

    public  Student(String name, int score){
        this.name       = name;
        this.score      = score;
    }

}
