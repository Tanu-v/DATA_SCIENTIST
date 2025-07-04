
class base {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i'm setting the x now!");
        this.x = x;
    }

    public void printme() {
        System.out.println("I am a constructor.");
    }
}

class derived extends base {

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Inheritence {

    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
        b.setX(3);
        // b.setY(7);    // no y in base class
        System.out.println(b.getX());
        // System.out.println(b.getY());  
        d.setY(8);
        d.setX(3);
        System.out.println(d.getX());
    }

}
