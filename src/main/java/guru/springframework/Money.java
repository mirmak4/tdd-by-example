package guru.springframework;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
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

    public String getCurrency() {
        return currency;
    }
}
