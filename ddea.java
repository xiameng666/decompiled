final class ddea implements ibtw {
    final gra a;

    public ddea(gra gra0) {
        this.a = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        cvq cvq0 = cvf.d(0, ((goz)object0), 0, 1);
        hfc hfc0 = cvf.c(hfc.e, cvq0);
        gra gra0 = this.a;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object0), 0);
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
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).X(gra0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dddz(gra0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ddej.k(((ibth)object2), ((goz)object0));
        ddej.e(((goz)object0), 0);
        ((goz)object0).z();
        return ibom.a;
    }
}

