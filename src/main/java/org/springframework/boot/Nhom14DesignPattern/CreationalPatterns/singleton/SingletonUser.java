package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonUser {

    private Singleton singleton;

    @Autowired
    public SingletonUser(Singleton singleton) {
        this.singleton = singleton;
    }

    public void useSingleton() {
        singleton.showMessage();
    }
}

