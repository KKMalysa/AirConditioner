import Building.Building;
import Building.BuildingController;


public class Main {



    public static void main(String[] args) {
        Building building = new Building(4);

        BuildingController weatherController = new BuildingController(building);
        BuildingController controller = new BuildingController(building);


        controller.controlLoop();
        weatherController.weatherLoop();

    }


}
