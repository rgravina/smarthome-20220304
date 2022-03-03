package smarthome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeTest {
    @Test
    void wiring() {
        SmartHome smartHome = new SmartHome();
        assertNotNull(smartHome);
    }
}