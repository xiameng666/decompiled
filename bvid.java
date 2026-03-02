final class bvid extends ibsl implements ibtw {
    int a;
    final bvkk b;

    public bvid(bvkk bvkk0, ibrl ibrl0) {
        this.b = bvkk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvid)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvid(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.f(this.b.l, "<this>");
            cjcd cjcd0 = new cjcd();
            ibuq.f(this.b.l, "<this>");
            icht icht0 = new icht(new cjcg(this.b.l, cjcd0, null));
            bvic bvic0 = new bvic(null);
            this.a = 1;
            object0 = icll.d(icht0, bvic0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((ibns)object0) != null) {
            this.b.f(((String)((ibns)object0).a), ((String)((ibns)object0).b), clmw.p);
        }
        return ibom.a;
    }
}

