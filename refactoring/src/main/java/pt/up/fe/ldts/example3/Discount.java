package pt.up.fe.ldts.example3;

public abstract class Discount {
    protected int fixed = 0;
    protected double percentage = 0;

    public Discount(int fixed) {
        this.fixed = fixed;
    }

    public Discount(double percentage) {
        this.percentage = percentage;
    }

    public abstract double applyDiscount(double price);
}
