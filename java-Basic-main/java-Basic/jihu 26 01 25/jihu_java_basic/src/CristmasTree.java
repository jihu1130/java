public class CristmasTree {
    public static void main(String[] args) {
        //*****
        // |||
        //*********
        //   |||
        int input = 5;
        for (int i = 0; i < input; i++) {
            int blank = input - i - 1;
            int star = i * 2 + 1;

            while (blank != 0) {
                System.out.print(" ");
                blank--;
            }

            while (star != 0) {
                System.out.print("*");
                star--;
            }


            System.out.println();
        }

        for (int i = 0; i < input +1; i++){
            if(i < input - 2)   System.out.printf(" ");
            else                System.out.printf("|");
//            System.out.print(i < input - 2 ? " " : "|");
        }
    }
}
// 19
// 9
// 8 9 10
