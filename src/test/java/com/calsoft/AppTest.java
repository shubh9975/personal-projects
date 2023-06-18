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
        pickup_time = app.getPickupTimeInSec();
        is_pickup_decent = false;
        if (pickup_time > 10) is_pickup_decent = true;
        assertEquals("Default message is valid", app.getPickupTimeInSec(), "Hello World!");
    }
}
