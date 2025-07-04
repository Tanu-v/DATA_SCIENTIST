
class Mythr1 extends Thread {

    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        // System.out.println(" Thank you");
        while (i < 100) {
            System.out.println("I Thank you");
            i++;
        }
    }
}

class Mythr2 extends Thread {

    public Mythr2(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        // System.out.println(" Thank you");
        while (true) {
            System.out.println(" My thankyou ");
            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

public class Thread_methods {

    public static void main(String[] args) {
        Mythr1 t = new Mythr1("Tanu");
        Mythr2 t1 = new Mythr2("Tfjdf");
        // t1.start();
        // try {
        //     t1.join();

        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t.start();
    }

}
