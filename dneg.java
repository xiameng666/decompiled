public final class dneg implements ibtw {
    public final dnfc a;
    public final boolean b;
    public final int c;

    public dneg(dnfc dnfc0, boolean z, int v) {
        this.a = dnfc0;
        this.b = z;
        this.c = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        this.a.G(this.b, ((goz)object0), gsc.a(this.c | 1));
        return ibom.a;
    }
}

