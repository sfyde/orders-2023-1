package pl.edu.wszib.orders.application;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    @Test
    public void should_be_able_to_find_existing_order() {
        assertTrue(true);
    }

    // TODO: task1 create and run test that tests sum method is working properly


    public static void main() {
        sum(1, 2, 3, 4, 5);
    }

    public static int sum(int... integers) {
        return IntStream.of(integers).sum();
    }
}
