package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplicationDolar() {
        Dolar five = new Dolar(5);
        Dolar product = five.multiplyAmount(2);
        assertEquals(new Dolar(10), product);
        product = five.multiplyAmount(3);
        assertEquals(new Dolar(15), product);
    }

    @Test
    public void testEqualityDolar() {
        assertEquals(new Dolar(5), new Dolar(5));
        assertNotEquals(new Dolar(5), new Dolar(8));
    }

    @Test
    public void testMultiplicationFrank() {
        Frank five = new Frank(5);
        Frank product = five.multiplyAmount(2);
        assertEquals(new Frank(10), product);
        product = five.multiplyAmount(3);
        assertEquals(new Frank(15), product);
    }

    @Test
    public void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
    }
}
