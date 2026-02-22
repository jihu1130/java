package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new ElectricCar();
        car.drive();
        car.stop();
        Electric electricCar = (Electric) car;
        electricCar.charge();
    }
}
