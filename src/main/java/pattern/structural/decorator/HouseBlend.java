package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class HouseBlend implements Beverage {


    @Override
    public double cost() {
        return 2.1;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
