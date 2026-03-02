final class byka implements ibtw {
    final hkn a;

    public byka(hkn hkn0) {
        this.a = hkn0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.i(dls.C(hey0, null, 3), 0.0f, 16.0f, 1);
        hkn hkn0 = this.a;
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object0));
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
        cth.c(hkn0, null, dls.k(hey0, 24.0f), null, null, 0.0f, null, ((goz)object0), 0x1B0, 0xF8);
        ((goz)object0).z();
        return ibom.a;
    }
}

