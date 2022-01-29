package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplicationDolar() {
        Dolar five = new Dolar(5);
        assertEquals(new Dolar(10), five.multiplyAmount(2));
        assertEquals(new Dolar(15), five.multiplyAmount(3));
    }

    @Test
    public void testEqualityDolar() {
        assertEquals(new Dolar(5), new Dolar(5));
        assertNotEquals(new Dolar(5), new Dolar(8));
        assertNotEquals(new Dolar(5), new Frank(5));
    }

    @Test
    public void testMultiplicationFrank() {
        Frank five = new Frank(5);
        assertEquals(new Frank(10), five.multiplyAmount(2));
        assertEquals(new Frank(15), five.multiplyAmount(3));
    }

    @Test
    public void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
    }
}
