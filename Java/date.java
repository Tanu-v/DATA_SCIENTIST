
public class date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);   // give years since 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 + " days");
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 7 + " weeks");
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 30 + " months");
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365 + " years");
    }

}
