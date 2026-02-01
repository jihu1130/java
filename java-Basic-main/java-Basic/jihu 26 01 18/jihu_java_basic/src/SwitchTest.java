import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        int day;
        String dayName;

        Scanner sc = new Scanner(System.in);
        System.out.printf("요일을 입력해 주세요 ex)월요일 -> 1 화요일 -> 2 일요일 ->7: ");
        day = sc.nextInt();

        switch (day){
            case 1:
                dayName = "월요일 입니다.";
                break;
            case 2:
                dayName = "화요일 입니다.";
                break;
            case 3:
                dayName = "수요일 입니다.";
                break;
            case 4:
                dayName = "목요일 입니다.";
                break;
            case 5:
                dayName = "금요일 입니다.";
                break;
            case 6:
                dayName = "토요일 입니다.";
                break;
            case 7:
                dayName = "일요일 입니다.";
                break;
            default:
                dayName = "잘못된 요일입니다.";
        }
        System.out.printf(dayName);
    }
}