package Building;

import AirConditioner.AirConditioner;

public class Room {
    private int number;
    private double currentTemperature;
    private double targetTemperature;
    private double cubature;
    private AirConditioner airConditioner; // assigned airConditioner


    public Room(int number, double currentTemperature, double targetTemperature, double cubature, AirConditioner airConditioner) {
        this.number = number;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.cubature = cubature;
        this.airConditioner = airConditioner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public double getCubature() {
        return cubature;
    }

    public void setCubature(double cubature) {
        this.cubature = cubature;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", currentTemperature=" + currentTemperature +
                ", targetTemperature=" + targetTemperature +
                ", cubature=" + cubature +
                ", airConditioner=" + airConditioner +
                '}';
    }

    public void temperatureKeeper(){
        if(currentTemperature > targetTemperature){
            currentTemperature = airConditioner.cooling(currentTemperature, cubature);
        }if(currentTemperature < targetTemperature){
            currentTemperature = airConditioner.heating(currentTemperature, cubature);
        }
    }


}
