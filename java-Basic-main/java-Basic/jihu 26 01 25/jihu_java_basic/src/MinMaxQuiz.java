public class MinMaxQuiz {
    public static void main(String[] args) {
        int[] number = {45,78,23,91,56};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i  : number){
             if (i < min)  min     = i;
             if (i > max)  max     = i;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}