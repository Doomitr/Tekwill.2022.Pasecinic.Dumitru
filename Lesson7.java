public class Lesson7{
    public static void main (String[] args){
        int n = 0;
        int sum = n;

        do {
            sum = n + sum;
            n = n + 1;
        }
        while (n<16);
        System.out.print ("Suma este: ");
        System.out.println (sum);

        n=sum-sum;
        sum=n;

        for (;n<11;n++){
            sum=n+sum;
        }
        System.out.print ("Suma este: ");
        System.out.println (sum);

        n=sum-sum;
        sum=n;

        while (n<6){
            sum = n + sum;
            n = n + 1;
        }
        System.out.println ("Suma este: " + sum);
    }
}