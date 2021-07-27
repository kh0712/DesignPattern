package desingpattern.template;

public abstract class AbstractClass {


    public void templateMethod(){

        hook1();
        hook2();
    }

    protected abstract void hook1();
    protected abstract void hook2();
}
