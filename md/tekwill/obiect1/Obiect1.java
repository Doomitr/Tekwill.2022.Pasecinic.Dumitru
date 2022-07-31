package md.tekwill.obiect1;

import md.tekwill.acces1.accesA;
import md.tekwill.acces2.accesB;
import md.tekwill.acces3.accesC;

public class Obiect1 {
    public void print(){
        accesA a = new accesA();
        System.out.println("Clasa accessA, cu doua metode private chemate in metoda publica accessA, apoi in clasa Obiect1, apoi in clasa Publisher ");
        a.FundA();
        System.out.println();
        accesB b = new accesB();
        System.out.println("Clasa accessB");
        b.FundB();
        System.out.println();
        accesC c = new accesC();
        System.out.println("Clasa accessC");
        c.FundC();
        System.out.println();
    }

}
