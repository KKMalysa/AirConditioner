import Building.Building;
import Building.BuildingController;


public class Main {

    public static void main(String[] args) {
        Building building = new Building(4);
        BuildingController buildingController = new BuildingController(building);
        buildingController.controlLoop();
        BuildingController weatherController = new BuildingController(building);
        weatherController.weatherLoop();
    }
}
