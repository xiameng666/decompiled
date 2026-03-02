public final class iggo extends iggb {
    private final igcm b;
    private final transient int c;
    private static final long serialVersionUID = 0xFFFFFAA7EA70C5EDL;

    public iggo(igcm igcm0, igcp igcp0) {
        super(igcp0);
        int v1;
        this.b = igcm0;
        int v = super.e();
        if(v < 0) {
            v1 = v + 1;
            this.c = v1;
            return;
        }
        if(v == 1) {
            v1 = 0;
            this.c = v1;
            return;
        }
        this.c = v;
    }

    @Override  // iggb
    public final int a(long v) {
        int v1 = super.a(v);
        return v1 >= 0 ? v1 : v1 + 1;
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
            --v1;
        }
        return super.l(v, v1);
    }

    private Object readResolve() {
        return this.a.a(this.b);
    }
}

