package md.tekwill.pack14.hw.assignment1;

// 1. One class with two or three methods. In the first method call the second and third method with "this" keyword.

public class ThisMethod {
    void one(){
        System.out.println("Method One");
        this.two();
        this.three();
    }
    void two(){
        System.out.println("Method Two");
    }
    void three(){
        System.out.println("Method Three");
    }
}
 class TestThisMethod{
     public static void main(String[] args) {
         ThisMethod obj = new ThisMethod();
         obj.one();
     }
}
