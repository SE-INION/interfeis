public class Dominitory implements Family{
    private int rent;

    @Override
    public void people() {
        System.out.println("Marselo, Bereke");
    }

    public Dominitory(int rent) {
        this.rent = rent;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Dominitory:" +"\n"+
                "rent:" + rent;
    }
}