import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Test_04 {
    // @Test
    // void TestDivision() {
    //     try{
    //         int x = 10/2;
    //         fail("Exception was expected!");
    //     }

    //     catch (ArithmeticException e) {
    //         //test passes
    //     }
    // }

    @Test
    void testDivision() {
        assertThrows(
            ArithmeticException.class, 
            ()-> {
            int x = 10/0;
        });
    }
}
