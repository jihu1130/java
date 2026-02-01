import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int score;
        String cls;
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score > 100)
            System.out.println("잘못된 값을 입력하셨습니다.");

        score = (score / 10) * 10;

        switch(score)   {
            case 100:
            case 90:
                cls = "A";
                break;
            case 80:
                cls = "B";
                break;
            case 70:
                cls = "C";
                break;
            case 60:
                cls = "D";
                break;
            default:
                cls = "F";
                break;
        }
        System.out.println(cls);
    }
}