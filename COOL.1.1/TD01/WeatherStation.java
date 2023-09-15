

/**
 * Represente une station meteo
 */
public class WeatherStation implements WheatherStationObs {
	private static int stationCounter = 0;
	private int number;
	
	public WeatherStation()
	{
		stationCounter++;
		number = stationCounter;
	}
	
	public void displayTemperature(String sensorName, float temperature){
		System.out.println("Station " + number + " - " + sensorName + " " + temperature + " degrés ");
	}

	public void update (Event e){
		displayTemperature(e.getName(), e.getTemperature());
	}

	
}
