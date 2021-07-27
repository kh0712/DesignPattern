package desingpattern.template;

public class ConcreteClass extends AbstractClass{
    @Override
    protected void hook1() {
        System.out.println("Hook1 method");
    }

    @Override
    protected void hook2() {
        System.out.println("Hook2 method");
    }
}
