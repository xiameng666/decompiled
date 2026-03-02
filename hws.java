public final class hws implements hfa {
    public ibts a;
    public boolean b;
    public final hwm c;
    private hwz d;

    public hws() {
        this.c = new hwm(this);
    }

    @Override  // hfc
    public final hfc a(hfc hfc0) {
        return hex.a(this, hfc0);
    }

    @Override  // hfc
    public final Object b(Object object0, ibtw ibtw0) {
        return hez.a(this, object0, ibtw0);
    }

    @Override  // hfc
    public final boolean c(ibts ibts0) {
        return hez.b(this, ibts0);
    }

    public final ibts d() {
        ibts ibts0 = this.a;
        if(ibts0 != null) {
            return ibts0;
        }
        ibuq.j("onTouchEvent");
        return null;
    }

    public final void e(hwz hwz0) {
        hwz hwz1 = this.d;
        if(hwz1 != null) {
            hwz1.a = null;
        }
        this.d = hwz0;
        if(hwz0 != null) {
            hwz0.a = this;
        }
    }
}

