package guru.springframework;

public class Money {

    protected int amount;

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return this.amount == money.getAmount();
    }
}
