
public class Hw7Stringrel {

    public static void main(String[] args) {
        // question1
        String name = "Tanu Verma";
        name = name.toLowerCase();
        System.out.println(name);

        // question2
        String str = " To Lower Case";
        System.out.println(str.replace(" ", "_"));

        // question3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Tanu");
        System.out.println(letter);

        // question4
        String mystr = " This string   contains double and tripple spaces";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("   "));

        // question5
        String myletter = "Dear Harry \n\t This java course is nice.\n\t Thanks!";
        System.out.println(myletter);

    }

}
