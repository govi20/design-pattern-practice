package pattern.behavioral.observer;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class WeatherStationClient {

    public static void main(String[] args) {

        // create Subject/Observable
        WeatherData weatherData = new WeatherData ();

        // create observer
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay ();

        // register observer
        weatherData.registerObserver (currentConditionDisplay);

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Enter current temperature: ");
        float temp = scanner.nextFloat ();

        System.out.println ("Enter current humidity: ");
        float humidity = scanner.nextFloat ();

        System.out.println ("Enter current pressure: ");
        float pressure = scanner.nextFloat ();

        // update subject
        weatherData.setHumidity (humidity);
        weatherData.setPressure (pressure);
        weatherData.setTemp (temp);
    }
}
