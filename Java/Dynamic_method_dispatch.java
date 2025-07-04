
class phone {

    public void showtime() {
        System.out.println("Time is 8am!");
    }

    public void on() {
        System.out.println("Turning on phone!");
    }
}

class smartphone extends phone {

    public void music() {
        System.out.println("Playing music.");
    }

    public void on() {
        System.out.println("Turning on smartphone!");
    }
}

public class Dynamic_method_dispatch {

    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone smobj = new smartphone();
        // obj.name();
        phone obj = new smartphone(); // it is allowed
        // smartphone smobj = new phone(); // not allowed
        obj.showtime();
        obj.on();
        // obj.music();  // error

    }

}
