package ClassTest;

import java.util.Date;

public class User {
    //변수 선언부
    private String id;      // 아이디
    String email;           // 이메일
    String nickname;        // 닉네임
    String password;        // 비밀번호
    boolean isActive;       // 활성여부
    Date createdAt;         // 가입일시
    static String servicename = "온라인 쇼핑몰";

    public User() {}
    public User(String id) { //유저설정
        this.id = id;
        this.isActive = true;
    }

    public void isActiveUser() { // 액티브를 출력
        if (isActive)       System.out.println("활성 사용자입니다.");
        else                System.out.println("비활성 사용자입니다.");
    }

    public boolean isActiveUser2() { // 액티브를 리턴
        if (isActive)   return true;
        else            return false;
    }

    // 매개변수:   Parameter
    // 인자:      Argument
    public void changeNickName(String newNickname) { // 닉네임을 변경하는 매서드.
        if (newNickname == null || newNickname.length() < 2)
            System.out.println("닉네임은 2자 이상이어야 합니다.");
        else {
            this.nickname = newNickname;
            System.out.println("닉네임이 병경되었습니다.");
        }
    }

    public String getid() { // id를 가져오는 매서드
        return this.id;
    }

    public void deactiveUser() { // 유저의 액티브 상태를 false 로 전환.
        this.isActive = false;
    }

    public void activeUser() { // 유저의 액티브 상태를 true 로 전환.
        this.isActive = true;
    }

}
