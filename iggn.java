public final class iggn extends iggb {
    private final igcm b;
    private final transient int c;
    private static final long serialVersionUID = 0x84EA74767003D6BAL;

    public iggn(igcm igcm0, igcp igcp0) {
        super(igcp0);
        int v1;
        this.b = igcm0;
        int v = super.e();
        if(v < 0) {
            v1 = v - 1;
            this.c = v1;
            return;
        }
        if(v == 0) {
            v1 = 1;
            this.c = v1;
            return;
        }
        this.c = v;
    }

    @Override  // iggb
    public final int a(long v) {
        int v1 = super.a(v);
        return v1 > 0 ? v1 : v1 - 1;
    }

    @Override  // iggb
    public final int e() {
        return this.c;
    }

    @Override  // iggb
    public final long l(long v, int v1) {
        int v2 = this.c();
        iggd.e(this, v1, this.c, v2);
        if(v1 <= 0) {
            if(v1 != 0) {
                return super.l(v, v1 + 1);
            }
            throw new igdb(igcr.f, ((int)0), null, null);
        }
        return super.l(v, v1);
    }

    private Object readResolve() {
        return this.a.a(this.b);
    }
}

