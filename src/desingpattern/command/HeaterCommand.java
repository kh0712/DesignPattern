package desingpattern.command;

public class HeaterCommand implements Command{

    private Heater heater;

    public HeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void run() {
        this.heater.powerOn();
    }
}
