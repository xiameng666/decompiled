final class ddxn implements ibtx {
    final ibtx a;

    public ddxn(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        hfc hfc0;
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
        float f = ((dih)object0).d();
        if(jkv.a(f, 960.0f) >= 0) {
            hfc0 = dls.j(hey0, 628.0f);
        }
        else if(jkv.a(f, 900.0f) >= 0) {
            hfc0 = dls.o(dla.i(hey0, 166.0f, 0.0f, 2), 628.0f);
        }
        else if(jkv.a(f, 600.0f) >= 0) {
            hfc0 = dls.j(hey0, 567.0f);
        }
        else {
            hfc0 = jkv.a(f, 392.0f) < 0 ? dls.j(dla.i(hey0, 16.0f, 0.0f, 2), 360.0f) : dls.w(dla.i(hey0, 16.0f, 0.0f, 2));
        }
        ibtx ibtx0 = this.a;
        hfc hfc1 = dls.u(hfc0);
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hfc1);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc2, iej.c);
        ibtx0.a(dic.a, ((goz)object1), Integer.valueOf(6));
        ((goz)object1).z();
        return ibom.a;
    }
}

