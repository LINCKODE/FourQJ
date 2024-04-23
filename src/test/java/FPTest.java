import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static systems.linckode.fourqj.curve.CurveParameters.CURVE_ORDER;
import static systems.linckode.fourqj.curve.FP.*;

public class FPTest {

    private final int TEST_TIMES = 512;


    private BigInteger getRandom() {
        BigInteger result = new BigInteger(CURVE_ORDER.bitLength(), new Random());

        if (result.compareTo(CURVE_ORDER) >= 0) result = result.mod(CURVE_ORDER);

        return result;
    }

    @Test
    public void testFPMod() {
        assertEquals(BigInteger.ZERO, fpMod(MODULUS_P));
    }

    @Test
    public void testFPAdd(){

        for (int i = 0; i < TEST_TIMES; i++) {
            BigInteger x = getRandom();
            BigInteger y = getRandom();

            BigInteger actual = fpAdd(x, y);
            BigInteger expected = x.add(y).mod(MODULUS_P);

            assertEquals(expected, actual);
        }

    }


}
