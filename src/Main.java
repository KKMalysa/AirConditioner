import Building.Building;
import Building.BuildingController;


public class Main {

    public static void main(String[] args) {
        Building building = new Building(4);
        BuildingController weatherController = new BuildingController(building);
        weatherController.weatherLoop();

        //to by można w sumie bez obserwatora zrobić: while(true), sprawdz temperature, jak current!=target, to uruchom controlLoop()
        //i chyba tak to zrobię, bo ten obserwator to przerost formy nad treścią, ale to już jutro
        BuildingController buildingController = new BuildingController(building);
        buildingController.controlLoop();
    }
}
