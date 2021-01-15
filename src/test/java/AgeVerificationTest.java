import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificationTest {

    @Test
    void isGreaterThan18() {
        boolean result = AgeVerification.isGreaterOrEqual18(21);

        Assertions.assertTrue(result);
    }
    @Test
    void isEqualTo18() {
        boolean result = AgeVerification.isGreaterOrEqual18(18);

        Assertions.assertTrue(result);
    }
    @Test
    void isLowerThan18() {
        boolean result = AgeVerification.isGreaterOrEqual18(15);

        Assertions.assertFalse(result);
    }

}
