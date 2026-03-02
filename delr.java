final class delr implements ibtw {
    final ibth a;
    final boolean b;

    public delr(ibth ibth0, boolean z) {
        this.a = ibth0;
        this.b = z;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ddxv.b(((goz)object0));
        hfc hfc0 = dls.w(dla.i(hfc.e, 16.0f, 0.0f, 2));
        ibth ibth0 = this.a;
        boolean z = this.b;
        iau iau0 = dll.b(dho.b, hei.j, ((goz)object0), 6);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth1 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth1);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        cmig.f(0x407D4, gzf.e(-78313060, new delq(ibth0, z), ((goz)object0)), ((goz)object0), 54);
        ((goz)object0).z();
        return ibom.a;
    }
}

