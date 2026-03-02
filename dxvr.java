public final class dxvr {
    public static final dxvr a;

    static {
        dxvr.a = new dxvr();
    }

    public final void a(ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz2;
        ibuq.f(ibth0, "onBack");
        ibuq.f(ibth1, "reload");
        goz goz1 = goz0.ao(2098825745);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            abt.a(false, ibth0, goz1, v1 << 3 & 0x70, 1);
            hfc hfc0 = iqn.a(dls.v(hfc.e), "errorPage");
            gze gze0 = gzf.e(-1308775082, new dxvq(ibth1), goz1);
            goz2 = goz1;
            fxw.a(hfc0, dxvk.c, gze0, null, null, 0, 0L, 0L, null, dxvk.g, goz2, 0x300001B6, 504);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dxvo(this, ibth0, ibth1, v);
        }
    }

    public final void b(ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onBack");
        goz goz1 = goz0.ao(0xA76A6879);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            abt.a(false, ibth0, goz1, v1 << 3 & 0x70, 1);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.v(hey0);
            iau iau0 = dhw.a(hei.a, false);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth1 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth1);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            frxv frxv0 = new frxv(new fryn(fuqd.a, 0, 6), new frxt(0x7FFFFFFF, 6));
            hfc hfc2 = dls.k(hey0, 120.0f);
            ftyy.b(frxv0, null, iqn.a(dic.a.a(hfc2, hei.e), "loading"), null, null, 0.0f, new hlb(fpu.a(goz1).a, 5), goz1, 56, 56);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxvp(this, ibth0, v);
        }
    }
}

