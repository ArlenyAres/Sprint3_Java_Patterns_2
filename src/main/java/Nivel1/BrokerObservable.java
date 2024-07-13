package Nivel1;

import java.util.Set;
import java.util.HashSet;

public class BrokerObservable implements Observable {

    private Set<Observer> observerSet = new HashSet<>();
    private double price;


    @Override
    public void addObserver(Observer observer) {
       observerSet.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update(price);
        }

       // observerSet.forEach(Observer::update);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
