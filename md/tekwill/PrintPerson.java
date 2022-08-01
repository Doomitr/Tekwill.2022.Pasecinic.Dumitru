package md.tekwill;

import md.tekwill.lesson12hw.Person;

public class PrintPerson {
    public static void main(String[] args) {
        long x = 0;
        long y = Person.getId();
        while (x<1000000) {
            ++y;
            if (x == 0) {
                Person one = new Person();
                Person.setId(y);
                one.setFirstName("Giorno");
                one.setLastName("Giovanna");
                one.printAll();
            }
            if (x == 1) {
                Person two = new Person();
                two.setId(y);
                two.setFirstName("Takeshi");
                two.setLastName("Kovacs");
                two.printAll();
            }
            if (x == 2) {
                Person three = new Person();
                three.setId(y);
                three.setFirstName("Federico");
                three.setLastName("Fellini");
                three.printAll();
            }
            if (x==3){
                Person four = new Person();
                Person.setId(y);
                four.printAll();
            }
            if (x==4){
                Person five = new Person();
                Person.setId(y);
                five.printAll();
            }
            x=x+1;
        }

        System.out.println();
        System.out.println("IDul final este " + Person.getId());
    }
}