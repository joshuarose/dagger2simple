package com.example.android.tutsplusdagger.components;

import com.example.android.tutsplusdagger.model.Vehicle;
import com.example.android.tutsplusdagger.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by joshuarose on 7/10/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
