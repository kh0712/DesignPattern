package desingpattern.state;

public class PowerOff implements PowerState{

    private volatile static PowerOff instance = null;
    private final StateDispatcher dispatcher;
    private PowerOff(StateDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public static PowerOff getInstance(StateDispatcher dispatcher){

        if(instance == null){
            synchronized (PowerOff.class){
                if(instance == null){
                    instance = new PowerOff(dispatcher);
                }
            }
        }

        return instance;
    }

    @Override
    public PowerState pushPowerButton() {
        System.out.println("to PowerSaving mode");
        return dispatcher.dispatch(this);
    }
}
