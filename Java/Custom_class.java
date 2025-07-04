
public class Custom_class {

    static class employee {

        int id;
        String name;
        int salary;

        public void printdetails() {
            System.out.println("My id is: " + id);
            System.out.println(" and My Name is: " + name);
        }

        public int getsalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        System.out.println("New custom class!");

        // Instantiate employee object
        employee tanu = new employee();

        // Setting properties
        tanu.id = 10;
        tanu.name = "Tanu";
        tanu.salary = 30;
        employee john = new employee();
        john.id = 3;
        john.name = "John yong";
        john.salary = 33;

        // Printing Attributes
        tanu.printdetails();
        john.printdetails();
        // System.out.println(tanu.id);
        // System.out.println(tanu.name);
        System.out.println(john.salary);
    }
}
