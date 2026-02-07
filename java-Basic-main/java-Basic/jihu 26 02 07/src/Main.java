import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int total = Integer.parseInt(a.nextLine());
        int forlen = Integer.parseInt(a.nextLine());
        for (int i =0; i<forlen-1; i++){
            int price, count;
            String[] tmp = a.nextLine().split(" ");
            System.out.println(tmp);
            price = Integer.parseInt(tmp[0]);
            count = Integer.parseInt(tmp[1]);
            total -= price*count;
        }
        if (total == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        String tmp = a.nextLine();
//        System.out.println(tmp + "??!");
//    }
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br =
//                new BufferedReader(new InputStreamReader(System.in));
//
//        String[] p = br.readLine().split("");
//        int i = 0,j = p.length - 1;
//        boolean isPal = false;
//        while (i <= j){
//            if (p[i].equals(p[j])) {
//                isPal = true;
//            }
//            else {
//                isPal = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//
//        if (i >= j) {
//            System.out.println(1);
//        }
//        else {
//            System.out.println(0);
//        }
//    }
//}