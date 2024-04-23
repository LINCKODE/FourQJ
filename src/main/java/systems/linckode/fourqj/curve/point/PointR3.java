package systems.linckode.fourqj.curve.point;

import systems.linckode.fourqj.curve.FQ;

public class PointR3 {

    private final FQ xy;
    private final FQ yx;
    private final FQ t2;

    public PointR3() {
        this.xy = new FQ();
        this.yx = new FQ();
        this.t2 = new FQ();
    }

    public PointR3(FQ xy, FQ yx, FQ t2) {
        this.xy = xy;
        this.yx = yx;
        this.t2 = t2;
    }

    public FQ getXy() {
        return xy;
    }

    public FQ getYx() {
        return yx;
    }

    public FQ getT2() {
        return t2;
    }
}
