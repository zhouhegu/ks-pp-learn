package com.pp.design.service.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gupp
 * @date 2022/5/31 23:29
 * 发布者基类
 */
public abstract class Subject {

    /**
     * 观察者列表
     */
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addAllObservers(List<Observer> observerList) {
        observers.addAll(observerList);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
