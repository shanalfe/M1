/**
 *  Thermometer.java
 */

public class Thermometer {
   
    private float temperature;

    public Thermometer(float initialTemperature) {
        this.temperature = initialTemperature;
    }
    
    public void increaseTemperature(float value){
            temperature += value;
            temperature += 0.1; // moins précis le thermomètre !
        }
    public void decreaseTemperature(float value){
            temperature -= value;
            temperature -= 0.1; // moins précis le thermomètre !
        }
    public float getTemperature() {
        return temperature;
    }

    
}
