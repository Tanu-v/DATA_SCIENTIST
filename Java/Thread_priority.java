
class Mythr1 extends Thread {

    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 5;
        while (true) {
            System.out.println(" Thank you  " + this.getName());
        }
    }
}

public class Thread_priority {

    public static void main(String[] args) {
        Mythr1 t = new Mythr1("Tanu");
        Mythr1 t1 = new Mythr1("Tanu1");
        Mythr1 t2 = new Mythr1("Tanu2");
        Mythr1 t3 = new Mythr1("Tanu3");
        Mythr1 t4 = new Mythr1("Tanu4");
        Mythr1 t5 = new Mythr1("Tanu5 (Most important! )");
        t5.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        // t1.start();
        // t.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();

    }

}
