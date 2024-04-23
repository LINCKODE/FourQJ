package systems.linckode.fourqj.curve.point;

import systems.linckode.fourqj.curve.FQ;

public class PointR2 {

    private final FQ xy;
    private final FQ yx;
    private final FQ z2;
    private final FQ t2;

    public PointR2() {
        this.xy = new FQ();
        this.yx = new FQ();
        this.z2 = new FQ();
        this.t2 = new FQ();
    }

    public PointR2(FQ xy, FQ yx, FQ z2, FQ t2) {
        this.xy = xy;
        this.yx = yx;
        this.z2 = z2;
        this.t2 = t2;
    }


    public FQ getXy() {
        return xy;
    }

    public FQ getYx() {
        return yx;
    }

    public FQ getZ2() {
        return z2;
    }

    public FQ getT2() {
        return t2;
    }
}
