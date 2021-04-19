package Building;

public class BuildingController {
    private static Building building;

    public BuildingController(Building building) {
        this.building = building;
    }

    public static void controlLoop() {

            while (!building.reachTheTemperature()) {
                System.out.println(building);
                building.checkTemperature();
                sleepHalfSecond();
            }
            System.out.println(building);
            System.out.println("Each room has reached its target temperature");

    }

    public void weatherLoop() {
        while (true){
            building.weatherCondition();
            sleepFiveSecond();
        }

    }

    private static void sleepHalfSecond() {
        try {
            Thread.sleep(1000);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     public static void sleepFiveSecond() {
        try {
            Thread.sleep(9000);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
