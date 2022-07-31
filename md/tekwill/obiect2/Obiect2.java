package md.tekwill.obiect1;

import md.tekwill.acces1.accesA;
import md.tekwill.acces2.accesB;
import md.tekwill.acces3.accesC;

public class Obiect2 {
    public void print(){
        accesA a = new accesA();
        System.out.println("Imprimare suplimentara pentru metoda publica ");
        a.defaultAB();
        System.out.println();
        accesB b = new accesB();
        System.out.println("Imprimare suplimentara pentru metoda publica ");
        b.defaultBB();
        System.out.println();
        accesC c = new accesC();
        System.out.println("Imprimare suplimentara pentru metoda publica ");
        c.defaultCB();
    }

}
