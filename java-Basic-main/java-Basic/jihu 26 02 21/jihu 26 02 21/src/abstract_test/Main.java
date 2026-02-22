package abstract_test;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("코코");
        dog.breathe();
        dog.sound();

        Animal cat = new Cat("키티");
        cat.breathe();
        cat.sound();
    }
}
