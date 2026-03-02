final class duyw implements ibtx {
    final cvq a;

    public duyw(cvq cvq0) {
        this.a = cvq0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPaddings");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = cvf.c(dla.i(dla.c(hey0, ((dld)object0)), 24.0f, 0.0f, 2), this.a);
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        dlv.a(dls.e(hey0, 16.0f), ((goz)object1));
        duyx.f(null, ((goz)object1), 0);
        dlv.a(dls.e(hey0, 32.0f), ((goz)object1));
        duyx.g(null, ((goz)object1), 0);
        dlv.a(dls.e(hey0, 16.0f), ((goz)object1));
        duyx.h(null, ((goz)object1), 0);
        ((goz)object1).z();
        return ibom.a;
    }
}

