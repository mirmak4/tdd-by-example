package guru.springframework;

public class Dolar extends Money {

    public Dolar(int amount) {
        this.amount = amount;
    }

    public Money multiplyAmount(int multiplier) {
        return new Dolar(amount * multiplier);
    }
}
