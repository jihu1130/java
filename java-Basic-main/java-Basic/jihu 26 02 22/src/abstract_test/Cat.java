package abstract_test;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("가르랑~");
    }

    @Override
    void sound(){
        System.out.println("냐옹");
    }
}
