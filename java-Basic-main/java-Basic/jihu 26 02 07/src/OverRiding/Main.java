package OverRiding;

public class Main {
    public static void main(String[] args) {
        Post image = new ImagePost();
        Post video = new VideoPost();

        image.share();
        video.share();
    }
}
