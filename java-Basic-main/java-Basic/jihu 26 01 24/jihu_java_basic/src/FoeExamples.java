public class FoeExamples {
    public static void main(String[] args) {

        int len = 5;      //층수
        int blank;
        for (int i = 0; i < len; i++) {
            blank = len - i - 1;
            for (int b = blank; b > 0; b--)                         System.out.print(" ");
            for (int s = 0; s < ((len - blank) - 1) * 2 + 1; s++)   System.out.print("*");
            System.out.println();
        }
        for (int i = len; i > 0; i--){
            for (int k = 0; k < 5 - i; k++) System.out.print(" ");
            for(int j = 0; j < (i-1) * 2 +1; j++)      System.out.print("*");
            System.out.println();
        }

//        int len = 5;      //층수
//        int blank;
//        for (int i = 0; i < len; i++){
//            blank = len - i - 1;
//            for (int b = blank;b > 0; b--)                  System.out.print(" ");//blank 변수를 그냥넣어두면 아래 for 문 에러
//            for(int star = 0; star < len - blank; star++)   System.out.print("*");
//            System.out.println();
//        }

//        for (int i = 5; i > 0; i--){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }








        // FOR
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i  = 2; i <=10; i++){
//            for (int f = 1; f <=9; f++){
//                System.out.printf("%d X %d = %d\n",i,f,i*f);
//            }
//        }
    }
}
