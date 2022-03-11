package smarthome;

public class AlwaysOffSwitchStub implements Switch {
    @Override
    public boolean isOn() {
        return false;
    }
}
