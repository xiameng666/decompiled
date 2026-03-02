final class dela implements ibtw {
    final ibtx a;
    final hpw b;
    final String c;

    public dela(ibtx ibtx0, hpw hpw0, String s) {
        this.a = ibtx0;
        this.b = hpw0;
        this.c = s;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        float f;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ddxv.b(((goz)object0));
        dhg dhg0 = dho.g(4.0f);
        hey hey0 = hfc.e;
        ddxv.b(((goz)object0));
        ddxv.b(((goz)object0));
        ddxv.b(((goz)object0));
        ibtx ibtx0 = this.a;
        if(ibtx0 == null) {
            ((goz)object0).M(0x5910EC17);
            ddxv.b(((goz)object0));
            ((goz)object0).A();
            f = 16.0f;
        }
        else {
            ((goz)object0).M(0x590FD1D2);
            ddxv.b(((goz)object0));
            ((goz)object0).A();
            f = 6.0f;
        }
        hfc hfc0 = cvf.c(dla.f(hey0, 16.0f, 16.0f, 16.0f, f), cvf.d(0, ((goz)object0), 0, 1));
        hpw hpw0 = this.b;
        String s = this.c;
        iau iau0 = dii.a(dhg0, hei.m, ((goz)object0), 0);
        int v = dekz.a(gol.c(((goz)object0)));
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
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object0), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object0), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v))) {
            Integer integer0 = v;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object0), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object0), hfc1, ibtw3);
        ddxv.b(((goz)object0));
        iau iau1 = dll.b(dho.g(16.0f), hei.k, ((goz)object0), 0x30);
        int v1 = dekz.a(gol.c(((goz)object0)));
        gzk gzk1 = ((goz)object0).ap();
        hfc hfc2 = hew.c(((goz)object0), hey0);
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        guo.b(((goz)object0), iau1, ibtw0);
        guo.b(((goz)object0), gzk1, ibtw1);
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer1 = v1;
            ((goz)object0).R(integer1);
            ((goz)object0).p(integer1, ibtw2);
        }
        guo.a(((goz)object0), ibts0);
        guo.b(((goz)object0), hfc2, ibtw3);
        ((goz)object0).M(1917206179);
        if(hpw0 != null) {
            long v2 = ddxv.a(((goz)object0)).a;
            fiso.a(hpw0, null, dls.k(hey0, 32.0f), v2, ((goz)object0), 440, 0);
        }
        ((goz)object0).A();
        jbn jbn0 = fpu.d(((goz)object0)).m;
        fiuk.b(s, null, ddxv.a(((goz)object0)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object0), 0, 0, 0x1FFFA);
        ((goz)object0).z();
        ((goz)object0).M(0xE2D0AA24);
        if(ibtx0 != null) {
            delc.a(ibtx0, ((goz)object0), 0);
        }
        ((goz)object0).A();
        ((goz)object0).z();
        return ibom.a;
    }
}

