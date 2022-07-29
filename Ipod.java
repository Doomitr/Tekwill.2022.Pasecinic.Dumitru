public class Ipod {

//1.1 o metoda care primeste ca parametru un nr intreg si il returneaza;
    public int track (int someTrack) {
        return someTrack;
    }

//1.2 o metoda care primeste 2 parametri de tip string si nu returneaza nimic;
    public void setStartup (String turnOnn, String playList){
        System.out.println(turnOnn);
        System.out.println(playList);
    }

//1.3 o metoda care nu primeste nici un parametru si returneaza un string;
    public String getName (){
        return "Led Zeppelin - Stairway to heaven.";
    }

//1.4 o metodata care primeste ca parametru un char si returneaza char-ul primit ca numar intreg.
    public int conv (char b) {
        return b;
    }
}