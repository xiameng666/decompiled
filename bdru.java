final class bdru implements ibtw {
    final boolean a;
    final long b;
    final bdtx c;
    final boolean d;

    public bdru(boolean z, long v, bdtx bdtx0, boolean z1) {
        this.a = z;
        this.b = v;
        this.c = bdtx0;
        this.d = z1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = bdtv.a(hey0, this.a);
        long v = this.b;
        bdtx bdtx0 = this.c;
        boolean z = this.d;
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        bdqc.d(cqx.c(hey0, v), bdtx0, (z ? 16.0f : 0.0f), ((goz)object0), 0);
        ((goz)object0).z();
        return ibom.a;
    }
}

