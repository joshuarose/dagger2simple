package com.example.android.tutsplusdagger.model;

/**
 * Created by joshuarose on 7/10/15.
 */
public class Vehicle {
    private Motor motor;

    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
