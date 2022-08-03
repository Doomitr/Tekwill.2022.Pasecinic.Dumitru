package md.tekwill.pack13.stringmethods;

public class StringMethods {
    public static void main(String[] args) {
        String string = "Home";
        String result = "";
        int n=0;
        while (n<(string.length())){
            String m=(string.substring(string.length()-1));
            string = string.substring(0,string.length()-1);
            result = result + m;
        }
        System.out.println(result);
    }
}
