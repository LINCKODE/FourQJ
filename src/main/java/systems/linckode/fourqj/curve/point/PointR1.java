package systems.linckode.fourqj.curve.point;

import systems.linckode.fourqj.curve.CurveParameters;
import systems.linckode.fourqj.curve.FQ;

import static systems.linckode.fourqj.curve.FQ.*;

public class PointR1 {

    private final FQ x;
    private final FQ y;
    private final FQ z;
    private final FQ ta;
    private final FQ tb;

    public PointR1() {
        this.x = new FQ();
        this.y = new FQ();
        this.z = new FQ();
        this.ta = new FQ();
        this.tb = new FQ();
    }

    public PointR1(FQ x, FQ y, FQ z, FQ ta, FQ tb) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ta = ta;
        this.tb = tb;
    }

    public PointR2 toR2() {

        PointR2 pointR2 = new PointR2();

        fp2add(this.ta, this.ta, pointR2.getT2());
        fp2add(this.x, this.y, pointR2.getXy());
        fp2sub(this.y, this.x, pointR2.getYx());
        fp2mul(pointR2.getT2(), this.tb, pointR2.getT2());
        fp2add(this.z, this.z, pointR2.getZ2());
        fp2mul(pointR2.getT2(), CurveParameters.PARAMETER_D, pointR2.getT2());
        return pointR2;
    }

    public PointR3 toR3() {
        PointR3 pointR3 = new PointR3();

        fp2add(this.x, this.y, pointR3.getXy());
        fp2sub(this.x, this.y, pointR3.getYx());
        fp2mul(this.ta, this.tb, pointR3.getT2());
        fp2copy(this.z, pointR3.get);

        return pointR3;
    }


    public FQ getX() {
        return x;
    }

    public FQ getY() {
        return y;
    }

    public FQ getZ() {
        return z;
    }

    public FQ getTa() {
        return ta;
    }

    public FQ getTb() {
        return tb;
    }
}
