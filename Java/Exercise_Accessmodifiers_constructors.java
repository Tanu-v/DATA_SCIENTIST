
class Cylinder {

    private int radius;
    private int height;

    public int getradius() {
        return radius;
    }

    public int getheight() {
        return height;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public double surfacearea() {
        // return 2 * 3.142 * radius * (height + radius);
        return 2 * Math.PI * radius * (height + radius);
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;

    }

}

public class Exercise_Accessmodifiers_constructors {

    public static void main(String[] args) {
        // problem 1
        Cylinder cyl = new Cylinder(9, 12);
        // cyl.setradius(9);
        // cyl.setheight(12);
        int r = cyl.getradius();
        System.out.println(r);
        // problem 2
        System.out.println(cyl.surfacearea());
        System.out.println(cyl.Volume());

    }
}
