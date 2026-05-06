import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_03 {

    @Test
    void test() {
        assertEquals(6, 6);
    }

    @Test
    void test_2() {
        assertEquals(10,10, () -> "Unequal Numbers");
    }
}
