import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        //데이터 입력및 전처리
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] AB = input.split(" ");

        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);
        //요구사항 구현
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
