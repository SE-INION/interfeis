public class Flat implements Family{
    private int comPayment;

    public Flat(int comPayment) {
        this.comPayment = comPayment;
    }

    public int getComPayment() {
        return comPayment;
    }

    public void setComPayment(int comPayment) {
        this.comPayment = comPayment;
    }

    @Override
    public void people() {
        System.out.println("Alex, Sasha, Marta");
    }

    @Override
    public String toString() {
        return "Flat:" +"\n"+
                "comPayment:" + comPayment ;
    }
}