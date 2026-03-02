final class fukl implements ibtw {
    final boolean a;
    final hfc b;
    final boolean c;
    final fule d;
    final ibth e;
    final fulb f;
    final fryk g;
    final int h;
    final long i;
    final ibth j;
    final fryv k;
    final fryv l;
    final fryv m;

    public fukl(boolean z, hfc hfc0, boolean z1, fule fule0, ibth ibth0, fulb fulb0, fryk fryk0, int v, long v1, ibth ibth1, fryv fryv0, fryv fryv1, fryv fryv2) {
        this.a = z;
        this.b = hfc0;
        this.c = z1;
        this.d = fule0;
        this.e = ibth0;
        this.f = fulb0;
        this.g = fryk0;
        this.h = v;
        this.i = v1;
        this.j = ibth1;
        this.k = fryv0;
        this.l = fryv1;
        this.m = fryv2;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        eaa eaa0;
        fcp fcp0;
        goz goz0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(-203863154);
        ((goz)object0).A();
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        boolean z = this.a;
        boolean z1 = true;
        hfc hfc0 = z ? iqn.a(dko.a(dls.t(this.b, 0.0f, 144.0f, 1)), "StyledWalletTip") : iqn.a(dko.a(this.b), "StyledWalletTip");
        if(hyxx.c()) {
            ((goz)object0).M(-2024272001);
            long v = fpu.a(((goz)object0)).F;
            goz0 = (goz)object0;
            fcp0 = fcq.h(v, 0L, 0L, 0L, goz0, 14);
        }
        else {
            goz0 = (goz)object0;
            goz0.M(-2024162478);
            fcp0 = fcq.i(goz0);
        }
        goz0.A();
        if(this.c) {
            goz0.M(-2024067308);
            eaa0 = fulh.a(this.d, goz0);
        }
        else {
            goz0.M(-2024009214);
            eaa0 = fpu.c(goz0).e;
        }
        goz0.A();
        goz0.M(-203835809);
        crk crk0 = hyxx.c() ? null : crl.a(1.0f, fpu.a(goz0).B);
        goz0.A();
        ibth ibth1 = this.e;
        if(ibth1 == null) {
            z1 = false;
        }
        goz0.M(-1633490746);
        int v1 = goz0.X(ibth0) | goz0.X(ibth1);
        Object object2 = goz0.k();
        if(v1 != 0 || object2 == gop.a) {
            object2 = new fukh(ibth0, ibth1);
            goz0.R(object2);
        }
        goz0.A();
        fdb.b(((ibth)object2), hfc0, z1, eaa0, fcp0, null, crk0, gzf.e(0xAF60962E, new fukk(this.f, this.g, this.h, this.i, z, this.j, this.k, this.l, this.m), goz0), goz0, 0x6000000, 0xA0);
        return ibom.a;
    }
}

