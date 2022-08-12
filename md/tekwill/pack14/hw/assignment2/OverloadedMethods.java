package md.tekwill.pack14.hw.assignment2;

// 2. One class with 3 oveloaded methods.

public class OverloadedMethods {
    static int math (int a){return a;}
    static int math (int a, int b){return a-b;}
    static int math (int a, int b, int c){return a-b*c;}
}
class OverloadedMethodsTest{
    public static void main(String[] args) {
        System.out.println(OverloadedMethods.math(8));
        System.out.println(OverloadedMethods.math(18,8));
        System.out.println(OverloadedMethods.math(28,2,8));
    }
}
