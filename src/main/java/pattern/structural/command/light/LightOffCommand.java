package pattern.structural.command.light;

import pattern.structural.command.Command;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class LightOffCommand implements Command { // the invoker class

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute( ) {
        this.light.off();
    }

    @Override
    public void undo( ) {
        this.light.on();
    }
}
