public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //여기 사이에서 데이터 스위칭
        int tmp = a;
        a = b;
        b = tmp;
        //

        System.out.println(a + ", " + b);
    }
}
