public class Lesson10Homework2_4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int n = 0;
        int sum = n;

        while (n<5){
            sum = n + sum;
            n = n + 1;
        }
        System.out.println ("Suma este: " + sum);

        while (a < 6) {

            if ((a % 2 == 0) && (a < 6)) {
                System.out.print (a);
                System.out.print (" ");
            }
            a = a + 1;
        }
        System.out.println();

        for (int i = 1;i<11;i++){
            System.out.print ("Hello! ");
        }
        System.out.println();

        while (b < 6) {
            b = b + 1;
            if ((b % 2 != 0) && (b < 5)) {
                System.out.print (b + " ");
            }
        }
    }
}
