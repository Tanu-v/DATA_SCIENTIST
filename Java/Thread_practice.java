
class Mytrd1 extends Thread {

    public void run() {
        while (true) {
            System.out.println("Good Morning!");

        }

    }
}

class Mytrd2 extends Thread {

    public void run() {
        // while (true) {
        //     System.out.println("Welcome !");
        //     try {
        //         Thread.sleep(200);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }

        // }
    }
}

public class Thread_practice {

    public static void main(String[] args) {
        Mytrd1 ps = new Mytrd1();
        Mytrd2 ps1 = new Mytrd2();
        // ps.setPriority(6);
        // ps1.setPriority(9);
        System.out.println(ps.getPriority());
        System.out.println(ps1.getPriority());
        System.out.println(ps.getState());
        System.out.println(ps1.getState());
        System.out.println(Thread.currentThread().getState());
        // ps.start();
        // ps1.start();
    }
}
