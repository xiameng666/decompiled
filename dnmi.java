public final class dnmi {
    public static final void a(hfc hfc0, dnmj dnmj0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(dnmj0, "cardRewardsPreviewState");
        goz goz1 = goz0.ao(0xAF6AF9DE);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(dnmj0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            if(!hyyd.c() && !hyxx.c()) {
                goz1.M(0x91F13A37);
                hfc1 = hfc0;
                dnmi.b(hfc1, dnmj0.a, dnmj0.b, dnmj0.c, goz1, v1 & 14);
            }
            else {
                hfc1 = hfc0;
                goz1.M(-1846584006);
                dnmi.d(hfc1, dnmj0, goz1, v1 & 0x7E);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnls(hfc1, dnmj0, v);
        }
    }

    public static final void b(hfc hfc0, fryv fryv0, fryv fryv1, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(1504827092);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(null) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(fryv1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.V(0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.V(0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.W(0L) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v1) == 4793490 && goz1.ac()) {
            goz1.G();
        }
        else {
            fugo.c(0, 0x39A09, 0L, gzf.e(0x4C08C906, new dnlz(hfc0, fryv0, fryv1, ibth0), goz1), goz1, v1 >> 12 & 14 | 0xC30 | v1 >> 12 & 0x380);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnlw(hfc0, fryv0, fryv1, ibth0, v);
        }
    }

    public static final void c(hfc hfc0, fryv fryv0, fryv fryv1, ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        fcp fcp0;
        int v1;
        hfc hfc1;
        goz goz1 = goz0.ao(0x659B887F);
        boolean z = true;
        if((v & 6) == 0) {
            hfc1 = hfc0;
            v1 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(null) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(fryv1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc2 = iqn.a(dko.a(hfc1), "CardRewardsPreview");
            if(hyxx.c()) {
                goz1.M(0x2E972A9D);
                fcp0 = fcq.h(fpu.a(goz1).F, 0L, 0L, 0L, goz1, 14);
            }
            else {
                goz1.M(0x2E98C6F0);
                fcp0 = fcq.i(goz1);
            }
            goz1.x();
            eag eag0 = eah.b(28.0f);
            goz1.M(0x6CDBB17D);
            crk crk0 = hyxx.c() ? null : crl.a(1.0f, fpu.a(goz1).B);
            goz1.x();
            if(ibth0 == null) {
                z = false;
            }
            goz1.M(0x6CDBC6AC);
            if(ibth0 == null) {
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                if(object0 == gop.a) {
                    object0 = new dnlt();
                    goz1.P(object0);
                }
                goz1.x();
                ibth1 = (ibth)object0;
            }
            else {
                ibth1 = ibth0;
            }
            goz1.x();
            fdb.b(ibth1, hfc2, z, eag0, fcp0, null, crk0, gzf.e(1810515828, new dnmc(fryv0, fryv1), goz1), goz1, 0x6000000, 0xA0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnlu(hfc0, fryv0, fryv1, ibth0, v);
        }
    }

    public static final void d(hfc hfc0, dnmj dnmj0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x28FE518B);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(dnmj0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc0;
            dnmi.e(hfc1, dnmj0.a, dnmj0.b, dnmj0.c, dnmj0.e, dnmj0.d, goz1, v1 & 14);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnlv(hfc1, dnmj0, v);
        }
    }

    public static final void e(hfc hfc0, fryv fryv0, fryv fryv1, ibth ibth0, boolean z, fule fule0, goz goz0, int v) {
        boolean z1;
        ibth ibth1;
        fryv fryv3;
        fryv fryv2;
        goz goz1 = goz0.ao(665040645);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            fryv2 = fryv0;
            v1 |= (goz1.Z(fryv2) ? 0x20 : 16);
        }
        else {
            fryv2 = fryv0;
        }
        if((v & 0x180) == 0) {
            fryv3 = fryv1;
            v1 |= (goz1.Z(fryv3) ? 0x100 : 0x80);
        }
        else {
            fryv3 = fryv1;
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.V(0) ? 0x800 : 0x400);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.W(0L) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x100000 : 0x80000);
        }
        else {
            ibth1 = ibth0;
        }
        if((0xC00000 & v) == 0) {
            z1 = z;
            v1 |= (goz1.Y(z1) ? 0x800000 : 0x400000);
        }
        else {
            z1 = z;
        }
        if((0x6000000 & v) == 0) {
            v1 |= (goz1.V((fule0 == null ? -1 : fule0.ordinal())) ? 0x4000000 : 0x2000000);
        }
        if((0x2490493 & v1) == 0x2490492 && goz1.ac()) {
            goz1.G();
        }
        else {
            fugo.c(0, 0x39A09, 0L, gzf.e(0xEC1F12B7, new dnmh(hfc0, z1, fule0, ibth1, fryv2, fryv3), goz1), goz1, v1 >> 9 & 14 | 0xC30 | v1 >> 9 & 0x380);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnlx(hfc0, fryv0, fryv1, ibth0, z, fule0, v);
        }
    }
}

