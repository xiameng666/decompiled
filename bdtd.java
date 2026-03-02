final class bdtd implements ibtx {
    final boolean a;
    final gra b;
    final long c;
    final bdtt d;

    public bdtd(boolean z, gra gra0, long v, bdtt bdtt0) {
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
        boolean z = this.a && bdto.b(this.b) != bdqn.b;
        hey hey0 = hfc.e;
        hfc hfc0 = bdtv.a(bdtv.b(hey0, false, 3), z);
        long v1 = this.c;
        bdtt bdtt0 = this.d;
        gra gra0 = this.b;
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
            object3 = new bdtc(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc3 = cru.d(hfc2, false, null, null, null, ((ibth)object3), 15);
        String s = bdtw.a(bdtt0.a, ((goz)object1));
        boolean z1 = bdto.b(gra0) == bdqn.b;
        bdqc.c(hfc3, isq.b(0x7F130066, bdtt0.a.size(), new Object[]{bdtt0.a.size()}, ((goz)object1)), s, 0x7F0805EB, z1, 0L, 0L, ((goz)object1), 0, 0x60);  // plurals:pwm_password_count
        ((goz)object1).z();
        return ibom.a;
    }
}

