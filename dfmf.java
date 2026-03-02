public final class dfmf implements ibtw {
    public final ibth a;
    public final ibth b;
    public final int c;

    public dfmf(ibth ibth0, ibth ibth1, int v) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        dfnd.e(this.a, this.b, ((goz)object0), gsc.a(this.c | 1));
        return ibom.a;
    }
}

