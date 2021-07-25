package desingpattern.adapter;

public class AnalogAdapter implements DigitalPlayer{

    private AnalogPlayer analogPlayer;

    public AnalogAdapter(AnalogPlayer analogPlayer) {
        this.analogPlayer = analogPlayer;
    }

    @Override
    public void touchScreen(String name) {
        analogPlayer.insertCD(name);
    }
}
