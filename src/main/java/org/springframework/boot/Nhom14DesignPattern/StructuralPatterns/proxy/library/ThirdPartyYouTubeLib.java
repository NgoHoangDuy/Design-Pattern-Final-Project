package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.proxy.library;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
