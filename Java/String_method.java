
public class String_method {

    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lscase = name.toLowerCase();
        System.out.println(lscase);
        String upcase = name.toLowerCase();
        System.out.println(upcase);
        String nontrimString = "    Harry    ";
        System.out.println(nontrimString);
        String trimString = nontrimString.trim();
        System.out.println(trimString);
        System.out.println(name.substring(3));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 4));
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "ier"));
        System.out.println(name.replace("r", "ier"));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf(3));
        String modifiedName = "Harrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 5));
        System.out.println(name.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry", 7));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("haRrY"));
        System.out.println("I am Tanu \n am I?");
        System.out.println("I am Tanu \\ am I?");
        System.out.println("I am Tanu \t am I?");

    }

}
