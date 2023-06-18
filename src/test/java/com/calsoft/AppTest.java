package com.calsoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void getMessage() {
        App app = new App();
        assertEquals("Default message is valid", app.getMessage(), "Hello World!");
    }
    
    @Test
    public void getPickupTimeInSec() {
        App app = new App();
        int pickup_time = app.getPickupTimeInSec();
        boolean is_pickup_decent = false;
        if (pickup_time > 10) is_pickup_decent = true;
        assertEquals("Picup time is: " + pickup_time, is_pickup_decent, true);
    }
}
