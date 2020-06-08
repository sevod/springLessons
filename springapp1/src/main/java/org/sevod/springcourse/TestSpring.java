package org.sevod.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpecialMusic specialMusic = context.getBean("specialMusic", SpecialMusic.class);
        System.out.println(specialMusic.getSong());
        System.out.println(specialMusic == context.getBean("specialMusic", SpecialMusic.class));


//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
//        //Music music = context.getBean("musicBean", Music.class);
//        //MusicPlayer musicPlayer = new MusicPlayer((music));
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        //System.out.println(music.getSong());
//
//
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
