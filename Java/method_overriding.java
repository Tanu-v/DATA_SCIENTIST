
class A {

    public int a;

    public int tanu() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am  method 2 of class A");
    }
}

class B extends A {

    @Override

    public void meth2() { // override
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class method_overriding {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        b.meth3();
        b.meth2();
    }

}
