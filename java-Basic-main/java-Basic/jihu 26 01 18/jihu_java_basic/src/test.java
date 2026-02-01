public class test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String result = (x > 5 && y < 30) ? "조건1" :
                (x > 15 || y > 15) ? "조건2" : "조건3";
        System.out.println(result);
    }
}