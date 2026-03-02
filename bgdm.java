final class bgdm implements ibtx {
    final ibtw a;

    public bgdm(ibtw ibtw0) {
        this.a = ibtw0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "innerPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ibtw ibtw0 = this.a;
        hey hey0 = hfc.e;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        int v1 = bgdl.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc0 = hew.c(((goz)object1), hey0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw1 = iej.e;
        guo.b(((goz)object1), iau0, ibtw1);
        ibtw ibtw2 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw2);
        ibtw ibtw3 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw3);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw4 = iej.c;
        guo.b(((goz)object1), hfc0, ibtw4);
        bfrc.a(bgat.a, ibtw0, ((goz)object1), 6);
        hfc hfc1 = dla.j(dls.v(hey0), 0.0f, 0.0f, 0.0f, bgdq.p(((dld)object0), ((goz)object1)), 7);
        iau iau1 = dhw.a(hei.e, false);
        int v2 = bgdl.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hfc1);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw1);
        guo.b(((goz)object1), gzk1, ibtw2);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw3);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc2, ibtw4);
        fpo.b(null, 0L, null, ((goz)object1), 0, 7);
        ((goz)object1).z();
        ((goz)object1).z();
        return ibom.a;
    }
}

