//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] tmp = br.readLine().split(" ");
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(tmp[0]);
//        int k = Integer.parseInt(tmp[1]);
//
//
//        int[] x = new int[n];
//        for(int i = 0; i < n; i++){
//            x[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (x[i] > x[j]){
//                    int temp = x[i];
//                    x[i] = x[j];
//                    x[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(x[k-1]);
//    }
//}




