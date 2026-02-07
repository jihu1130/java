package OverRiding;

public class VideoPost extends Post{
    @Override
    void share(){
        System.out.println("비디오 공유");
    }
}
