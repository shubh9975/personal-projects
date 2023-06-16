package com.calsoft;

//import static org.junit.Assert.assertEquals;

//import org.junit.Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
    @Test
    public void getMessage() {
        App app = new App();
        assertEquals("Default message is valid", app.getMessage(), "Hello World!");
    }
}
