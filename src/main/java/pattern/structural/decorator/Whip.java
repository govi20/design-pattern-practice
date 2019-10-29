package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class Whip implements CondimentDecorator {

    private static final double WHIP_COST = 0.11;
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost () + WHIP_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription () + ", Whip";
    }
}
