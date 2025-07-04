
class MyMainEmployee {  // class

    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public MyMainEmployee() {  // constructor
        id = 45;
        name = " Your-Name-Here!";
        // public MyMainEmployee(String myname, int myid) {  // constructor
        //     id = myid;
        //     name = myname;

    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        this.name = n;
    }

    public void setid(int i) {
        this.id = i;
    }

}

public class Constructors {

    public static void main(String[] args) {
        // MyMainEmployee tanu = new MyMainEmployee("Tanu Verma", 12);
        MyMainEmployee tanu = new MyMainEmployee();

        // tanu.setid(34);
        // tanu.setname("Tanu verma");
        System.out.println(tanu.getid());
        System.out.println(tanu.getname());
    }

}
