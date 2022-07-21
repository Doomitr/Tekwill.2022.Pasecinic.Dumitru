public class Lesson6Testing {
    public static void main(String[] args) {
        int a = 0;
        while (a<20){
            a = a + 1;
            if ((a % 2 == 0) && (a > 10)) {
                System.out.println(a + " " + "Numarul este par.");
            } else if ((a % 2 != 0) && (a < 15)) {
                System.out.println(a + " " + "Numarul este impar.");
            } else {System.out.println(a + " " + "Omitem numarul.");
            }
        }
    }
}