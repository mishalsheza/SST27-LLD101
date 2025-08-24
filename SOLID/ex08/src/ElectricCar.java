public class ElectricCar implements Electric, Engine {

    @Override
    public void recharge(int kWh) {
        // TODO Auto-generated method stub
        System.out.println("Recharging with " + kWh + " kWh");
    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        System.out.println("Electric car motor started!");
    }

}
