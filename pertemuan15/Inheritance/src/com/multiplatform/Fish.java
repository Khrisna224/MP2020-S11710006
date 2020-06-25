package com.multiplatform;

public class Fish extends Animal{
    private eyes;
    private int fins;

    public Fish(String name, int height, int eyes, int fins){
        super(name, body:1, brain:1, height);
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    public int getEyes(){
        return eyes;
    }

}
