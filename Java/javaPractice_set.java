
class circle {

    public int radius;

    public circle(int r) {
        this.radius = r;
        System.out.println(" I am circle parameterized constructor");
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {

    public int height;

    public cylinder(int r, int h) {
        super(r);
        this.height = h;
        System.out.println(" I am cylinder parameterized constructor");
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class javaPractice_set {

    public static void main(String[] args) {
        circle objc = new circle(12);
        cylinder obj = new cylinder(12, 4);
    }

}
