final class cafh extends ibsl implements ibtw {
    int a;
    final String b;
    final cafj c;

    public cafh(String s, cafj cafj0, ibrl ibrl0) {
        this.b = s;
        this.c = cafj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cafh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cafh(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.b;
            if(s != null) {
                this.a = 1;
                if(this.c.g.b(s) == object1) {
                    return object1;
                }
            }
        }
        caie caie0 = this.c.a();
        this.c.k.g(caie0);
        return ibom.a;
    }
}

