package desingpattern.state;

public class Laptop {

    private PowerState state;

    public Laptop(){
        state = PowerOff.getInstance(CircleStateDispatcher.getInstance());
    }

    public void pushPowerButton(){
        state = state.pushPowerButton();
    }
}
