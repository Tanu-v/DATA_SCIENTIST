
interface mycamera {

    void takesnap();

    void recordvideo();

    private void greet() {
        System.out.println("Good morning!");
    }

    default void recordin4k() {
        greet();
        System.out.println("Recording in 4k....");
    }
}

interface mywifi {

    String[] getnetworks();

    void connecttonetworks(String networks);
}

class mycellphone {

    void callnumber(int phonenumber) {
        System.out.println("Calling..." + phonenumber);
    }

    public void pickcall() {
        System.out.println("Connecting......");
    }
}

class mysmartphone extends mycellphone implements mywifi, mycamera {

    // public void recordin4k() {
    //     System.out.println("Taking snap and recording in 4k.");
    // }
    public void takesnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Recording video..");
    }

    public String[] getnetworks() {
        System.out.println("Getting list of networks...");
        String[] networklist = {"tnx", "pij", "yaqwme"};
        return networklist;
    }

    public void connecttonetworks(String networks) {
        System.out.println("Connecting to " + networks);
    }

    public void samplemeth() {
        System.out.println("meth");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        mycamera cam = new mysmartphone(); // This is a smartphon but , use it as camera
        // cam.getnetworks();   -> not allowed for good
        cam.recordvideo();
        cam.takesnap();
        cam.recordin4k();
        // cam.samplemeth(); -> will also throws an error  ,not allowed

        mysmartphone smrtp = new mysmartphone();
        smrtp.callnumber(234);
        smrtp.getnetworks();
        smrtp.recordvideo();
        smrtp.connecttonetworks("the");
    }

}
