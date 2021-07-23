package desingpattern.factory.concrete;

import desingpattern.factory.Type;
import desingpattern.factory.concrete.factory.LGFactory;
import desingpattern.factory.concrete.factory.SamsungFactory;
import desingpattern.factory.inter.Computer;

public class SuperFactory {

    public Computer createComputer(Type type){

        Computer computer = null;
        if(type == Type.LG){
            LGFactory lgFactory = new LGFactory();
            computer =  lgFactory.createComputer();
        }else if(type == Type.SAMSUNG){
            SamsungFactory samsungFactory = new SamsungFactory();
            computer = samsungFactory.createComputer();
        }

        return computer;
    };
}
