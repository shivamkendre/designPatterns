package com.project.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class PublisherImpl implements Publisher {
    List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.notifyMe());
    }
}
