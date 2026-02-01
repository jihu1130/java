package ClassTest;

import java.util.Date;

public class User {
    //변수 선언부
    private String id;              // 아이디
    private String email;           // 이메일
    private String nickname;        // 닉네임
    private String password;        // 비밀번호
    boolean isActive;               // 활성여부
    Date createdAt;                 // 가입일시
    static String servicename = "온라인 쇼핑몰";

    //생성자
    public User() {}
    public User(String id, String password) {
        this.createdAt      = new Date();
        this.password       = password;
        this.isActive       = true;
        this.id             = id;
    }

    public User(String id, String password, String email) {
        this.createdAt      = new Date();
        this.password       = password;
        this.email          = email;
        this.isActive       = true;
        this.id             = id;
    }

    public User(String id, String password,String email , String nickname) {
        this.createdAt      = new Date();
        this.password       = password;
        this.nickname       = nickname;
        this.email          = email;
        this.isActive       = true;
        this.id             = id;
    }

    // 메소드
    public void isActiveUser() { // 액티브를 출력
        if (isActive)       System.out.println("활성 사용자입니다.");
        else                System.out.println("비활성 사용자입니다.");
    }

    public boolean isActiveUser2() { // 액티브를 리턴
        if (isActive)   return true;
        else            return false;
    }

    public String getid() { // id를 가져오는 매서드
        return this.id;
    }

    public void deactiveUser() { // 유저의 액티브 상태를 false 로 전환.
        this.isActive = false;
    }

    public void activeUser()  {  this.isActive = true;} // 유저의 액티브 상태를 true 로 전환.

    public void setNickname(String nickname) {
        if (nickname == null || nickname.length() < 2)
            System.out.println("닉네임은 2자 이상이어야 합니다.");
        else {
            this.nickname = nickname;
            System.out.println("닉네임이 병경되었습니다.");
        }
    }
}
