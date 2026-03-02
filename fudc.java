final class fudc implements ibtx {
    final fude a;

    public fudc(fude fude0) {
        this.a = fude0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dim dim1;
        goz goz0 = (goz)object1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        fude fude0 = this.a;
        hey hey0 = hfc.e;
        iau iau0 = dii.a(dho.c, hei.m, goz0, 0);
        long v1 = gol.c(goz0);
        gzk gzk0 = goz0.ap();
        hfc hfc0 = hew.c(goz0, hey0);
        ibth ibth0 = iej.a;
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth0);
        }
        else {
            goz0.T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(goz0, iau0, iej.e);
        guo.b(goz0, gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            goz0.R(integer0);
            goz0.p(integer0, ibtw0);
        }
        guo.a(goz0, iej.g);
        guo.b(goz0, hfc0, iej.c);
        fryv fryv0 = fude0.a;
        dim dim0 = dim.a;
        goz0.M(0xCA6FA00C);
        if(fryv0 == null) {
            dim1 = dim0;
        }
        else {
            hfc hfc1 = dla.j(hey0, 24.0f, 20.0f, 24.0f, 0.0f, 8);
            jbn jbn0 = fpu.d(goz0).g;
            dim1 = dim0;
            ftzd.a(fryv0, hfc1, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz0, 0, 0, 0x1FFF8);
            goz0 = goz0;
        }
        goz0.A();
        if(fude0.b != null && (fude0.b.b != null && !fude0.b.b.isEmpty())) {
            goz0.M(0x8389E2FE);
            fudd.e(dim1, null, fude0, goz0, 6);
        }
        else {
            goz0.M(-2088065548);
            fudd.f(dim1, null, fude0, goz0, 6);
        }
        goz0.A();
        goz0.z();
        return ibom.a;
    }
}

