package org.sevod.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        System.out.println(computer.volume);

        context.close();
    }
}
