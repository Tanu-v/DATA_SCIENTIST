
public class Else_if_and_switch_state {

    public static void main(String[] args) {

        //Switch 
        String var = "Tanu";
        switch (var) {
            case "Pankaj":
                System.out.println("You are going to get a job!");

                break;
            case "Trisha":
                System.out.println("You are going to be an adult!");

                break;
            case "Emma":
                System.out.println("You are experienced!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
        System.out.println("Thanks for using my java code!");

        /*  System.out.println("Enter your Age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi- experienced!");
        } else if (age > 36) {
            System.out.println("You are semi-semi-experienced!");
        } else {
            System.out.println("You are not experienced!");
        }
        if (age > 2) {
            System.out.println("You are not a baby!");
        }
         */
    }

}
