package Building;

public class BuildingController {
    private Building building;

    public BuildingController(Building building) {
        this.building = building;
    }

    public void controlLoop() {
        while (!building.reachTheTemperature()){
            System.out.println(building);
            building.checkTemperature();
            sleepOneSecond();
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

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void sleepFiveSecond() {
        try {
            Thread.sleep(5000);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
