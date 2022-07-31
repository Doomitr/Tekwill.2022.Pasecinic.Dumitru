package md.tekwill;

import md.tekwill.bonus.PrivateProp;
import md.tekwill.obiect1.Obiect1;
import md.tekwill.obiect1.Obiect2;

public class Publisher {
    public static void main(String[] args) {
        Obiect1 o = new Obiect1();
        o.print();
        Obiect2 o2 = new Obiect2();
        o2.print();

        PrivateProp roth = new PrivateProp();
        roth.setBook("Cronicile ucigasului de Regi");
        roth.setAuthor("Patrick Rothfuss");
        roth.setPages(2048L);
        System.out.println();
        System.out.println("Exercitiu bonus:");
        roth.execute();
    }

}
