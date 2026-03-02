final class ddhl implements ibtw {
    final String a;
    final fzm b;

    public ddhl(fzm fzm0, String s) {
        this.b = fzm0;
        this.a = s;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        fzm fzm0 = this.b;
        String s = this.a;
        hey hey0 = hfc.e;
        iau iau0 = dii.a(dho.c, hei.n, ((goz)object0), 0x30);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc0 = hew.c(((goz)object0), hey0);
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
        guo.b(((goz)object0), hfc0, iej.c);
        jbn jbn0 = fpu.d(((goz)object0)).k;
        long v2 = fpu.a(((goz)object0)).v;
        float f = 0.0f;
        fiuk.b(fzm0.a.a, dla.f(hey0, 20.0f, 18.0f, 20.0f, 18.0f - (s == null ? 0.0f : ((dle)fiqq.b).b + 6.0f)), v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object0), 0, 0, 0x1FFF8);
        ((goz)object0).M(0x22BCBF4);
        if(s != null || fzm0.a.c) {
            if(s != null) {
                f = ((dle)fiqq.b).b + 6.0f;
            }
            hfc hfc1 = dls.w(dla.j(hey0, 20.0f, 0.0f, 20.0f, 18.0f - f, 2));
            dhf dhf0 = dho.h(12.0f, hei.o);
            gze gze0 = gzf.e(-1192400217, new ddhk(s, fzm0), ((goz)object0));
            djr.e(hfc1, dhf0, null, hei.k, 0, 0, gze0, ((goz)object0), 0x180C30, 52);
        }
        ((goz)object0).A();
        ((goz)object0).z();
        return ibom.a;
    }
}

