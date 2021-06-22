import java.util.SortedMap;

public class Car extends LandTransport{
    public String typeBody;
    public int numberOfPassengers;

    public Car(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, String typeBody, int numberOfPassengers) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.typeBody = typeBody;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeBody= '" + typeBody + '\'' +
                ", numberOfPassengers= " + numberOfPassengers +
                ", numberOfWheels= " + numberOfWheels +
                ", fuelConsumption= " + fuelConsumption + " л/100км" +
                ", horsePower= " + horsePower + " л.с." +
                ", PowerKWt= " + Transport.converterPowerToKwt(horsePower) + " кВт" +
                ", maxSpeed= " + maxSpeed + " км/ч" +
                ", weight= " + weight + " кг" +
                ", model='" + model + '\'' +
                '}';
    }

    public void getMaxDistance(int time){
        double distance = time*maxSpeed;
        double fuel = fuelConsumption*distance/100;
        System.out.println("За время " + time + "ч, автомобиль " + model + " двигаясь с максимальной скоростью " +
                maxSpeed + "км/ч проедет " + distance + " км и израсходует " + fuel + " литров топлива.");
    }



}

