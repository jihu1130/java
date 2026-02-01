package ClassTest;

public class Main {
    public static void main(String[] args) {
        // 사용자: 정지후
        User jung       = new User("hello93");
        jung.password   = "1q2w3e4r";
        jung.email      = "hello93@test.io";
        jung.nickname   = "hello";
        jung.isActive   = true;

        // 사용자: 정국
        User kook       = new User("jungkook");
        kook.password   = "1234qwer";
        kook.email      = "jungkook@test.io";
        kook.isActive   = true;

        // 사용자 활성여부 출력
//        jung.isActiveUser();
//        kook.isActiveUser();
//
//        jung.isActiveUser2(); // -> "활성 사용자입니다." or "비활성 사용자입니다."

        // 닉네임 바꾸기
//        // 현제 닉네임
//        System.out.println(jung.nickname);
//        // 닉네임 변경 메소드 실행
//        jung.changeNickName("Bye");     // jung.nickname = "Bye"과 실행결과는 같다. But 사용X
//        // 병경된 닉네임
//        System.out.println(jung.nickname);

        //1. 정국의 활성상태 출력
        kook.isActiveUser();
        //2. 현재 상태를 반대로 돌리고         //이부분에서  ? A:B 로 출력가능
        if (kook.isActiveUser2())      kook.deactiveUser();
        else                           kook.activeUser();
        //3. 바뀐 상태를 출력
        kook.isActiveUser();

    }
}
