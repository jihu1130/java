package abstract_test;

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("코코");
        dog.breathe();
        dog.sound();

        Animal cat = new Cat("키티");
        cat.breathe();
        cat.sound();

        Animal dolphin = new Dolphin("돌고래");
        dolphin.sound();
        Swimmable dolphinSwim = (Swimmable) dolphin;
        dolphinSwim.swim();

    }
}
