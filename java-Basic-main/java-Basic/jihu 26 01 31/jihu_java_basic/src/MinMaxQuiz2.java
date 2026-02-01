import java.util.Arrays;

public class MinMaxQuiz2 {
    public static void main(String[] args) {
        // length가 5인 배열 선언 및 초기화
        int[] arr = {1, 2, 3, 4, 5};

        // 수많은 변경들...x

        //배열 상태를 확인하기 위해 출력
        System.out.println(Arrays.toString(arr));

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);

        newArr[5] = 6;

        System.out.println(Arrays.toString(newArr));

        int[] unsortedArr = {5,1,3,2,0};

        // 배열을 정리합니다
        Arrays.sort(unsortedArr);

        System.out.println(Arrays.toString(unsortedArr));
    }
}