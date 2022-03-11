package smarthome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeTest {
    private SmartHome smartHome;

    @BeforeEach
    void setUp() {
        smartHome = new SmartHome();
    }

    @Test
    void whenSwitchIsOn_turnBulbOn() {
        BulbSpy bulb = new BulbSpy();
        Switch toggle = new AlwaysOnSwitchStub();

        smartHome.run(bulb, toggle);

        assertTrue(bulb.turnOnWasCalled());
    }
}