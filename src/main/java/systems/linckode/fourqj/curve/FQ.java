package systems.linckode.fourqj.curve;

import java.math.BigInteger;

import static systems.linckode.fourqj.curve.FP.*;

public class FQ {

    private BigInteger a;
    private BigInteger b;


    public FQ() {
        this.a = BigInteger.ZERO;
        this.b = BigInteger.ZERO;
    }

    public FQ(BigInteger a, BigInteger b) {
        this.a = a;
        this.b = b;
    }

    public BigInteger getA() {
        return a;
    }

    public void setA(BigInteger a) {
        this.a = a;
    }

    public BigInteger getB() {
        return b;
    }

    public void setB(BigInteger b) {
        this.b = b;
    }


    public static void fp2zero(FQ a) {
        a.setA(BigInteger.ZERO);
        a.setB(BigInteger.ZERO);
    }

    public static void fp2copy(FQ a, FQ b) {
        b.setA(a.getA());
        b.setB(a.getB());
    }

    public static void fp2neg(FQ a) {
        a.setA(fpNeg(a.getA()));
        a.setB(fpNeg(a.getB()));
    }

    public static void fp2sqr(FQ a, FQ c) {

        BigInteger t1 = fpAdd(a.getA(), a.getB());
        BigInteger t2 = fpSub(a.getA(), a.getB());
        BigInteger t3 = fpMul(a.getA(), a.getB());

        c.setA(fpMul(t1, t2));
        c.setB(fpAdd(t3, t3));
    }

    public static void fp2mul(FQ a, FQ b, FQ c) {

        BigInteger t1 = fpMul(a.getA(), b.getA());
        BigInteger t2 = fpMul(a.getB(), b.getB());
        BigInteger t3 = fpAdd(a.getA(), a.getB());
        BigInteger t4 = fpAdd(b.getA(), b.getB());

        c.setA(fpSub(t1, t2));
        t3 = fpMul(t3, t4);
        t3 = fpSub(t3, t1);
        c.setB(fpSub(t3, t2));
    }

    public static void fp2add(FQ a, FQ b, FQ c) {
        c.setA(fpAdd(a.getA(), b.getA()));
        c.setB(fpAdd(a.getB(), b.getB()));
    }

    public static void fp2sub(FQ a, FQ b, FQ c) {
        c.setA(fpSub(a.getA(), b.getA()));
        c.setB(fpSub(a.getB(), b.getB()));
    }

    public static void fp2inv(FQ a) {
        FQ t1 = new FQ(BigInteger.ZERO, BigInteger.ZERO);

        t1.setA(fpSqr(a.getA()));
        t1.setB(fpSqr(a.getB()));

        t1.setA(fpAdd(t1.getA(), t1.getB()));

        t1.setA(fpInv(t1.getA()));
        a.setB(fpNeg(a.getB()));

        a.setA(fpMul(a.getA(), t1.getA()));
        a.setB(fpMul(a.getB(), t1.getA()));
    }

}