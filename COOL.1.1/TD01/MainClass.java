

/**
 * Represente la classe principale du programme
 */
public class MainClass {

	public static void main(String[] args) {

		WeatherStation ws1 = new WeatherStation();
		WeatherStation ws2 = new WeatherStation();
		
		TemperatureSensor ts1 = new TemperatureSensor("Salon");
		TemperatureSensor ts2 = new TemperatureSensor("Cave");
		TemperatureSensor ts3 = new TemperatureSensor("Jardin");

		TemperatureAlarm ta = new TemperatureAlarm();
	
		
		ts1.addObserver(ws1);
		ts1.addObserver(ws2);
		ts2.addObserver(ws2);
		ts3.addObserver(ws2);
		
		ts1.addObserver(ta);
		ts2.addObserver(ta);
		ts3.addObserver(ta);


		System.out.println("Salon 20 degrés, Cave 14 degrés, Jardin 19 degrés");
		ts1.setTemperature(20);
		ts2.setTemperature(14);
		ts3.setTemperature(19);
		System.out.println("Jardin 13 degrés");
		ts3.setTemperature(13);
		System.out.println("Salon 19 degrés");
		ts1.setTemperature(19);	
			
	}
}
