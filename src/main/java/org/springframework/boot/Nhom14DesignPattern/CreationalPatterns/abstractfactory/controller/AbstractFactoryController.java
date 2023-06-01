package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.controller;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.GUIFactory;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.macos.MacOSFactory;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.windows.WindowsFactory;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.service.FactoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract_factory")
public class AbstractFactoryController {

    @GetMapping("/{os_name}")
    public ResponseEntity getShape(@PathVariable("os_name") String osName) {

        FactoryService factoryService;
        GUIFactory guiFactory;
        String osName1 = osName.toLowerCase();
        if (osName1.contains("mac")) {
            guiFactory = new MacOSFactory();
            factoryService = new FactoryService(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            factoryService = new FactoryService(guiFactory);
        }

        return new ResponseEntity(factoryService.businessLogic(), HttpStatus.OK);
    }
}
