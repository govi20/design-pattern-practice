package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class GumballClient {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        // gumballMachine.insertQuater();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

    }
}
