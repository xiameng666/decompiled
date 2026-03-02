final class dgiu extends ibsl implements ibtw {
    int a;
    final dgiy b;
    final String c;

    public dgiu(dgiy dgiy0, String s, ibrl ibrl0) {
        this.b = dgiy0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgiu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgiu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dgir dgir0 = new dgir(this.b.a, this.c);
            dgit dgit0 = new dgit(this.b, this.c, null);
            this.a = 1;
            if(dgir0.a(dgit0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

