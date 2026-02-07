package OverRiding;

public class ImagePost extends Post{
    @Override
    void share(){
        System.out.println("이미지 공유");
    }
}
