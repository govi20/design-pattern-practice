package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class Mocha implements CondimentDecorator {
    private static final double MOCHA_COST = 0.20;
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost () + MOCHA_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription () + ", Mocha";
    }
}
