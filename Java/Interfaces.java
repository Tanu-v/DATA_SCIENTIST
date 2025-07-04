
interface bicycle {
    // all properties made in interfaces are final

    int a = 45;

    void applybreak(int decrement);

    void applyspeedup(int increment);
}

interface hornbicycle {

    void blowhornk3g();

    void blowhornmhn();
}

class avoncycle implements bicycle, hornbicycle {

    void blowhorn() {
        System.out.println("Peee pee poo poo");
    }

    public void blowhornk3g() {
        System.out.println("Kbhi khushi kbhi gum pee pee pee pee ....");
    }

    public void blowhornmhn() {
        System.out.println("Main hoon naa po po po po....");
    }

    public void applybreak(int decrement) {
        System.out.println("Applying break!");
    }

    public void applyspeedup(int increment) {
        System.out.println("Applying speedup!");
    }

}

public class Interfaces {

    public static void main(String[] args) {
        avoncycle avoncee = new avoncycle();
        avoncee.applybreak(1);

        // you can create properties in interfaces
        System.out.println(avoncee.a);
        // you can not modify properties in interfaces as they are final
        // avoncee.a = 454; error
        avoncee.blowhornk3g();
        avoncee.blowhornmhn();
    }

}
