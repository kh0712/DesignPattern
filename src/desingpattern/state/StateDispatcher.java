package desingpattern.state;

public interface StateDispatcher {

    PowerState dispatch(PowerState state);
}
