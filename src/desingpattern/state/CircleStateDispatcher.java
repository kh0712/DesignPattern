package desingpattern.state;

public class CircleStateDispatcher implements StateDispatcher{

    private static volatile CircleStateDispatcher instance = null;

    private CircleStateDispatcher(){}

    public static CircleStateDispatcher getInstance() {
        if(instance == null){
            synchronized (CircleStateDispatcher.class){
                if(instance == null){
                    instance = new CircleStateDispatcher();
                }
            }
        }

        return instance;
    }


    @Override
    public PowerState dispatch(PowerState state) {
        PowerState nextState = null;

        if(state instanceof PowerOff){
            nextState = PowerSaving.getInstance(this);
        } else if(state instanceof PowerSaving){
            nextState = PowerOn.getInstance(this);
        } else{
            nextState = PowerOff.getInstance(this);
        }
        return nextState;
    }
}
