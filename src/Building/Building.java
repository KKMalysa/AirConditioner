package Building;


import AirConditioner.AirConditioner;
import AirConditioner.BasicAirConditioner;
import AirConditioner.ProAirConditioner;

import java.util.Random;

//perhaps it should be a singleton
public class Building {
    private Room[] rooms;

    public Building (int numberOfRooms){
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    /**
     * @currentTemperature & @targetTemperature have same bounds, couse AirConditioner can also heat
     * instead of cooling only. So some rooms will be cooled, and some will be warmed in a same time.
     */
    private void generateRooms(){
        Random random = new Random();
        for(int i=0; i<rooms.length; i++){
            int currentTemperature = 20 + random.nextInt(8); // 20-28'C
            int targetTemperature = 20 + random.nextInt(8); // 20-28'C becouse it can heat and cool
            int volume = 10;
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i+1, currentTemperature, targetTemperature, volume, airConditioner);
        }
    }

    /**
     * randomly set pro / basic AirConditioner
     * @return AirConditioner
     */
    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }

    /**
     * the weather randomly (cool/heat) affects into a temperature in a whole building
     */
    public void weatherCondition() {
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            for (Room room : rooms){
                room.setCurrentTemperature(room.getCurrentTemperature()-1);
                System.out.println("temperature fall due to bad weather, now its: " + room.getCurrentTemperature() + "'C");
            }
        else
            for (Room room : rooms){
                room.setCurrentTemperature(room.getCurrentTemperature()+1);
                System.out.println("temperature rise due to bad weather, now its: " + room.getCurrentTemperature() + "'C");
            }

    }

    /**
     * checks temperature in each room
     * @check room.temperatureKeeper()
     */
    public void checkTemperature(){// heat/coolRooms
        for (Room room : rooms) {
            room.temperatureKeeper();
        }
    }

    /**
     * @return true when each room in a building reaches the target temperature
     */
    public boolean reachTheTemperature(){ // areAllRoomsCool /heat
        for (Room room : rooms) {
            if ((int) room.getCurrentTemperature() != room.getTargetTemperature())
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
