package com.project.observer;



public interface Publisher {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
}
