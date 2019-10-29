package pattern.structural.decorator;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Beverage espresso = new Espresso ();
        espresso = new Mocha (espresso);
        espresso = new Whip (espresso);
        System.out.println ("Espresso Description => " + espresso.getDescription ());
        System.out.println ("Espresso Cost => " + espresso.cost ());


        Beverage houseBlend = new HouseBlend ();
        houseBlend = new Mocha (houseBlend);
        houseBlend = new Whip (houseBlend);
        houseBlend = new Soya (houseBlend);

        System.out.println ("House Blend Description => " + houseBlend.getDescription ());
        System.out.println ("House Blend Cost => " + houseBlend.cost ());
    }
}
