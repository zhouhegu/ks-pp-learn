package com.pp.design.service.observer.impl;

import com.pp.design.service.observer.Observer;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/31 23:57
 */
@Service("concreteObserver")
public class ConcreteObserver extends Observer {

    @Override
    public void update() {
        System.out.println("This is ConcreteObserver update method");
    }
}
