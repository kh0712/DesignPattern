package desingpattern.singleton;

public class BasicSingleton {

    private BasicSingleton(){}

    private static BasicSingleton instance = new BasicSingleton();

    public BasicSingleton getInstance(){
        return instance;
    }

}
