package Building;

public class BuildingController {
    private static Building building;

    public BuildingController(Building building) {
        this.building = building;
    }

    /**
     * @controlLoop takes care about the temperature in each room.
     * Twice in a second checks the Temperature inside Room, and lunch Room.temperatureKeeper
     * to heat or cool room until it @reachTheTemperature()
     */
    public static void controlLoop() {

        while (!building.reachTheTemperature()) {
            System.out.println(building);
            building.checkTemperature();
            sleepOneSecond();
        }
//        System.out.println(building);
        System.out.println("Each room has reached its target temperature");
    }

    /**
     * every 5 seconds put a weather impact on building
     * @check building.weatherCondition()
     */
    public void weatherLoop() {
        while (true){
            building.weatherCondition();
            sleepFiveSecond();
        }
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(1000);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void sleepFiveSecond() {
        try {
            Thread.sleep(5000);  // default value 5000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
