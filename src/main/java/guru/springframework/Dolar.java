package guru.springframework;

public class Dolar {

    private int amount;

    public Dolar(int amount) {
        this.amount = amount;
    }

    public Dolar multiplyAmount(int multiplier) {
        return new Dolar(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        Dolar dolar = (Dolar) other;
        return this.amount == dolar.getAmount();
    }
}
