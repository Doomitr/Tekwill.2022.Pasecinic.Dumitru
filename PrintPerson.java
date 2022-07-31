public class PrintPerson {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        long x = 0;

        while (x<3) {
            if (x == 0) {
                one.setId(x+1);
                one.setFirstName("Giorno");
                one.setLastName("Giovanna");
                one.printAll();

            }
            if (x == 1) {
                two.setId(x+1);
                two.setFirstName("Takeshi");
                two.setLastName("Kovacs");
                two.printAll();
            }
            if (x == 2) {
                three.setId(x+1);
                three.setFirstName("Federico");
                three.setLastName("Fellini");
                three.printAll();
            }
            x=x+1;
        }

        System.out.println();
        System.out.println("IDul final este " + x);
    }
}