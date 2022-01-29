package guru.springframework;

public class Frank extends Money {

    public Frank(int amount) {
        this.amount = amount;
    }

    public Money multiplyAmount(int multiplier) {
        return new Frank(amount * multiplier);
    }
}
