package pattern.structural.command.garagedoor;

import pattern.structural.command.Command;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class GarageDoorOff implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorOff(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute( ) {
        garageDoor.lightOff();
        garageDoor.down();
    }

    @Override
    public void undo( ) {
        garageDoor.lightOn();
        garageDoor.up();
    }
}
