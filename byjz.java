final class byjz implements ibtw {
    final String a;
    final String b;

    public byjz(String s, String s1) {
        this.a = s;
        this.b = s1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dla.j(dls.C(dls.x(hfc.e, 56.0f, 0.0f, 2), null, 3), 16.0f, 16.0f, 0.0f, 16.0f, 4);
        String s = this.a;
        String s1 = this.b;
        iau iau0 = dii.a(dho.e, hei.m, ((goz)object0), 6);
        long v = gol.c(((goz)object0));
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
        goz goz0 = (goz)object0;
        byml.c(s, null, false, null, null, goz0, 0, 30);
        goz0.M(0x1E0F37AB);
        if(s1 != null && !ibzk.D(s1)) {
            byml.a(s1, null, false, null, goz0, 0, 14);
            goz0 = goz0;
        }
        goz0.A();
        goz0.z();
        return ibom.a;
    }
}

