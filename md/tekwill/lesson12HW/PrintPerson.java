package md.tekwill.lesson12HW;

public class PrintPerson {
    public static void main(String[] args) {



        long x = 0;

        while (x<3) {
            if (x == 0) {
                Person one = new Person();
                one.setId(x+1);
                one.setFirstName("Giorno");
                one.setLastName("Giovanna");
                one.printAll();

            }
            if (x == 1) {
                Person two = new Person();
                two.setId(x+1);
                two.setFirstName("Takeshi");
                two.setLastName("Kovacs");
                two.printAll();
            }
            if (x == 2) {
                Person three = new Person();
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