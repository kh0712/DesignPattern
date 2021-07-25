package desingpattern.singleton;

public class BasicSingleton {

    private BasicSingleton(){}

    private static BasicSingleton instance = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return instance;
    }

}
