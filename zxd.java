public final class zxd {
    public static final void a(znp znp0, hfc hfc0, goz goz0, int v) {
        gui gui5;
        hfc hfc1;
        ibuq.f(znp0, "adviceCardOverflowListItem");
        goz goz1 = goz0.ao(2101514616);
        int v1 = (v & 6) == 0 ? v | (((v & 8) == 0 ? goz1.X(znp0) : goz1.Z(znp0)) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            aace aace0 = (aace)goz1.h(aadh.c);
            ibuz ibuz0 = new ibuz();
            ibuz0.a = znp0.c;
            gui gui0 = zxd.d(znp0.c, 16.0f, 1.0f, goz1);
            gui gui1 = zxd.d(ibuz0.a, 1.0f, 0.0f, goz1);
            gui gui2 = zxd.d(ibuz0.a, 20.0f, 4.0f, goz1);
            gui gui3 = zxd.d(ibuz0.a, 4.0f, 20.0f, goz1);
            gui gui4 = chg.c((ibuz0.a ? -180.0f : 0.0f), chm.c(400, 0, cif.a, 2), goz1, 0, 28);
            hfc hfc2 = dls.w(hey0);
            iau iau0 = dhw.a(hei.a, false);
            int v2 = zwy.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x) {
                gui5 = gui3;
            label_37:
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            else {
                gui5 = gui3;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    goto label_37;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            hfc hfc4 = dla.i(dls.A(hey0, 0.0f, isn.a(0x7F0701A0, goz1), 1), 16.0f, 0.0f, 2);  // dimen:as_expressive_card_max_width
            hfc hfc5 = dls.w(dic.a.a(hfc4, hei.e));
            iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
            int v3 = zwy.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            dlv.a(dls.w(dls.e(hey0, ((jkv)gui0.a()).a)), goz1);
            hek hek0 = hei.k;
            hfc hfc7 = dls.w(hey0);
            float f = zxd.b(gui2);
            float f1 = zxd.b(gui2);
            float f2 = zxd.c(gui5);
            hfc hfc8 = cqx.c(hhi.a(hfc7, eah.c(f, f1, zxd.c(gui5), f2)), fpu.a(goz1).D);
            goz1.M(-1633490746);
            int v4 = goz1.Z(aace0);
            int v5 = ((v1 | 0x30) & 14) == 4 || ((v1 | 0x30) & 8) != 0 && goz1.Z(znp0) ? 1 : 0;
            Object object0 = goz1.j();
            if((v4 | v5) != 0 || object0 == gop.a) {
                object0 = new zwz(aace0, znp0);
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc9 = dla.e(cru.d(hfc8, false, null, null, null, ((ibth)object0), 15), 16.0f, 12.0f);
            iau iau2 = dll.b(dho.a, hek0, goz1, 0x30);
            int v6 = zwy.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc10 = hew.c(goz1, hfc9);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer2 = v6;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc10, ibtw3);
            jbn jbn0 = fpu.d(goz1).h;
            long v7 = fpu.a(goz1).q;
            hfc hfc11 = dlo.a(dlq.a, hey0, 1.0f);
            fiuk.b(znp0.b, hfc11, v7, 0L, jeu.b, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0x180000, 0, 131000);
            goz1 = goz1;
            zzm.a(gzf.e(0x3867D0DA, new zxc(dlq.a, ibuz0, znp0, gui4), goz1), null, 0L, goz1, 6, 6);
            goz1.z();
            hfc1 = hey0;
            dlv.a(dls.e(hfc1, ((jkv)gui1.a()).a), goz1);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zxa(znp0, hfc1, v);
        }
    }

    private static final float b(gui gui0) {
        return ((jkv)gui0.a()).a;
    }

    private static final float c(gui gui0) {
        return ((jkv)gui0.a()).a;
    }

    private static final gui d(boolean z, float f, float f1, goz goz0) {
        goz0.M(0xA9FB40BC);
        cmb cmb0 = chm.c(200, 0, cif.a, 2);
        if(!z) {
            f = f1;
        }
        gui gui0 = chg.a(f, cmb0, goz0, 0);
        goz0.x();
        return gui0;
    }
}

