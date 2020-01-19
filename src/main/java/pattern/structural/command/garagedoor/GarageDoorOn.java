package pattern.structural.command.garagedoor;

import pattern.structural.command.Command;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class GarageDoorOn implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorOn(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    // encapsulating the method calls.
    @Override
    public void execute( ) {
        this.garageDoor.up();
        this.garageDoor.lightOn();
    }

    @Override
    public void undo( ) {
        this.garageDoor.lightOff();
        this.garageDoor.down();
    }
}
