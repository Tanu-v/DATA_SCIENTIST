
class base1 {

    public base1() {
        System.out.println("I am a constructor!");
    }

    public base1(int n) {
        System.out.println(" I am a base class overloaded constructor with value  :" + n);
    }

    public int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

}

class derived1 extends base1 {

    public derived1() {
        super(0); // if not written will print the base class 1st constructor
        System.out.println("I am a derived class constructor!");

    }

    public derived1(int n, int b) {
        super(n);
        System.out.println("I am a derived class overloadedd constructor with value :" + b);

    }
    int y;

    public int gety() {
        return y;
    }

    public void gety(int y) {
        this.y = y;
    }
}

class childofderived extends derived1 {

    public childofderived() {
        System.out.println("I am a child of derived constructor!");
    }

    public childofderived(int n, int b, int z) {
        super(n, b);
        System.out.println("I am the childofderived class overloaded custructor with value of z :" + z);
    }

}

public class Constructors_in_inheritence {

    public static void main(String[] args) {
        // base1 b = new base1();
        // derived1 d = new derived1();
        // derived1 d = new derived1(14, 91);
        childofderived cd = new childofderived();
        childofderived cd1 = new childofderived(13, 67, 89);

    }

}
