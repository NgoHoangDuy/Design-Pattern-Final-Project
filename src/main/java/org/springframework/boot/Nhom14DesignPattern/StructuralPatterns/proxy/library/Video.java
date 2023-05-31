package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.proxy.library;

import lombok.Getter;

@Getter
public class Video {
    private String id;
    private String title;
    private String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }

}

