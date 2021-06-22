public class Truck extends LandTransport{
    public int carrying;

    public Truck(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels= " + numberOfWheels +
                ", fuelConsumption= " + fuelConsumption + " л/100км" +
                ", horsePower= " + horsePower + " л.с." +
                ", PowerKWt= " + Transport.converterPowerToKwt(horsePower) + " кВт" +
                ", maxSpeed= " + maxSpeed + " км/ч" +
                ", weight= " + weight + " кг" +
                ", model='" + model + '\'' +
                ", carrying= " + carrying + " т" +
                '}';
    }

    public void loadingOfCargo(int cargo){
        if(cargo <= carrying){
            System.out.println("Грузовик загружен");
        }
        else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
