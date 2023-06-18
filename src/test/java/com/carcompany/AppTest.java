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
        if (pickup_time < 10) is_pickup_decent = true;
        assertEquals("Picup time is: " + pickup_time, is_pickup_decent, true);
    }

    @Test
    public void getCoolingTimeInMin() { 
    //Co pilot generated this test case    
        App app = new App();
        int cooling_time = app.getCoolingTimeInMin();
        boolean is_cooling_decent = false;
        if (cooling_time < 5) is_cooling_decent = true;
        assertEquals("Cooling time is: " + cooling_time, is_cooling_decent, true);
    }

    @Test
    public void getSoundSystemClarityByFreqency() {
    //Co pilot generated this test case    
        App app = new App();
        int sound_system_clarity_frequency = app.getSoundSystemClarityByFreqency();
        boolean is_sound_system_clarity_decent = false;
        if (sound_system_clarity_frequency > 50) is_sound_system_clarity_decent = true;
        assertEquals("Sound system clarity is: " + sound_system_clarity_frequency, is_sound_system_clarity_decent, true);
    }
}
