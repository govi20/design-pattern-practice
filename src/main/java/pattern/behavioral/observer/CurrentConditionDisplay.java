package pattern.behavioral.observer;

import com.sun.prism.PresentableState;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class CurrentConditionDisplay implements DisplayElement, Observer{

    private float temp, humidity, pressure;

    @Override
    public void display() {
        System.out.println ("From CurrentDisplay => Temperature: "+ getTemp () + " Humidity: " + getHumidity ()+" Pressure: "+ getPressure ());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        setHumidity (humidity);
        setPressure (pressure);
        setTemp (temp);
        display ();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
