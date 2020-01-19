package pattern.structural.command.garagedoor;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 03-Nov-2019
 */
public class GarageDoor { // receiver class

    public void up( ) {
        System.out.println("Garage Door UP");
    }

    public void down( ) {
        System.out.println("Garage Door DOWN");
    }

    public void lightOn( ) {
        System.out.println("Garage Door: Light ON");
    }

    public void lightOff( ) {
        System.out.println("Garage Door: Light OFF");
    }

}
