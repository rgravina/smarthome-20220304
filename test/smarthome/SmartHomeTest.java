package smarthome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmartHomeTest {
    private SmartHome smartHome;

    @BeforeEach
    void setUp() {
        smartHome = new SmartHome();
    }

    @Test
    void whenSwitchIsOn_turnBulbOn() {
        BulbMock bulb = new BulbMock();
        Switch toggle = new AlwaysOnSwitchStub();

        smartHome.run(bulb, toggle);

        bulb.switchCorrectlyTurnedOn();
    }

    @Test
    void whenSwitchIsOff_turnBulbOff() {
        BulbMock bulb = new BulbMock();
        Switch toggle = new AlwaysOffSwitchStub();

        smartHome.run(bulb, toggle);

        bulb.switchCorrectlyTurnedOff();
    }
}