package Building;


import AirConditioner.AirConditioner;
import AirConditioner.BasicAirConditioner;
import AirConditioner.ProAirConditioner;

import java.util.Random;

public class Building {
    private Room[] rooms;

    public Building (int numberOfRooms){
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    private void generateRooms(){
        Random random = new Random();
        for(int i=0; i<rooms.length; i++){
            int currentTemperature = 20; // + random.nextInt(8); // 20-35'C
            int targetTemperature = 20; // + random.nextInt(8); // becouse it can heat and cool
            int volume = 10;
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i+1, currentTemperature, targetTemperature, volume, airConditioner);
        }
    }

    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }

    public void weatherCondition() { // the weather affects into a temperature in the rooms
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            for (Room room : rooms){
                System.out.println("temperature fall due to bad weather");
                room.setCurrentTemperature(room.getCurrentTemperature()-1);
            }
        else
            for (Room room : rooms){
                System.out.println("temperature rise due to bad weather");
                room.setCurrentTemperature(room.getCurrentTemperature()+1);
            }

    }

    public void checkTemperature(){       // heat/coolRooms
        for (Room room : rooms){
            room.temperatureKeeper();
        }
    }

    public boolean reachTheTemperature(){ // areAllRoomsCool /heat
        for (Room room : rooms){
            if((int)room.getCurrentTemperature() != room.getTargetTemperature())
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Room room : rooms) {
            builder.append(room.toString()).append("\n");
        }
        return builder.toString();
    }

}
