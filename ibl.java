public final class ibl extends ibp {
    private final iio a;

    public ibl(iio iio0) {
        this.a = iio0;
    }

    @Override  // ibp
    public final float dX() {
        return this.a.k().dX();
    }

    @Override  // ibp
    public final float dY() {
        return this.a.k().dY();
    }

    @Override  // ibp
    public final int n() {
        return ((ili)this.a).k.h();
    }

    @Override  // ibp
    public final hzk o() {
        return ((ili)this.a).k.s();
    }

    @Override  // ibp
    public final jlm p() {
        return this.a.l();
    }
}

