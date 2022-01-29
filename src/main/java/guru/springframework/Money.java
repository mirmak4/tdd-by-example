package guru.springframework;

public abstract class Money {

    protected int amount;

    public static Money dolar(int amount) {
        return new Dolar(amount);
    }

    public static Money frank(int amount) {
        return new Frank(amount);
    }

    public abstract Money multiplyAmount(int multiplier);

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
