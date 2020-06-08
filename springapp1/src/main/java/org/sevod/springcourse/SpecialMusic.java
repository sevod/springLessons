package org.sevod.springcourse;

public class SpecialMusic implements Music {
    private SpecialMusic(){
        System.out.println("Private");
    } //запретили использование конструктора

    public static SpecialMusic getSpecialMusic(){
        System.out.println("factory-method");
        return new SpecialMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Special music";
    }
}
