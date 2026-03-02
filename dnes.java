final class dnes implements ibtw {
    final dnfc a;
    final gui b;

    public dnes(dnfc dnfc0, gui gui0) {
        this.a = dnfc0;
        this.b = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dnfc dnfc0 = this.a;
        gui gui0 = this.b;
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc0 = hew.c(((goz)object0), hfc.e);
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
        dnfc0.G(((Boolean)gui0.a()).booleanValue(), ((goz)object0), 0);
        ((goz)object0).z();
        return ibom.a;
    }
}

