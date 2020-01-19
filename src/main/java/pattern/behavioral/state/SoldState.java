package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class SoldState implements State {

    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter( ) {
        System.out.println("Please wait, we are giving you a gumball.");
    }

    @Override
    public void ejectQuarter( ) {
        System.out.println("Crank is already turned, can't eject the coin now.");
    }

    @Override
    public void turnCrank( ) {
        System.out.println("Crank is already turned. Wait");
    }

    @Override
    public void dispense( ) {
        gumballMachine.release();
        if( gumballMachine.getCount() == 0 ) {
            System.out.println("Machine doesn't have any Gumball left");
            gumballMachine.setState(gumballMachine.soldOutState);
        } else {
            gumballMachine.setState(gumballMachine.noQuarterState);
            System.out.println("Gumball dispensed, Please collect!");
        }

    }
}
