import Building.Building;
import Building.BuildingController;


public class Main {

    public static void main(String[] args) {
        Building building = new Building(4);

        /**
         * @error - sometimes it lags, and don't wait these 1 sec [ @check Building.BuildingController#controlLoop() ]
         * and sends " Each room has reached its target temperature " many, many times before it starts to work correctly again.
         */
        Thread buildingThread = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println("buildingThread has been started ");
                BuildingController buildingController = new BuildingController(building);
                while(true){
                    buildingController.controlLoop();
                }
            }
        });
        buildingThread.start();

        Thread weatherThread = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println("weatherThread has been started ");
                BuildingController weatherController = new BuildingController(building);
                weatherController.weatherLoop();
            }
        });
        weatherThread.start();
    }

}
