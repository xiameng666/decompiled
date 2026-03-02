final class bghp extends ibsl implements ibtw {
    int a;
    final bghr b;
    final bggb c;
    final ggfd d;

    public bghp(bghr bghr0, bggb bggb0, ggfd ggfd0, ibrl ibrl0) {
        this.b = bghr0;
        this.c = bggb0;
        this.d = ggfd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bghp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bghp(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        ibuq.c(this.c);
        gged_interceptors gged0 = this.d.a(this.c).v();
        ibuq.e(gged0, "asList(...)");
        this.a = 1;
        Object object2 = this.b.c(this.c, gged0, this);
        return object2 == object1 ? object1 : object2;
    }
}

