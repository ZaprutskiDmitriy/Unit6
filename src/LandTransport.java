public class LandTransport extends Transport{
    public int numberOfWheels;
    public int fuelConsumption;

    public LandTransport(int horsePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
