package abstract_test;

public abstract class   Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    // Methods
    public void breathe() {
        System.out.println(this.name + "이(가) 숨을 쉽니다.");
    }

    abstract void sound();
}
