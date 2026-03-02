final class fuds implements ibtx {
    final fudu a;

    public fuds(fudu fudu0) {
        this.a = fudu0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        jbn jbn1;
        hey hey2;
        jbn jbn0;
        fudu fudu1;
        hey hey1;
        goz goz0 = (goz)object1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.e(hey0, (hyxx.c() ? 20.0f : 24.0f), 20.0f);
        fudu fudu0 = this.a;
        iau iau0 = dii.a(dho.c, hei.m, goz0, 0);
        long v1 = gol.c(goz0);
        gzk gzk0 = goz0.ap();
        hfc hfc1 = hew.c(goz0, hfc0);
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
        guo.b(goz0, hfc1, iej.c);
        fryv fryv0 = fudu0.a;
        goz0.M(-605214947);
        if(fryv0 == null) {
            hey1 = hey0;
            fudu1 = fudu0;
        }
        else {
            if(hyxx.c()) {
                goz0.M(0xF4CCE8B3);
                jbn0 = fpu.d(goz0).D;
            }
            else {
                goz0.M(0xF4CE215D);
                jbn0 = fpu.d(goz0).o;
            }
            goz0.A();
            hey1 = hey0;
            fudu1 = fudu0;
            ftzd.a(fryv0, null, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz0, 0, 0, 0x1FFFA);
            goz0 = goz0;
        }
        goz0.A();
        fryv fryv1 = fudu1.b;
        goz0.M(-605203756);
        if(fryv1 == null) {
            hey2 = hey1;
        }
        else {
            hfc hfc2 = dla.j(hey1, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            hey2 = hey1;
            if(hyxx.c()) {
                goz0.M(0xD496BBFC);
                jbn1 = fpu.d(goz0).z;
            }
            else {
                goz0.M(0xD497F4A6);
                jbn1 = fpu.d(goz0).k;
            }
            goz0.A();
            ftzd.a(fryv1, hfc2, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
        }
        goz0.A();
        fudo fudo0 = fudu1.c;
        if((fudo0 instanceof fudn)) {
            goz0.M(0xA1C3FAAB);
            goz0.M(5004770);
            boolean z = goz0.X(fudo0);
            Object object3 = goz0.k();
            if(z || object3 == gop.a) {
                object3 = new fudr(fudo0);
                goz0.R(object3);
            }
            goz0.A();
            fitn.b(((ibth)object3), dls.e(dla.i(dls.w(hey2), 0.0f, 4.0f, 1), 8.0f), 0L, 0L, 0, 0.0f, null, goz0, 0x30, 0x7C);
            goz0.A();
            goz0.z();
            return ibom.a;
        }
        goz0.M(0xDBED8320);
        goz0.A();
        throw new ibnq();
    }
}

