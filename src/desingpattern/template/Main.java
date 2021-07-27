package desingpattern.template;

public class Main {

    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();

        AbstractClass template2 = new SecondConcreteClass();
        template2.templateMethod();
    }
}
