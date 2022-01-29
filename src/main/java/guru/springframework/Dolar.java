package guru.springframework;

public class Dolar extends Money {

    public Dolar(int amount) {
        this.amount = amount;
    }

    public Dolar multiplyAmount(int multiplier) {
        return new Dolar(amount * multiplier);
    }
}
