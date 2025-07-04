
public class Access_modifiers_getter_setter {

    static class memployee {  // Make inner class static so it can be used in static main method

        private int id;
        private String name;

        public void setname(String n) {
            name = n;
        }

        public String getname() {
            return name;
        }

        public int getid() {
            return id;
        }

        public void setid(int i) {
            id = i;
        }
    }

    public static void main(String[] args) {
        memployee tanu = new memployee();

        // Use setter to set the name
        tanu.setname("Tanu");

        // Use getter to retrieve and print the name
        System.out.println(tanu.getname());
    }
}
