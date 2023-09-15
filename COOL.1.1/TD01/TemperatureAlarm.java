

public class TemperatureAlarm implements WheatherStationObs {
   

    public void update (Event e) {
       alarm(e.getName(), e.getTemperature());
     
    }
    	
	public void alarm(String sensorName, float temperature){
           
        if (temperature > 18) {

            System.out.print("ALERTE TEMPERATURE ELEVEE : STATION : " + sensorName + " " + temperature + " degrés ");
            System.out.println(" ");
          
        } else if (temperature < 4) {
            System.out.print("ALERTE : STATION BASSE : " + sensorName + " " + temperature + " degrés ");
            System.out.println(" ");
           
        }

	}
 
}