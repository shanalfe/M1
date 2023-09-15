
import java.util.ArrayList;

/**
 * Represente un capteur de temperature.
 */
public class TemperatureSensor 
{
	private String name;
	private float temperature;
	private ArrayList<WheatherStationObs> observers;


	/**
	 * Constructeur
	 * @param name
	 */
	public TemperatureSensor(String name){
		this.name = name;
		this.observers = new ArrayList<WheatherStationObs>();
	}
	
	/*
	 * Getters et setters
	 */
	public float getTemperature(){
		return temperature;
	}

	public void setTemperature(float temperature){
		this.temperature = temperature;
		notifyTemperatureChange();
	}
	
	public void addObserver(WheatherStationObs o){
		observers.add((WheatherStationObs) o);
	}

	public void notifyTemperatureChange(){
		for (WheatherStationObs ws : observers) 
			ws.update(new Event(name, temperature));
	}

	
}
