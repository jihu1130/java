public class WhileExamples {
    public static void main(String[] args) {
        //기본문법
//        int num = 10;
//        while(num > 0){
//            System.out.println(num);
//            num--;
//        }
        //무한루프
//        while (true){
//            System.out.println("안녕하세요.");
//        }
        //break
//        int num = 0;
//        while (true){
//            System.out.println(num);
//            num++;
//
//            if(num == 5)
//                break;
//        }
        //별 계단 그리기
        int depth = 1;
        int star;
        while (depth <= 5){
            star = 0;

            while (star < depth){
                System.out.print("*");
                star++;
            }
            System.out.println();
            depth++;
        }

    }
}
