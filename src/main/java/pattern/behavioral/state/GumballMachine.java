package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class GumballMachine {
    SoldState soldState;
    NoQuarterState noQuarterState;
    SoldOutState soldOutState;
    HasQuarterState hasQuarterState;
    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        this.count = numberGumballs;

        if( numberGumballs > 0 )
            state = noQuarterState;
        else
            state = soldOutState;
    }

    public void insertQuater( ) {
        state.insertQuarter();
    }

    public void ejectQuater( ) {
        state.ejectQuarter();
    }

    public void turnCrank( ) {
        state.turnCrank();
    }

    public void dispense( ) {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void release( ) {
        this.count--;
    }

    public int getCount( ) {
        return this.count;
    }
}
