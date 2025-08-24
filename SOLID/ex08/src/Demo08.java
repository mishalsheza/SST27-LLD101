public class Demo08 {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.pedal(5);

        Car car = new Car();
        car.startEngine();

        ElectricCar tesla = new ElectricCar();
        tesla.startEngine();
        tesla.recharge(50);
        
    }
}
