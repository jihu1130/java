public class ShapeWithStar {
    public static void main(String[] args) {
        //  *   0 * 2 + 1
        // ***  1 * 2 + 1
        //***** 2 * 2 + 1
        // ***  level - i - 1
        //  *   level - i - 1
        // 전채중, 가장긴 별의수: level * 2 - 1;
        int input = 7;
        int level = input * 2 - 1;

        for (int i = 0 ; i < level; i++){
            int blank =  i < input ? input - i - 1 : -(input - i - 1);
            int star =  i < input? i * 2  + 1 : (level - i  - 1) * 2 + 1;

            while (blank != 0){
                System.out.print(" ");
                blank--;
            }

            while (star != 0){
                System.out.print("*");
                star--;
            }


            System.out.println();
        }

    }
}
