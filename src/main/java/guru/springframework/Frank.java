package guru.springframework;

public class Frank {

    private int amount;

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank multiplyAmount(int multiplier) {
        return new Frank(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        Frank frank = (Frank) other;
        return this.amount == frank.getAmount();
    }
}
