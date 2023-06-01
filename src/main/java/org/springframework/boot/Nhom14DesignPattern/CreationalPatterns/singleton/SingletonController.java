package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {
    private Singleton mySingleton;

    @Autowired
    public SingletonController(Singleton mySingleton) {
        this.mySingleton = mySingleton;
    }

    @GetMapping("/singleton")
    public String getSingletonData() {
        String data = mySingleton.getData();
        return data;
    }

    @PostMapping("/singleton")
    public String setSingletonData(@RequestBody String newData) {
        mySingleton.setData(newData);
        return "Data updated successfully";
    }
}
