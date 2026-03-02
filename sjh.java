final class sjh implements ibtw {
    final ibtw a;
    final dim b;

    public sjh(dim dim0, ibtw ibtw0) {
        this.b = dim0;
        this.a = ibtw0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dla.c(hfc.e, sjl.b);
        hfc hfc1 = this.b.a(hfc0, hei.n);
        ibtw ibtw0 = this.a;
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc2 = hew.c(((goz)object0), hfc1);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw1 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw1);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc2, iej.c);
        ibtw0.a(((goz)object0), Integer.valueOf(0));
        ((goz)object0).z();
        return ibom.a;
    }
}

