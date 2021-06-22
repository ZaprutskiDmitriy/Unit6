public class Transport {
    public int horsePower;
    public int maxSpeed;
    public int weight;
    public String model;

    public Transport(int horsePower, int maxSpeed, int weight, String model) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    static double converterPowerToKwt(int horsePower){
        return horsePower*0.74;
    }

    public static void main(String[] args) {

        Car car = new Car(100,200,1200,"Audi", 4, 7, "Universal", 4);
        System.out.println(car);
        car.getMaxDistance(4);
        System.out.println();
        Truck truck = new Truck(200,120,8000,"Scania", 4, 25, 15);
        System.out.println(truck);
        truck.loadingOfCargo(20);
        System.out.println();
        Civil civil = new Civil(1000, 700, 100000, "Boeing", 50, 1000, 300, true);
        System.out.println(civil);
        civil.capacityOfPassengers(500);
        System.out.println();
        Military military = new Military(2000, 850, 72000, "IL-76", 50, 500, true, 2);
        System.out.println(military);
        military.shot();
        military.catapult();
    }


}
