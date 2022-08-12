package md.tekwill.pack14.hw.assignment5;
//5. One class with a method that has a parameter.
//When calling the method, it should be possible to pass "this" as parameter.
public class This5 {
    void methodParameter (This5 z){
        System.out.println("Zedul primit ca parametru 'this'." );
    }
    void assign(){
        methodParameter(this);
    }
}

