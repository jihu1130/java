import java.sql.SQLOutput;
import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
//        int num = 10;
//
//        if (num > 5) {
//            num += 20;
//        }
//
//        System.out.println(num);
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println("운전면허 유무를 입력하세요 (Yes/No): ");
        String hasLicense = sc.nextLine();


        if (age > 19) {
            System.out.println("성인입니다.");
            if (hasLicense.equals("Yes")) {
                System.out.println("운전할 수 있어요.");
            } else {
                System.out.println("운전할 수 없어요.");
            }
        } else {
            System.out.println("성인이아닙니다.");
            System.out.println("운전할 수 없어요.");
        }
    }
}