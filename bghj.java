final class bghj extends ibsl implements ibts {
    int a;
    final bghr b;
    final String c;
    final String d;

    public bghj(bghr bghr0, String s, String s1, ibrl ibrl0) {
        this.b = bghr0;
        this.c = s;
        this.d = s1;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new bghj(this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        grdf grdf0 = new grdf(this.d);
        bghl bghl0 = new bghl(this.b.b.q(cmlp.a, ckdd.b));
        bghm bghm0 = new bghm(this.b.b.q(cmlp.a, ckde.b));
        Object object2 = this.b.d.a(this.c, grdf0, this.b.e, bghl0, bghm0, this);
        return object2 == object1 ? object1 : object2;
    }
}

