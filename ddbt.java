final class ddbt implements ibtx {
    final ibtw a;
    final ibtw b;
    final String c;
    final String d;

    public ddbt(ibtw ibtw0, ibtw ibtw1, String s, String s1) {
        this.a = ibtw0;
        this.b = ibtw1;
        this.c = s;
        this.d = s1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dlp)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0xA2D0B93E);
        ibtw ibtw0 = this.a;
        if(ibtw0 != null) {
            ibtw0.a(((goz)object1), Integer.valueOf(0));
            dlv.a(dls.k(hfc.e, 12.0f), ((goz)object1));
        }
        ((goz)object1).A();
        hey hey0 = hfc.e;
        hfc hfc0 = dlo.a(((dlp)object0), hey0, 1.0f);
        String s = this.c;
        String s1 = this.d;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
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
        ibtw ibtw1 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw1);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        fiuk.b(s, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(((goz)object1)).h, ((goz)object1), 0, 0, 0x1FFFE);
        jbn jbn0 = fpu.d(((goz)object1)).k;
        fiuk.b(s1, null, fpu.a(((goz)object1)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        ((goz)object1).z();
        dlv.a(dls.k(hey0, 12.0f), ((goz)object1));
        this.b.a(((goz)object1), Integer.valueOf(0));
        return ibom.a;
    }
}

