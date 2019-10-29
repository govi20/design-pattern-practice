package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<> ();
    }

    public void registerObserver(Observer observer) {
        this.observers.add (observer);
    }

    public void notifyObservers() {
        this.observers.forEach (observer -> observer.update (getTemp (), getHumidity (), getPressure ()));
    }

    public void removeObserver(Observer observer) {
        this.observers.remove (observer);
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers ();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers ();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers ();
    }
}
