package systems.linckode.fourqj.curve;

import java.math.BigInteger;


public class CurveParameters {

    public static final BigInteger PRIME_1271 = BigInteger.TWO.pow(127).subtract(BigInteger.ONE);

    public static final FQ PARAMETER_D = new FQ(
            new BigInteger("00000000000000e40000000000000142", 16),
            new BigInteger("5E472F846657E0FCB3821488F1FC0C8D", 16)
    );

    public static final FQ GENERATOR_X = new FQ(
      new BigInteger("1A3472237C2FB305286592AD7B3833AA", 16),
      new BigInteger("1E1F553F2878AA9C96869FB360AC77F6", 16)
    );

    public static final FQ GENERATOR_Y = new FQ(
            new BigInteger("0E3FEE9BA120785AB924A2462BCBB287", 16),
            new BigInteger("6E1C4AF8630E024249A7C344844C8B5C", 16)
    );

    public static final BigInteger CURVE_ORDER = new BigInteger("0029cbc14e5e0a72f05397829cbc14e5dfbd004dfe0f79992fb2540ec7768ce7",16);

}
