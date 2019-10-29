package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class Soya implements CondimentDecorator {
    private static final double SOYA_COST = .25;
    private final Beverage beverage;

    public Soya(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost () + SOYA_COST;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription () + ", Soya";
    }
}
