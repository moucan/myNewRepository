package mc.Demo02;

public class CurrentConditionsDisplay implements Observer,Dispalyment{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public void CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        System.out.println("test");
    }
}
