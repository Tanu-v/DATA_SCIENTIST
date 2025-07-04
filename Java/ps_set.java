
abstract class pen {

    abstract void write();

    abstract void refill();
}

class fountainpen extends pen {

    void write() {
        System.out.println("Writting");
    }

    void refill() {
        System.out.println("Refill.....");
    }

    void changenib() {
        System.out.println("Changing the nib..");
    }
}

public class ps_set {

    public static void main(String[] args) {
        fountainpen pn = new fountainpen();
        pn.changenib();

    }

}
