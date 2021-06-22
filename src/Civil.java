public class Civil extends AirTransport{
    public int numberOfPassengers;
    public boolean availBysinessClass;

    public Civil(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayStrip, int numberOfPassengers, boolean availBysinessClass) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayStrip);
        this.numberOfPassengers = numberOfPassengers;
        this.availBysinessClass = availBysinessClass;
    }

    @Override
    public String toString() {
        return "Civil{" +
                "wingspan=" + wingspan + " м" +
                ", minRunwayStrip=" + minRunwayStrip + " м" +
                ", numberOfPassengers=" + numberOfPassengers +
                ", availBysinessClass=" + availBysinessClass +
                ", horrsePower=" + horsePower + " л.с." +
                ", PowerKWt= " + Transport.converterPowerToKwt(horsePower) + " кВт" +
                ", maxSpeed=" + maxSpeed + " км/ч" +
                ", weight=" + weight + " кг" +
                ", model='" + model + '\'' +
                '}';
    }

    public void capacityOfPassengers(int capacity){
        if(numberOfPassengers <= capacity){
            System.out.println("Вместимость самолета достаточная");
        }
        else{
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
