public enum CoinType {

    TWOPOUNDS(2.00),
    ONEPOUND(1.00),
    FIFTYPENCE(0.50),
    TWENTYPENCE(0.20),
    TENPENCE(0.10);

    private final double value;

    CoinType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
