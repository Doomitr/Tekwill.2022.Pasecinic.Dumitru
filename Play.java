public class Play {
    public static void main (String [] args) {
        Ipod shuffle = new Ipod();
        shuffle.setStartup("Turning on device...", "Loading playlist.");
        shuffle.track(3);
        shuffle.getName();
        System.out.println("Playing track: " + shuffle.conv('1'));
        System.out.println(shuffle.getName());
        System.out.println("Next Track: " + shuffle.track(50));
    }
}