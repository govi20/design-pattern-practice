package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter( ) {
        throw new IllegalStateException("Quarter is not inserted!!");
    }

    @Override
    public void ejectQuarter( ) {
        throw new IllegalStateException("Quarter is not inserted!!");
    }

    @Override
    public void turnCrank( ) {
        throw new IllegalStateException("Quarter is not inserted!!");
    }

    @Override
    public void dispense( ) {
        throw new IllegalStateException("Quarter is not inserted!!");
    }
}
