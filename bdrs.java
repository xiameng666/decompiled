final class bdrs implements ibtw {
    final boolean a;
    final boolean b;
    final long c;
    final bdsf d;
    final gra e;

    public bdrs(boolean z, boolean z1, long v, bdsf bdsf0, gra gra0) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = bdsf0;
        this.e = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = bdtv.a(bdtv.b(hey0, this.a, 2), this.b);
        long v = this.c;
        bdsf bdsf0 = this.d;
        gra gra0 = this.e;
        boolean z = false;
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object0));
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
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        hfc hfc2 = cqx.c(hey0, v);
        ((goz)object0).M(5004770);
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = new bdrr(gra0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        hfc hfc3 = cru.d(hfc2, false, null, null, null, ((ibth)object2), 15);
        String s = isq.b(0x7F13005D, bdsf0.f.size(), new Object[]{bdsf0.f.size()}, ((goz)object0));  // plurals:pwm_passkey_count
        String s1 = bdtw.a(bdsf0.f, ((goz)object0));
        if(bdrz.b(gra0) == bdqm.c) {
            z = true;
        }
        bdqc.c(hfc3, s, s1, 0x7F0805E8, z, 0L, 0L, ((goz)object0), 0, 0x60);  // drawable:gs_passkey_vd_theme_24
        ((goz)object0).z();
        return ibom.a;
    }
}

