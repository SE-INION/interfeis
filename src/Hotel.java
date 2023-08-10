public class Hotel implements Family {
    private int rent;

    @Override
    public void people() {
        System.out.println("Taksyr and Daniel");
    }

    public Hotel(int rent) {
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
        return "Hotel:" +"\n"+
                "rent:" + rent;
    }
}
