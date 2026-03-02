final class ddjb implements ibtw {
    final hpw a;
    final String b;
    final String c;
    final ibth d;
    final ibth e;
    final String f;
    final String g;

    public ddjb(hpw hpw0, String s, String s1, ibth ibth0, ibth ibth1, String s2, String s3) {
        this.a = hpw0;
        this.b = s;
        this.c = s1;
        this.d = ibth0;
        this.e = ibth1;
        this.f = s2;
        this.g = s3;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibth ibth4;
        ibth ibth3;
        String s6;
        String s5;
        goz goz0;
        String s4;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.d(hey0, 24.0f);
        hpw hpw0 = this.a;
        String s = this.b;
        String s1 = this.c;
        ibth ibth0 = this.d;
        ibth ibth1 = this.e;
        String s2 = this.f;
        String s3 = this.g;
        iau iau0 = dii.a(dho.c, hei.n, ((goz)object0), 0x30);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth2 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth2);
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
        ((goz)object0).M(0x9149CBF7);
        if(hpw0 == null) {
            goz0 = (goz)object0;
            s6 = s1;
            ibth3 = ibth0;
            ibth4 = ibth1;
            s4 = s2;
            s5 = s3;
        }
        else {
            long v2 = fpu.a(((goz)object0)).a;
            s4 = s2;
            hfc hfc2 = dls.k(dla.j(hey0, 0.0f, 0.0f, 0.0f, 8.0f, 7), 28.0f);
            goz0 = (goz)object0;
            s5 = s3;
            s6 = s1;
            ibth3 = ibth0;
            ibth4 = ibth1;
            fiso.a(hpw0, null, hfc2, v2, goz0, 440, 0);
        }
        goz0.A();
        jbn jbn0 = fpu.d(goz0).g;
        long v3 = fpu.a(goz0).q;
        fiuk.b(s, dla.j(hey0, 0.0f, 0.0f, 0.0f, 8.0f, 7), v3, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz0, 0x30, 0, 130040);
        jbn jbn1 = fpu.d(goz0).k;
        long v4 = fpu.a(goz0).s;
        fiuk.b(s6, dla.j(hey0, 0.0f, 0.0f, 0.0f, 8.0f, 7), v4, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn1, goz0, 0x30, 0, 130040);
        fiqv.a(ibth3, dls.w(dls.t(dla.j(hey0, 0.0f, 24.0f, 0.0f, 4.0f, 5), 0.0f, 56.0f, 1)), false, eah.c(12.0f, 12.0f, 4.0f, 4.0f), fiqq.c(fpu.a(goz0).c, fpu.a(goz0).d, goz0, 12), null, null, null, gzf.e(0x90941849, new ddiz(s4), goz0), goz0, 0x30000030, 484);
        fiqv.a(ibth4, dls.w(dls.t(hey0, 0.0f, 56.0f, 1)), false, eah.c(4.0f, 4.0f, 12.0f, 12.0f), fiqq.c(fpu.a(goz0).c, fpu.a(goz0).d, goz0, 12), null, null, null, gzf.e(0x177D2840, new ddja(s5), goz0), goz0, 0x30000030, 484);
        goz0.z();
        return ibom.a;
    }
}

