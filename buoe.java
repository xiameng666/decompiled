public final class buoe implements ibtw {
    public final bupl a;
    public final hivr b;
    public final hivx c;
    public final tyb d;
    public final ibts e;
    public final ibts f;
    public final int g;

    public buoe(bupl bupl0, hivr hivr0, hivx hivx0, tyb tyb0, ibts ibts0, ibts ibts1, int v) {
        this.a = bupl0;
        this.b = hivr0;
        this.c = hivx0;
        this.d = tyb0;
        this.e = ibts0;
        this.f = ibts1;
        this.g = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        this.a.C(this.b, this.c, this.d, this.e, this.f, ((goz)object0), gsc.a(this.g | 1));
        return ibom.a;
    }
}

