final class bvdf implements ibtw {
    final ibtx a;

    public bvdf(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibtx ibtx0 = this.a;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object0), 0);
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
        ibtx0.a(dim.a, ((goz)object0), Integer.valueOf(6));
        ((goz)object0).z();
        return ibom.a;
    }
}

