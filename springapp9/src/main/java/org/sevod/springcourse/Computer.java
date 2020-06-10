package org.sevod.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    @Value("${musicPlayer.volume}")
    public int volume;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", playMusic=" + musicPlayer.playMusic() +
                '}';
    }
}
