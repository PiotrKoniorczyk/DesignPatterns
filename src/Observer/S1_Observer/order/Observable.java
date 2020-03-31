package Observer.S1_Observer.order;

import Observer.S1_Observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifiyObserver();
}
