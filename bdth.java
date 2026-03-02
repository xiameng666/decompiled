final class bdth implements ibtx {
    final boolean a;
    final gra b;
    final long c;
    final bdtt d;

    public bdth(boolean z, gra gra0, long v, bdtt bdtt0) {
        this.a = z;
        this.b = gra0;
        this.c = v;
        this.d = bdtt0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        gra gra0 = this.b;
        bdqn bdqn0 = bdto.b(gra0);
        bdqn bdqn1 = bdqn.d;
        boolean z = true;
        hey hey0 = hfc.e;
        hfc hfc0 = bdtv.a(bdtv.b(hey0, this.a, 2), bdqn0 != bdqn1);
        long v1 = this.c;
        bdtt bdtt0 = this.d;
        iau iau0 = dhw.a(hei.a, false);
        long v2 = gol.c(((goz)object1));
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
        int v3 = (int)(v2 ^ v2 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
            Integer integer0 = v3;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        hfc hfc2 = cqx.c(hey0, v1);
        ((goz)object1).M(5004770);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new bdtg(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc3 = cru.d(hfc2, false, null, null, null, ((ibth)object3), 15);
        String s = isq.d(0x7F15271F, new Object[]{bdtt0.c.size()}, ((goz)object1));  // string:pwm_not_imported_count "%1$d not imported"
        String s1 = bdtw.a(bdtt0.c, ((goz)object1));
        if(bdto.b(gra0) != bdqn1) {
            z = false;
        }
        bdqc.c(hfc3, s, s1, 0x7F08059F, z, fpu.a(((goz)object1)).w, fpu.a(((goz)object1)).y, ((goz)object1), 0, 0);  // drawable:gs_info_vd_theme_24
        ((goz)object1).z();
        return ibom.a;
    }
}

