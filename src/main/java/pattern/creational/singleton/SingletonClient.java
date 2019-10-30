package pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 30-Oct-2019
 */
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance ();
        Singleton singleton2 = Singleton.getInstance ();
        System.out.println (singleton1 == singleton2);

        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance ();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance ();
        System.out.println (billPughSingleton1 == billPughSingleton2);
    }
}
