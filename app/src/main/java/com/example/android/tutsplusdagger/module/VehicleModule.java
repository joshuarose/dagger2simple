package com.example.android.tutsplusdagger.module;

import com.example.android.tutsplusdagger.model.Motor;
import com.example.android.tutsplusdagger.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joshuarose on 7/10/15.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        Motor motor = new Motor();
        motor.accelerate(25);
        return motor;
    }

    @Provides @Singleton
    Vehicle provideVehicle(Motor motor){
        return new Vehicle(motor);
    }
}
