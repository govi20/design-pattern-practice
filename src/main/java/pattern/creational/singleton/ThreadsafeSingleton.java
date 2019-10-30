package pattern.creational.singleton;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 30-Oct-2019
 */
public class ThreadsafeSingleton {
    public static ThreadsafeSingleton singleton;

    private ThreadsafeSingleton() {

    }

    /*
    *  Double checked locking.
    *  First if condition is outside the synchronized block to improve performance. if object is already created, thread will not get blocked.
    */
    public static ThreadsafeSingleton getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new ThreadsafeSingleton ();
                }
            }
        }
        return singleton;
    }
}
