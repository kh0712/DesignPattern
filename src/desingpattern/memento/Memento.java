package desingpattern.memento;

public class Memento {

    private final int intData;
    private final String strData;

    public Memento(int intData, String strData) {
        this.intData = intData;
        this.strData = strData;
    }

    public int getIntData() {
        return intData;
    }

    public String getStrData() {
        return strData;
    }
}
