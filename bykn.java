final class bykn implements ibtx {
    final String a;
    final hkn b;

    public bykn(hkn hkn0, String s) {
        this.b = hkn0;
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$XButtonTopAppBarInternal");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dlp)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dlo.a(((dlp)object0), dla.j(dls.B(dls.w(hfc.e)), 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f);
        hkn hkn0 = this.b;
        String s = this.a;
        iau iau0 = dii.a(dho.c, hei.n, ((goz)object1), 0x30);
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
        bykt.b(hkn0, new hll(hll.i), ((goz)object1), 0x30);
        fkx.b(null, 4.0f, hll.h, ((goz)object1), 0x1B0, 1);
        byml.i(s, null, ((goz)object1), 0);
        ((goz)object1).z();
        return ibom.a;
    }
}

