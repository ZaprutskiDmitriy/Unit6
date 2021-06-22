public class AirTransport extends Transport{
    public int wingspan;
    public int minRunwayStrip;

    public AirTransport(int horsePower, int maxSpeed, int weight, String model, int wingspan, int minRunwayStrip) {
        super(horsePower, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayStrip = minRunwayStrip;
    }
}
