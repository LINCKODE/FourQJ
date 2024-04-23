package systems.linckode.fourqj.curve;

import java.math.BigInteger;

import static systems.linckode.fourqj.curve.CurveParameters.PRIME_1271;

public class FP {

    public static final BigInteger MODULUS_P = new BigInteger("7fffffffffffffffffffffffffffffff", 16);

    public static BigInteger fpMod(BigInteger a) {
        return a.mod(PRIME_1271);
    }

    public static BigInteger fpAdd(BigInteger a, BigInteger b) {
        return a.add(b).mod(PRIME_1271);
    }

    public static BigInteger fpSub(BigInteger a, BigInteger b) {
        return a.min(b).mod(PRIME_1271);
    }

    public static BigInteger fpMul(BigInteger a, BigInteger b) {
        return a.multiply(b).mod(PRIME_1271);
    }

    public static BigInteger fpSqr(BigInteger a) {
        return a.multiply(a).mod(PRIME_1271);
    }

    public static BigInteger fpHlf(BigInteger a) {
        return a.divide(BigInteger.TWO).mod(PRIME_1271);
    }

    public static BigInteger fpNeg(BigInteger a) {
        return fpSub(MODULUS_P, a).mod(PRIME_1271);
    }

    public static BigInteger fpInv(BigInteger a) {

        //TODO: Check if prime is correct in this context. Do we need 125 - 1 prime?
        return a.modInverse(PRIME_1271);
    }

   /* public static BigInteger fp*/

}
