final class dvai implements ibtw {
    final hkas a;
    final ibth b;
    final ibth c;
    final cvq d;

    public dvai(hkas hkas0, ibth ibth0, ibth ibth1, cvq cvq0) {
        this.a = hkas0;
        this.b = ibth0;
        this.c = ibth1;
        this.d = cvq0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        boolean z = hwmp.x() ? this.d.g() : true;
        dval.f(null, this.a, this.b, this.c, z, ((goz)object0), 0);
        return ibom.a;
    }
}

