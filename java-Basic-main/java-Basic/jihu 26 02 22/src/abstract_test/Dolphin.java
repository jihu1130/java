package abstract_test;

public class Dolphin extends Animal implements Swimmable{

    public Dolphin(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("소리");
    }

    @Override
    public void swim() {
        System.out.println("수영할수 있습니다.");
    }
}
