package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter( ) {
        System.out.println("You inserted a quater");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectQuarter( ) {
        throw new IllegalStateException("You haven't inserted a quater!");
    }

    @Override
    public void turnCrank( ) {
        throw new IllegalStateException("You haven't inserted a coin!");
    }

    @Override
    public void dispense( ) {
        throw new IllegalStateException("You haven't inserted a coin!");
    }
}
