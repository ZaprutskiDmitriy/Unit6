public class Military extends AirTransport{
    public boolean availCatapult;
    public int numberOfRockets;

    public Military(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayStrip, boolean availCatapult, int numberOfRockets) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayStrip);
        this.availCatapult = availCatapult;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public String toString() {
        return "Military{" +
                "wingspan=" + wingspan + " м" +
                ", minRunwayStrip=" + minRunwayStrip + " м" +
                ", availCatapult=" + availCatapult +
                ", numberOfRockets=" + numberOfRockets +
                ", horsePower=" + horsePower + " л.с." +
                ", PowerKWt= " + Transport.converterPowerToKwt(horsePower) + " кВт" +
                ", maxSpeed=" + maxSpeed + " км/ч" +
                ", weight=" + weight + " кг" +
                ", model='" + model + '\'' +
                '}';
    }

    public void shot(){
        if(numberOfRockets > 0){
            System.out.println("Ракета пошла...");
        }
        else{
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void catapult(){
        if (availCatapult){
            System.out.println("Катапультирование прпошло успешно");
        }
        else{
            System.out.println("У вас нет такой системы");
        }
    }
}
