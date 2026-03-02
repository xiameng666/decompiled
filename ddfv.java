final class ddfv implements ibtw {
    final dmf a;
    final ibva b;
    final gej c;
    final ibtw d;
    final jbn e;
    final float f;
    final boolean g;
    final ibtw h;
    final ibtw i;
    final ibva j;
    final gep k;
    final ibtw l;
    final jbn m;
    final float n;
    final ibvb o;
    final boolean p;

    public ddfv(dmf dmf0, ibva ibva0, gej gej0, ibtw ibtw0, jbn jbn0, float f, boolean z, ibtw ibtw1, ibtw ibtw2, ibva ibva1, gep gep0, ibtw ibtw3, jbn jbn1, float f1, ibvb ibvb0, boolean z1) {
        this.a = dmf0;
        this.b = ibva0;
        this.c = gej0;
        this.d = ibtw0;
        this.e = jbn0;
        this.f = f;
        this.g = z;
        this.h = ibtw1;
        this.i = ibtw2;
        this.j = ibva1;
        this.k = gep0;
        this.l = ibtw3;
        this.m = jbn1;
        this.n = f1;
        this.o = ibvb0;
        this.p = z1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dmf dmf0 = this.a;
        ibva ibva0 = this.b;
        gej gej0 = this.c;
        float f = this.f;
        boolean z = this.g;
        ibtw ibtw0 = this.h;
        ibtw ibtw1 = this.l;
        jbn jbn0 = this.m;
        float f1 = this.n;
        ibvb ibvb0 = this.o;
        hey hey0 = hfc.e;
        boolean z1 = this.p;
        ibtw ibtw2 = this.i;
        ibva ibva1 = this.j;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object0), 0);
        long v = gol.c(((goz)object0));
        gep gep0 = this.k;
        gzk gzk0 = ((goz)object0).ap();
        ibtw ibtw3 = this.d;
        hfc hfc0 = hew.c(((goz)object0), hey0);
        jbn jbn1 = this.e;
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
        ibtw ibtw4 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw4);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc0, iej.c);
        hfc hfc1 = hhi.b(dml.b(hey0, dmf0));
        long v2 = gej0.c;
        dhf dhf0 = dho.a;
        long v3 = gej0.e;
        long v4 = gej0.d;
        ddfz.e(hfc1, ibva0.a, v2, v4, v3, ibtw3, jbn1, f, dho.e, dhf0, 0, z, ibtw0, ibtw2, ((goz)object0), 0xC06);
        hfc hfc2 = hhi.b(dml.b(hey0, new dkt(dmf0, 15)));
        float f2 = ibva1.a - ibva0.a;
        float f3 = 0.0f;
        if(gep0 != null) {
            ges ges0 = gep0.b();
            if(ges0 != null) {
                f3 = ges0.c();
            }
        }
        ddfz.e(hfc2, f2 + f3, v2, v4, v3, ibtw1, jbn0, f1, dho.d, dhf0, ibvb0.a, z1, ddcv.c, ddcv.d, ((goz)object0), 0xD80);
        ((goz)object0).z();
        return ibom.a;
    }
}

