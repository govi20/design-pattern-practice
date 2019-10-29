package pattern.behavioral.observer;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 28-Oct-2019
 * Description: The subject and observers define the one-to-many relationship.
 * The observers are dependent on the subject such that when the subject’s state changes, the observers get notified.
 * Depending on the style of notification, the observer may also be updated with new values.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
