public final class zyf {
    public static final void a(zok zok0, aaby aaby0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1306711005);
        int v1 = (v & 6) == 0 ? (goz1.Z(zok0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(aaby0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_37;
        }
        aacg aacg0 = (aacg)goz1.h(aadh.f);
        if(zok0 == null) {
            gsb gsb0 = goz1.af();
            if(gsb0 == null) {
                return;
            }
            gsb0.d = new zxy(aaby0, v);
            return;
        }
        if((zok0 instanceof zoj)) {
            goz1.M(0x9F82CC21);
            goz1.M(-1633490746);
            int v2 = goz1.Z(aacg0) | goz1.Z(aaby0);
            Object object0 = goz1.j();
            if(v2 != 0 || object0 == gop.a) {
                object0 = new zxz(aacg0, aaby0);
                goz1.P(object0);
            }
            goz1.x();
            fiqv.c(((ibth)object0), null, false, null, fiqq.e(fpu.a(goz1).a, goz1, 13), null, null, gzf.e(367200088, new zyd(zok0), goz1), goz1, 0x30000000, 494);
            goz1.x();
            goto label_37;
        }
        if((zok0 instanceof zoi)) {
            goz1.M(0x9F82EC1E);
            goz1.M(-1633490746);
            int v3 = goz1.Z(aacg0) | goz1.Z(aaby0);
            Object object1 = goz1.j();
            if(v3 != 0 || object1 == gop.a) {
                object1 = new zya(aacg0, aaby0);
                goz1.P(object1);
            }
            goz1.x();
            fiqv.a(((ibth)object1), null, false, null, fiqq.c(fpu.a(goz1).a, fpu.a(goz1).b, goz1, 12), null, null, null, gzf.e(0xABEFF874, new zye(zok0), goz1), goz1, 0x30000000, 494);
            goz1 = goz1;
            goz1.x();
        label_37:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new zyb(zok0, aaby0, v);
            }
            return;
        }
        goz1.M(0x9F82C84A);
        goz1.x();
        throw new ibnq();
    }

    public static final void b(String s, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x1BF654A8);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).m;
            goz2 = goz1;
            fiuk.b(s, null, 0L, 0L, jeu.b, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz2, v1 & 14 | 0x180000, 0, 0x1FFBE);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new zyc(s, v);
        }
    }

    public static final void c(zol zol0, hfc hfc0, goz goz0, int v) {
        zol zol1 = zol0;
        hfc hfc1 = hfc0;
        ibuq.f(zol1, "listItem");
        goz goz1 = goz0.ao(-2081680960);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(zol1) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc2 = dla.i(dls.w(dls.A(hfc1, 0.0f, isn.a(0x7F0701A0, goz1), 1)), 16.0f, 0.0f, 2);  // dimen:as_expressive_card_max_width
            dhn dhn0 = dho.c;
            hej hej0 = hei.m;
            iau iau0 = dii.a(dhn0, hej0, goz1, 0);
            int v2 = zxw.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            hfc hfc4 = dla.j(hfc.e, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            hey hey0 = hfc.e;
            iau iau1 = dii.a(dhn0, hei.o, goz1, 0x30);
            int v3 = zxw.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
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
            guo.b(goz1, hfc5, ibtw3);
            iau iau2 = dll.b(dho.g, hei.k, goz1, 54);
            int v4 = zxw.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hey0);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer2 = v4;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            hfc hfc7 = dls.k(dla.j(hey0, 0.0f, 0.0f, 16.0f, 0.0f, 11), 40.0f);
            aadq.b(zol1.b, hys.b, hfc7, 0L, 40, 40, goz1, 0x361B0, 8);
            hfc hfc8 = dlo.a(dlq.a, hey0, 1.0f);
            iau iau3 = dii.a(dhn0, hej0, goz1, 0);
            int v5 = zxw.a(gol.c(goz1));
            gzk gzk3 = goz1.ak();
            hfc hfc9 = hew.c(goz1, hfc8);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau3, ibtw0);
            guo.b(goz1, gzk3, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer3 = v5;
                goz1.P(integer3);
                goz1.p(integer3, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc9, ibtw3);
            zol1 = zol0;
            jbn jbn0 = fpu.d(goz1).h;
            long v6 = fpu.a(goz1).q;
            hfc1 = hfc0;
            fiuk.b(zol1.c, hfc1, v6, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, v1 & 0x70, 0, 0x1FFF8);
            goz1 = goz1;
            String s = zol1.d;
            goz1.M(1317084063);
            if(s != null) {
                jbn jbn1 = fpu.d(goz1).k;
                fiuk.b(s, null, fpu.a(goz1).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn1, goz1, 0, 0, 0x1FFFA);
                goz1 = goz1;
            }
            goz1.x();
            goz1.z();
            goz1.z();
            zyf.a(zol1.e, zol1.a, goz1, 0);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zxx(zol1, hfc1, v);
        }
    }

    public static final void d(String s, goz goz0) {
        zyf.b(s, goz0, 0);
    }
}

