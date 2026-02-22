package Vehicle;

public class ElectricCar extends Vehicle implements Electric{
    @Override
    void drive() {
        System.out.println("운전합니다.");
    }

    @Override
    public void charge() {
        System.out.println("충전합니다");
    }
}
