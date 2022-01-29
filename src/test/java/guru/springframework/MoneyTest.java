package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplicationDolar() {
        Money five = Money.dolar(5);
        assertEquals(Money.dolar(10), five.multiplyAmount(2));
        assertEquals(Money.dolar(15), five.multiplyAmount(3));
    }

    @Test
    public void testEqualityDolar() {
        assertEquals(Money.dolar(5), Money.dolar(5));
        assertNotEquals(Money.dolar(5), Money.dolar(8));
        assertNotEquals(Money.dolar(5), Money.frank(5));
    }

    @Test
    public void testMultiplicationFrank() {
        Money five = Money.frank(5);
        assertEquals(Money.frank(10), five.multiplyAmount(2));
        assertEquals(Money.frank(15), five.multiplyAmount(3));
    }

    @Test
    public void testEqualityFrank() {
        assertEquals(Money.frank(5), Money.frank(5));
        assertNotEquals(Money.frank(5), Money.frank(8));
    }
}
