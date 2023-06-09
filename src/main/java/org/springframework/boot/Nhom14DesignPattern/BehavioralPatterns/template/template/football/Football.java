package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.template.template.football;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.template.template.Game;
import org.springframework.stereotype.Component;

@Component
@Qualifier("football")
public class Football extends Game {
    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
