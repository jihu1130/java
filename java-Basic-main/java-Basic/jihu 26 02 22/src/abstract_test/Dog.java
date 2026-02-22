package abstract_test;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("헥헥..!");
    }

    @Override
    void sound(){
        System.out.println("멍멍");
    }
}
