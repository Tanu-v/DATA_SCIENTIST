
interface DemoAno {

    // void meth1();
    void meth1(int a);

    // void meth2();
}

// class methFunc implements DemoAno {
//     @Override
//     public void meth1() {
//         System.out.println("I am meth1");
//     }
// }
// class anonydemo implements DemoAno{
//     public void display(){
//         System.out.println("Hello");
//     }
//     @Override
//     public void meth1(){
//       System.out.println("I am meth1");
//     }
//       @Override
//     public void meth2(){
//       System.out.println("I am meth2");
//     }
// }
public class lambda {

    public static void main(String[] args) {
        // anonydemo a = new anonydemo();
        // a.meth1();

        // DemoAno obj = new DemoAno() {
        //     @Override
        //     public void meth1() {
        //         System.out.println("I am meth1");
        //     }
        //     @Override
        //     public void meth2() {
        //         System.out.println("I am meth2");
        //     }
        // };
        // obj.meth1();
        // DemoAno d = new methFunc();
        // d.meth1();
        //  lambda 
        // DemoAno ob = () -> {
        //     System.out.println("I am method 1 from this lambda expression");
        // };
        DemoAno ob = (a) -> {
            System.out.println("I am method 1 from this lambda expression :  " + a);
        };
        ob.meth1(7);

    }

}
