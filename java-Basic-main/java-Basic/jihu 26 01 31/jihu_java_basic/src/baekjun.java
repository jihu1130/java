import java.util.Scanner;

public class baekjun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nm = sc.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] basket = new int[n];

        for(int q = 0; q < m; q++){
            String[] tmp = sc.nextLine().split(" ");
            int i = Integer.parseInt(tmp[0]);
            int j = Integer.parseInt(tmp[1]);
            int k = Integer.parseInt(tmp[2]);

            for (int p = i-1; p < j; p++){
                basket[p] = k;
            }
        }

        for (int i : basket) System.out.print(i + " ");
    }
}
