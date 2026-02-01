import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y,quadrant;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        sc.nextLine();

        y = sc.nextInt();

        if(x > 0)   quadrant = y > 0 ? 1:4;
        else        quadrant = y > 0 ? 2:3;

        System.out.println(quadrant);
    }
}