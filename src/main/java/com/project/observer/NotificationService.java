package com.project.observer;


import java.util.ArrayList;
import java.util.List;



public class NotificationService extends PublisherImpl{

    public void event(){
        notifyObservers();
    }

}
