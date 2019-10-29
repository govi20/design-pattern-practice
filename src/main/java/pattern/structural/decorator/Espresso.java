package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class Espresso implements Beverage {

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
