
class Mythr extends Thread {

    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 5;
        System.out.println(" Thank you");
        // while(true){
        //     System.out.println("I am a thred..");
        // }
    }
}

public class Thread_constructor {

    public static void main(String[] args) {
        Mythr t = new Mythr("Tanu");
        Mythr t1 = new Mythr("Tfjdf");
        t1.start();
        t.start();
        System.out.println("The id of this thread is :" + t.getName());
        System.out.println("The id of this thread is :" + t.getId());
        System.out.println("The id of this thread is :" + t1.getName());
        System.out.println("The id of this thread is :" + t1.getId());
    }

}
