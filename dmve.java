public final class dmve implements ibtw {
    public final dmwr a;
    public final ibth b;
    public final ibth c;
    public final boolean d;
    public final int e;

    public dmve(dmwr dmwr0, ibth ibth0, ibth ibth1, boolean z, int v) {
        this.a = dmwr0;
        this.b = ibth0;
        this.c = ibth1;
        this.d = z;
        this.e = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        this.a.K(this.b, this.c, this.d, ((goz)object0), gsc.a(this.e | 1));
        return ibom.a;
    }
}

