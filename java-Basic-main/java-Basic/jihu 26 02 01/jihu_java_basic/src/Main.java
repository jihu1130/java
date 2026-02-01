//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//// 백준 문제풀이
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//
//
////        int n, m;
////        BufferedReader br =
////                new BufferedReader(new InputStreamReader(System.in));
////
////        String[] tmp  = br.readLine().split(" ");
////        n = Integer.parseInt(tmp[1]);
////        m = Integer.parseInt(tmp[0]);
////
////        int[] basket = new int[m];
////
////        for (int q = 0; q< m;)      basket[q] = ++q;
////
////        for (int q = 0; q < n; q++){
////            int i , j,ch;
////            tmp = br.readLine().split(" ");
////            i = Integer.parseInt(tmp[0]) - 1;
////            j = Integer.parseInt(tmp[1]) - 1;
////
////            ch = basket[i];
////            basket[i] = basket[j];
////            basket[j] = ch;
////        }
////
////        for (int q = 0; q < m; q++)     System.out.print(basket[q] + " ");
//    }
//}


///https://www.acmicpc.net/problem/10988
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] p = br.readLine().split("");
        int i = 0,j = p.length();
        int q;
        while (i <= j){
            if (p[i].equals(p[j])) {
                continue;
            }
            else break;
            i++;
            j--;
        }

        if (i >= j) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}