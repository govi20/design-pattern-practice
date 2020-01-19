package pattern.structural.command.light;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class Light { // receiver class

    private boolean status;

    public void on( ) {
        this.status = true;
    }

    public void off( ) {
        this.status = false;
    }
}
