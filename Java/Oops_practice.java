
public class Oops_practice {

    // problem 2
    static class cellphone {

        public void ring() {
            System.out.println("Ringing....");
        }

        public void vibrate() {
            System.out.println("Vibrating....");
        }

        public void callfriend() {
            System.out.println("Calling pankaj.....");
        }
    }
    // problem 1

    static class employee1 {

        int salary;
        String name;

        public int getsalary() {
            return salary;
        }

        public String getname() {
            return name;
        }

        public void setname(String n) {
            name = n;
        }

    }
    // problem 3

    static class square {

        int side;

        public int area() {
            return side * side;
        }

        public int perimeter() {
            return 4 * side;
        }
    }

    // problem 4 
    static class rectangle {

        int length;
        int width;

        public int area() {
            return length * width;
        }

        public int perimeter() {
            return 2 * (length + width);
        }
    }

    // problem 5
    static class timmy {

        public void run() {
            System.out.println("Running from the enemy!!!");
        }

        public void fire() {
            System.out.println(" Firing on the enemy!");

        }

        public void hit() {
            System.out.println(" HItting the enemy!!!");
        }
    }

    // problem 6
    static class circle {

        float r;
        float pi = 3.14f;

        public float area() {
            return pi * r * r;
        }

        public float perimeter() {
            return 2 * pi * r;
        }

    }

    public static void main(String[] args) {
        // problem 1
        employee1 tanu = new employee1();
        tanu.setname("Tanu Verma");
        tanu.salary = 233;
        System.out.println(tanu.getname());
        System.out.println(tanu.getsalary());
        // problem 2
        cellphone asus = new cellphone();
        asus.ring();
        asus.callfriend();
        asus.vibrate();

        // prooblem 3 
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // problem 4 
        rectangle rct = new rectangle();
        rct.length = 20;
        rct.width = 50;
        System.out.println(rct.area());
        System.out.println(rct.perimeter());

        // problem 5 
        timmy player = new timmy();
        player.fire();
        player.hit();
        player.run();

        // problem 6
        circle cr = new circle();
        cr.r = 8.9f;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());

    }

}
