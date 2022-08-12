package md.tekwill.pack14.hw.assignment4;
// 4. One class with three overloaded constructors using "this()".
// Use "this" to assign the passed parameters to class properties.
public class Over {
    int a;
    int b;
    int c;


    Over(int a){
        this.a = a;

    }
    Over(int a, int b){
        this(a);
        this.b = b;

    }
    Over(int a, int b, int c){
        this(a,b);
        this.c = c;

    }
}
class OverTest {
    public static void main(String[] args) {
        Over box = new Over(4);
        System.out.println(box.a);
        Over box1 = new Over(14,5);
        System.out.println(box1.a-box1.b);
        Over box2 = new Over(24,5,6);
        System.out.println(box2.a-box2.b*box2.c);
    }
}