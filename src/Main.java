import Building.Building;
import Building.BuildingController;


public class Main {



    public static void main(String[] args)  {
        Building building = new Building(4);

        Thread buildingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("buildingThread has been started ++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                BuildingController buildingController = new BuildingController(building);
                while(true){
                    buildingController.controlLoop();
                }
            }
        });
        buildingThread.start();

        Thread weatherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("weatherThread has been started --------------------------------------------------------");
                BuildingController weatherController = new BuildingController(building);
                weatherController.weatherLoop();
            }
        });
        weatherThread.start();



    }


}
