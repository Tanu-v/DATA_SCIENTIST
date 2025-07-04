
abstract class parent2 {

    public parent2() {
        System.out.println("I am base2 constructor.");
    }

    public void sayhello() {
        System.out.println("Hello!");
    }

    abstract public void greet();

    abstract public void greet2();
}

class child2 extends parent2 {

    @Override
    public void greet() {
        System.out.println("Good morning everyone!");
    }

    public void greet2() {
        System.out.println("Good afternoon!");
    }
}

abstract class child3 extends parent2 {

    public void th() {
        System.out.println("I am good.");
    }
}

public class Abstract {

    public static void main(String[] args) {
        child2 ch2 = new child2();
        // child3 ch3 = new child3();  // abstract class can not have an object
        // parent2 pt = new parent2();     // abstract class can not have an object

    }

}
