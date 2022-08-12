package md.tekwill.pack14.hw.assignment3;
// 3. One class with three overloaded constructors.Use "this" to assign the passed parameters to class properties.
public class OverloadConstructor {
    int a;
    int b;
    int c;

    OverloadConstructor(int a){
        this.a = a;
        System.out.println(a);
    }
    OverloadConstructor(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println (a-b);
    }
    OverloadConstructor(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println (a-b*c);
    }
}
class OverloadThisTest {
    public static void main(String[] args) {
        OverloadConstructor o = new OverloadConstructor(1);
        OverloadConstructor q = new OverloadConstructor(1,3);
        OverloadConstructor p = new OverloadConstructor(1,3,9);
    }
}