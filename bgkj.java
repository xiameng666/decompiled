final class bgkj implements ibtw {
    final hfc a;
    final hqf b;
    final String c;
    final String d;

    public bgkj(hfc hfc0, hqf hqf0, String s, String s1) {
        this.a = hfc0;
        this.b = hqf0;
        this.c = s;
        this.d = s1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dla.e(dls.d(this.a, 1.0f), 24.0f, 12.0f);
        hqf hqf0 = this.b;
        String s = this.c;
        String s1 = this.d;
        iau iau0 = dll.b(dho.a, hei.j, ((goz)object0), 0);
        int v = bgki.a(gol.c(((goz)object0)));
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
        guo.b(((goz)object0), hfc1, iej.c);
        hfc hfc2 = dla.j(hfc.e, 0.0f, 0.0f, 16.0f, 0.0f, 11);
        long v1 = fpu.a(((goz)object0)).a;
        ibtw ibtw3 = iej.c;
        fnq.b(hqf0, null, hfc2, v1, ((goz)object0), 0x1B0, 0);
        iau iau1 = dii.a(dho.c, hei.m, ((goz)object0), 0);
        int v2 = bgki.a(gol.c(((goz)object0)));
        gzk gzk1 = ((goz)object0).ap();
        hfc hfc3 = hew.c(((goz)object0), hfc.e);
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        guo.b(((goz)object0), iau1, ibtw0);
        guo.b(((goz)object0), gzk1, ibtw1);
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object0).R(integer1);
            ((goz)object0).p(integer1, ibtw2);
        }
        guo.a(((goz)object0), ibts0);
        guo.b(((goz)object0), hfc3, ibtw3);
        gdh.b(s, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(((goz)object0)).j, ((goz)object0), 0, 0, 0x1FFFE);
        gdh.b(s1, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(((goz)object0)).k, ((goz)object0), 0, 0, 0x1FFFE);
        ((goz)object0).z();
        ((goz)object0).z();
        return ibom.a;
    }
}

