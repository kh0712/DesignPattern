package desingpattern.state;

public class PowerOn implements PowerState {

    private volatile static PowerOn instance = null;
    private final StateDispatcher dispatcher;

    private PowerOn(StateDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public PowerState pushPowerButton() {
        System.out.println("to PowerOff mode");
        return dispatcher.dispatch(this);
    }

    public static PowerOn getInstance(StateDispatcher dispatcher) {
        if(instance == null){
            synchronized (PowerOn.class){
                if(instance == null){
                    instance = new PowerOn(dispatcher);
                }
            }
        }
        return instance;
    }

}
