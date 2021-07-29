package desingpattern.memento;

public class Information {

    private int intData;
    private String strData;
    private final double doubleData;

    public Information(int intData, String strData, double doubleData) {
        this.intData = intData;
        this.strData = strData;
        this.doubleData = doubleData;
    }

    public Memento toMemento(){
        return new Memento(intData, strData);
    }

    public void fromMemento(Memento memento){
        setIntData(memento.getIntData());
        setStrData(memento.getStrData());
    }

    public int getIntData() {
        return intData;
    }

    public String getStrData() {
        return strData;
    }

    public double getDoubleData() {
        return doubleData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    @Override
    public String toString() {
        return "Information{" +
                "intData=" + intData +
                ", strData='" + strData + '\'' +
                ", doubleData=" + doubleData +
                '}';
    }
}
