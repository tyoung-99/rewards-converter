/**
 * Handles conversions between cash reward values and airline miles.
 */
public class RewardValue {
    private final double CONVERSION_RATE = 0.0035;  // Miles to cash
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / CONVERSION_RATE);
    }
}
