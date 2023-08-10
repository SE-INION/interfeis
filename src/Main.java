public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(300);
        System.out.println(flat);
        flat.people();
        System.out.println(" ");

        Dominitory dominitory = new Dominitory(150);
        System.out.println(dominitory);
        dominitory.people();
        System.out.println(" ");

        Hotel hotel = new Hotel(100);
        System.out.println(hotel);
        hotel.people();
    }
}