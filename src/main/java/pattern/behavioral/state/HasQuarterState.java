package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class HasQuarterState implements State {

    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter( ) {
        System.out.println("Quarter is already inserted, can't insert another one!");
    }

    @Override
    public void ejectQuarter( ) {
        gumballMachine.setState(gumballMachine.noQuarterState);
        System.out.println("Quater ejected!");

    }

    @Override
    public void turnCrank( ) {
        this.gumballMachine.setState(gumballMachine.soldState);
        System.out.println("Crank turned...");
    }

    @Override
    public void dispense( ) {
        System.out.println("No gumball dispensed.");
    }
}
