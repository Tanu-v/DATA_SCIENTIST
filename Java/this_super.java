
class Ekclass {

    int a;

    public int returnone() {
        return 1;
    }

    public Ekclass(int v) {
        this.a = v;

    }

    public int getv() {
        return a;
    }

}

class doclass extends Ekclass {

    public doclass(int c) {
        super(c);
        System.out.println("I am a constructor.");
    }

}

public class this_super {

    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        System.out.println(e.getv());
        doclass dc = new doclass(0);
    }

}
