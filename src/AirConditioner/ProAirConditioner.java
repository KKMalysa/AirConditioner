package AirConditioner;

public class ProAirConditioner implements AirConditioner {
    private static final double COOL_TEMPERATURE = 6;
    private static final double HEAT_TEMPERATURE = 6;


    @Override
    public double cooling(double temperature, double cubature) {
        return temperature-(COOL_TEMPERATURE/cubature);
    }

    @Override
    public double heating(double temperature, double cubature) {
        return temperature+(HEAT_TEMPERATURE/cubature);
    }


    @Override
    public String toString() {
        return "ProAirConditioner{}";
    }
}
