package desingpattern.state;

public class PowerSaving implements PowerState {

    private volatile static PowerSaving instance = null;
    private final StateDispatcher dispatcher;

    public PowerSaving(StateDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public PowerState pushPowerButton() {
        System.out.println("to PowerOn mode");
        return dispatcher.dispatch(this);
    }

    public static PowerSaving getInstance(StateDispatcher dispatcher) {
        if(instance == null){
            synchronized (PowerSaving.class){
                if(instance == null){
                    instance = new PowerSaving(dispatcher);
                }
            }
        }

        return instance;
    }
}
