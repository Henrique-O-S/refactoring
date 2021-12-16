package pt.up.fe.ldts.example3;

public class FixedDiscount extends Discount{
    public FixedDiscount(int fixed) {
        super(fixed);
    }
    @Override
    public double applyDiscount(double price) {
        return price - fixed;
    }
}
