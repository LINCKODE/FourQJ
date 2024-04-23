package systems.linckode.fourqj.curve.point;

import systems.linckode.fourqj.curve.FQ;

public class PointAffine {

    private final FQ x;
    private final FQ y;

    public PointAffine() {
        this.x = new FQ();
        this.y = new FQ();
    }

    public PointAffine(FQ x, FQ y) {
        this.x = x;
        this.y = y;
    }

    public FQ getX() {
        return x;
    }

    public FQ getY() {
        return y;
    }
}
