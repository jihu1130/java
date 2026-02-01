public class Array {
    public static void main(String[] args) {
        //선언 및 초기화 (기본값: 0)
        int[] numbers = new int[3]; //{0, 0, 0}
        numbers[0] = 1;             //{1, 0, 0}
        numbers[1] = 2;             //{1, 2, 0}
        numbers[2] = 3;             //{1, 2, 3}
        numbers[0] = 4;             //{4, 2, 3}

        // 선언 및 초기화, 값 할당
        int[] scores = {85, 73, 92, 100, 88};
//        System.out.println("scores의 첫 번쨰 값: " + scores[0]);  // 85
//        System.out.println("배열의 길이: "+ scores.length);
//
//        // for 문을 활용한 순회
//        for  (int i = 0; i < scores.length; i++){
//            System.out.printf("scores[%d] = %d\n",i,scores[i]);
//        }
        // 합계와 평균을 구합니다.

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = (double) total / scores.length;

        System.out.printf("합계: %d / 평균: %.1f" , total , average);
        // 향상된 for문
        for (int score : scores){
            System.out.println(score);
        }
    }
}
