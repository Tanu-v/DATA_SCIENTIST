
public class operatorsprecedence {

    public static void main(Stringstd[] args) {
        //int a= 6*5-34/2;
        /*
         highest precedence goes to * and / they are then evaluated on the basis of left to right associvity
         = 30-34/2
         =30-17
         =13
         */
        // System.out.println(a);
        // int b = 60/5-34*2;
        /*
         
        = 12-34*2
        =12-68
        =-56
         */
        // System.out.println(b);
        int x = 6;
        int y = 1;
        int k = x * y / 2;
        System.out.println(k);
        int b = 1;
        int c = 4;
        int a = 5;
        //   int p = b*b-4*a*c/2*a; //-199
        int p = (b * b - 4 * a * c) / (2 * a);
        System.out.println(p);
    }

}
