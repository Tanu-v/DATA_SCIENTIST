
public class try_exception {

    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Without try
        // int c = a / b;
        // System.out.println("The result is :" + c);
        // With try
        try {
            int c = a / b;
            System.out.println("The result is :" + c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("We failed to divide . Reason :");
            System.out.println(e);
        }
        System.out.println("End of the program .");

    }

}
