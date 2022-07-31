package md.tekwill.acces1;

public class accesA {

    public void FundA(){
        defaultAA();
        defaultAB();
        defaultAC();
        specificAA();
    }

    void defaultAA (){
        System.out.println("Default AA");
    }
    public void defaultAB(){
        System.out.println("Default AB");
    }
    private void defaultAC(){
        System.out.println("Default AC");
    }
    private void specificAA(){
        System.out.println("Specific AA");
    }
}
