package pattern.structural.command.light;

import pattern.structural.command.Command;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute( ) {
        light.on();
    }

    @Override
    public void undo( ) {
        light.off();
    }
}
