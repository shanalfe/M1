public class Event {

    private float temperature;
    private String name;

    //Constructeur
    public Event(String name, float temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }
    
}
