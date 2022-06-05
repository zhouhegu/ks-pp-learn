package com.pp.design.service.observer;

import com.pp.design.service.observer.impl.ConcreteObserver;
import com.pp.design.service.observer.impl.ConcreteSubject;
import com.pp.design.service.observer.impl.OtherConcreteObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/6/1 00:12
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        List<Observer> observers = new ArrayList<>();
        observers.add(new ConcreteObserver());
        observers.add(new OtherConcreteObserver());
        subject.addAllObservers(observers);
        subject.notifyObserver();
    }
}
