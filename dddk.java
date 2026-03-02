public final class dddk implements ibtw {
    public final ibth a;
    public final ibth b;
    public final ibth c;
    public final int d;

    public dddk(ibth ibth0, ibth ibth1, ibth ibth2, int v) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = ibth2;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddej.f(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

