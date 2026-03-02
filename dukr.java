public final class dukr {
    public static final void a(hfc hfc0, fryk fryk0, hll hll0, goz goz0, int v, int v1) {
        hll hll1;
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0x51F39078);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.X(hll0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            hll1 = hll0;
        }
        else {
            hfc hfc2 = (v1 & 1) == 0 ? hfc0 : hfc.e;
            hlb hlb0 = null;
            hll hll2 = (v1 & 4) == 0 ? hll0 : null;
            hel hel0 = hei.e;
            hyt hyt0 = hys.g;
            if(hll2 != null) {
                hlb0 = new hlb(hll2.j, 5);
            }
            ftyy.b(fryk0, null, hfc2, hel0, hyt0, 1.0f, hlb0, goz1, v2 >> 3 & 14 | 0x36C30 | v2 << 6 & 0x380, 0);
            hfc1 = hfc2;
            hll1 = hll2;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dukm(hfc1, fryk0, hll1, v, v1);
        }
    }

    public static final void b(hfc hfc0, fryk fryk0, duku duku0, goz goz0, int v) {
        goz goz1 = goz0.ao(-2032051717);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(duku0.ordinal()) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dii.a(dho.c, hei.n, goz1, 0x30);
            int v2 = dukg.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            switch(duku0.ordinal()) {
                case 0: {
                    goz1.M(0x3532401);
                    iau iau1 = dll.b(dho.e, hei.j, goz1, 6);
                    int v3 = dukg.a(gol.c(goz1));
                    gzk gzk1 = goz1.ak();
                    hfc hfc2 = hew.c(goz1, hfc0);
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
                    guo.b(goz1, hfc2, ibtw3);
                    dukr.a(dls.k(hfc.e, 40.0f), fryk0, null, goz1, v1 & 0x70 | 6, 4);
                    goz1.z();
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(0x350FAF8);
                    dukr.c(hfc0, fryk0, goz1, v1 & 0x7E);
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(0xB5C8C773);
                    goz1.x();
                    throw new ibnq();
                }
            }
            dlv.a(dls.e(hfc.e, 8.0f), goz1);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dukh(hfc0, fryk0, duku0, v);
        }
    }

    public static final void c(hfc hfc0, fryk fryk0, goz goz0, int v) {
        fryk fryk1;
        goz goz1 = goz0.ao(-1017497691);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
        }
        else {
            iau iau0 = dll.b(dho.h(8.0f, hei.n), hei.k, goz1, 54);
            int v2 = dukg.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            dukr.a(dls.k(hfc.e, 40.0f), new fryh(0x7F080A42), null, goz1, 6, 4);  // drawable:playstore_icon_wallet
            dukr.a(dls.k(hfc.e, 24.0f), new fryh(0x7F0804D6), new hll(fpu.a(goz1).q), goz1, 6, 0);  // drawable:gs_arrow_forward_vd_theme_24
            fryk1 = fryk0;
            dukr.a(dls.k(hfc.e, 40.0f), fryk1, null, goz1, v1 & 0x70 | 6, 4);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duki(hfc0, fryk1, v);
        }
    }

    public static final void d(hfc hfc0, dukt dukt0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1820936829);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.Z(dukt0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new dukk();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc1 = iuc.d(hfc0, ((ibts)object0));
            iau iau0 = dii.a(dho.g(2.0f), hei.m, goz1, 0);
            int v1 = dukg.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            ftxi ftxi0 = dukt0.c;
            if(ftxi0 == null) {
                goz1.M(1049533542);
                dulc.f(null, duld.c(dukt0.d, fule.b), goz1, 0);
            }
            else {
                goz1.M(1049265981);
                ftxf.a(null, ftxi.c(ftxi0, null, null, fule.b, true, 0x1FFF), goz1, 0x40, 1);
                dulc.f(null, duld.c(dukt0.d, fule.c), goz1, 0);
            }
            goz1.x();
            goz1.M(0xD8BA57F4);
            fryv fryv0 = dukt0.e;
            if(fryv0 != null) {
                dukr.f(null, fryv0, goz1, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dukl(hfc0, dukt0, v);
        }
    }

    public static final void e(hfc hfc0, dukt dukt0, ibts ibts0, cvq cvq0, fyx fyx0, goz goz0, int v) {
        hfc hfc2;
        goz goz2;
        hfc hfc1;
        ibuq.f(dukt0, "state");
        ibuq.f(ibts0, "onMoreButtonClicked");
        goz goz1 = goz0.ao(0x2723091);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(dukt0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(cvq0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(fyx0) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc2 = hfc0;
            }
            else {
                hfc2 = hfc.e;
            }
            goz1.w();
            hfc hfc3 = iqn.a(hfc2, "PresentationModalBottomSheet");
            long v2 = fpu.a(goz1).I;
            gze gze0 = gzf.e(-2005179690, new dukq(cvq0, dukt0, dukt0, ibts0), goz1);
            goz2 = goz1;
            fsr.c(dukt0.h, hfc3, fyx0, 0.0f, false, null, v2, 0L, 0.0f, hll.h, duja.a, null, null, gze0, goz2, v1 >> 6 & 0x380 | 0x30000000, 0xC06, 6584);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dukj(hfc1, dukt0, ibts0, cvq0, fyx0, v);
        }
    }

    public static final void f(hfc hfc0, fryv fryv0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        goz goz1 = goz0.ao(0x3DAED401);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(fryv0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc2 = duiy.a(hey0, fule.d, goz1);
            iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
            int v2 = dukg.a(gol.c(goz1));
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
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc3, iej.c);
            jbn jbn0 = fpu.d(goz1).l;
            goz2 = goz1;
            ftzd.a(fryv0, null, fpu.a(goz1).q, 0L, null, 0L, new jjy(5), 0L, 0, false, 0, 0, null, null, jbn0, goz2, v1 >> 3 & 14, 0, 0x1FDFA);
            goz2.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dukn(hfc1, fryv0, v);
        }
    }
}

