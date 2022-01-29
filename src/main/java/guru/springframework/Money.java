package guru.springframework;

public abstract class Money {

    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return this.amount == money.getAmount()
                && getClass() == other.getClass();
    }
}
