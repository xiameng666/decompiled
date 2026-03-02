public final class ddap implements ibtw {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final boolean e;
    public final int f;
    public final int g;

    public ddap(int v, long v1, long v2, float f, boolean z, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = f;
        this.e = z;
        this.f = v3;
        this.g = v4;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.b(this.a, this.b, this.c, this.d, this.e, ((goz)object0), gsc.a(this.f | 1), this.g);
        return ibom.a;
    }
}

