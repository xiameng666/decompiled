final class dxvf implements ibtx {
    public static final dxvf a;

    static {
        dxvf.a = new dxvf();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dls.v(dla.e(dla.c(hfc.e, ((dld)object0)), 24.0f, 16.0f));
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object1));
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
        guo.b(((goz)object1), hfc1, iej.c);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new dxve();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        dnh.a(null, null, null, false, null, null, null, false, null, ((ibts)object3), ((goz)object1), 0x30000000, 0x1FF);
        ((goz)object1).z();
        return ibom.a;
    }
}

