public final class dfpg implements ibtw {
    public final boolean a;
    public final ibth b;
    public final int c;

    public dfpg(boolean z, ibth ibth0, int v) {
        this.a = z;
        this.b = ibth0;
        this.c = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        dfqn.d(this.a, this.b, ((goz)object0), gsc.a(this.c | 1));
        return ibom.a;
    }
}

