public class Play {
    public static void main (String [] args) {
        Ipod shuffle = new Ipod();
        shuffle.setStartup();
        shuffle.track(3);
        shuffle.getName();
        shuffle.a();
        shuffle.trackAlbum= shuffle.a();
        System.out.println("Next track: " + shuffle.trackAlbum);
        System.out.println(shuffle.getName());
    }
}