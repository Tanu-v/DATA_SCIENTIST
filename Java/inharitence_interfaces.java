
interface smpl_intrfc {

    void meth1();

    void meth2();
}

interface chldsmpl_intrfc extends smpl_intrfc {

    void meth3();

    void meth4();

}

class mysmplintrfc implements chldsmpl_intrfc {

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth1() {
        System.out.println("meth1");
    }
}

public class inharitence_interfaces {

    public static void main(String[] args) {

    }

}
