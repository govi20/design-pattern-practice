package pattern.behavioral.state;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public interface State {
    void insertQuarter( );

    void ejectQuarter( );

    void turnCrank( );

    void dispense( );
}
