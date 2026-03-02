final class bylt implements ibtx {
    final ibth a;
    final String b;
    final ibtw c;

    public bylt(ibth ibth0, String s, ibtw ibtw0) {
        this.a = ibth0;
        this.b = s;
        this.c = ibtw0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dls.v(hey0);
        ibth ibth0 = this.a;
        hel hel0 = hei.a;
        iau iau0 = dhw.a(hel0, false);
        int v1 = bylr.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth1 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw3);
        bylv.b(hll.h, ibth0, ((goz)object1), 390);
        ((goz)object1).z();
        hfc hfc2 = dls.C(((dih)object0).a(hey0, hei.h), null, 3);
        ((goz)object1).M(0x81F8BA0);
        float f = jys.d() ? dmk.b(dmw.c(((goz)object1)), ((goz)object1)).a() + 24.0f : 24.0f;
        ((goz)object1).A();
        hfc hfc3 = dla.j(hfc2, 24.0f, 0.0f, 24.0f, f, 2);
        String s = this.b;
        ibtw ibtw4 = this.c;
        iau iau1 = dhw.a(hel0, false);
        int v2 = bylr.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc4 = hew.c(((goz)object1), hfc3);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc4, ibtw3);
        hfc hfc5 = dls.C(hey0, null, 3);
        fcp fcp0 = fcq.h(fpu.a(((goz)object1)).u, 0L, 0L, 0L, ((goz)object1), 14);
        gze gze0 = gzf.e(0x9F767FF0, new byls(s, ibtw4, ibth0), ((goz)object1));
        fdb.a(hfc5, byii.a.c, fcp0, null, null, gze0, ((goz)object1), 0x30006, 24);
        ((goz)object1).z();
        return ibom.a;
    }
}

