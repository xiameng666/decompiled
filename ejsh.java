public final class ejsh {
    public static final void a(hfc hfc0, gra gra0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x5440C821);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(gra0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dls.D(hfc0, null, 3);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v2 = ejsf.a(gol.c(goz1));
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
            guo.b(goz1, hfc2, ibtw3);
            hey hey0 = hfc.e;
            hfc hfc3 = dls.D(dls.B(hey0), null, 3);
            eag eag0 = eah.b(10.0f);
            iau iau1 = dhw.a(hei.a, false);
            int v3 = ejsf.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, cqx.a(crd.c(hfc3, 1.0f, 0xFF74777500000000L, eah.b(10.0f)), 0xFFF2F2F200000000L, eag0));
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
            guo.b(goz1, hfc4, ibtw3);
            hfc hfc5 = dls.D(dls.B(dla.d(hey0, 2.0f)), null, 3);
            iau iau2 = dii.a(dho.c, hei.n, goz1, 0x30);
            int v4 = ejsf.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc6 = hew.c(goz1, cqx.a(hfc5, 0xFFFFFFFF00000000L, eah.b(10.0f)));
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
            cth.a(ism.a(0x7F080908, goz1, 0), null, dla.j(hey0, 0.0f, 5.0f, 0.0f, 0.0f, 13), null, null, 0.0f, null, goz1, 440, 120);  // drawable:mobile_notch_icon
            cth.a(ism.a(0x7F080907, goz1, 0), null, dla.j(dls.o(hey0, 50.0f), 0.0f, 10.0f, 0.0f, 12.0f, 5), null, null, 0.0f, null, goz1, 440, 120);  // drawable:mobile_header_icon
            hfc hfc7 = cqx.a(dls.k(dla.j(hey0, 5.0f, 0.0f, 5.0f, 65.0f, 2), 70.0f), hln.d(((ejsv)gra0.a()).c), eah.b(10.0f));
            iau iau3 = dhw.a(hei.e, false);
            int v5 = ejsf.a(gol.c(goz1));
            gzk gzk3 = goz1.ak();
            hfc hfc8 = hew.c(goz1, hfc7);
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
            guo.b(goz1, hfc8, ibtw3);
            cth.a(ism.a(((ejsv)gra0.a()).b, goz1, 0), null, hhi.a(dla.d(hey0, 5.0f), eah.b(5.0f)), null, hys.b, 0.0f, null, goz1, 0x6038, 104);
            goz1.z();
            goz1.z();
            goz1.z();
            fkx.c(dls.e(hey0, 150.0f), 5.0f, 0x146991D600000000L, goz1, 438, 0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ejsg(hfc0, gra0, v);
        }
    }
}

