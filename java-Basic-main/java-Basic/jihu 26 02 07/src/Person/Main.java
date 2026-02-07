package Person;

public class Main {
    public static void main(String[] args) {
        Person Kim = new Person("Kim",21);
        Kim.whoAmI();


        System.out.println(Kim.getName() + " " + Kim.getAge());
    }
}
