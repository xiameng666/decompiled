final class byke implements ibtw {
    final hfc a;
    final hpw b;
    final hfc c;

    public byke(hfc hfc0, hpw hpw0, hfc hfc1) {
        this.a = hfc0;
        this.b = hpw0;
        this.c = hfc1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hpw hpw0 = this.b;
        hfc hfc0 = this.c;
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), this.a);
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
        fnq.a(hpw0, null, hfc0, fpu.a(((goz)object0)).s, ((goz)object0), 440, 0);
        ((goz)object0).z();
        return ibom.a;
    }
}

