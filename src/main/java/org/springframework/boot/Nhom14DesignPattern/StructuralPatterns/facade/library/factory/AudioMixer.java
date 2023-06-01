package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory;

import java.io.File;



public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio... " + result.toString());
        return new File("tmp");
    }
}
