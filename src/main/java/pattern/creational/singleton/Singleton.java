package pattern.creational.singleton;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 30-Oct-2019
 */
public class Singleton {
    public static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton ();
        }

        return singleton;
    }
}
