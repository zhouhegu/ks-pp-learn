package com.pp.design.service.observer.impl;

import com.pp.design.service.observer.Observer;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/6/1 00:09
 */
@Service("otherConcreteObserver")
public class OtherConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("This is OtherConcreteObserver update method");
    }
}
