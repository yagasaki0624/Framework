package com.example.demo.domain;

public class Car {

    private int speed;
    private String bodyColor;

    public Car(int speed, String bodyColor){
        this.speed = speed;
        this.bodyColor = bodyColor;
    }

    public Car(){     
    }
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getBodyColor() {
        return bodyColor;
    }
    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

}
