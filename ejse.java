public final class ejse {
    public static final void a(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xAF6C713C);
        if((((v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dls.D(dls.B(hfc0), null, 3);
            dhn dhn0 = dho.c;
            iau iau0 = dii.a(dhn0, hei.n, goz1, 0x30);
            int v1 = ejsc.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            hey hey0 = hfc.e;
            hfc hfc3 = cqx.c(dls.B(hey0), hll.e);
            iau iau1 = dii.a(dhn0, hei.m, goz1, 0x30);
            int v2 = ejsc.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, crd.c(hfc3, 8.0f, 0xFFDADCE000000000L, eah.b(20.0f)));
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc4, ibtw3);
            cth.a(ism.a(0x7F080284, goz1, 0), null, dla.f(hey0, 20.0f, 15.0f, 20.0f, 30.0f), null, null, 0.0f, null, goz1, 440, 120);  // drawable:browser_search_bar
            cth.a(ism.a(0x7F080283, goz1, 0), null, dla.j(hey0, 20.0f, 0.0f, 0.0f, 45.0f, 6), null, null, 0.0f, null, goz1, 440, 120);  // drawable:browser_landing
            goz1.z();
            hfc hfc5 = dla.j(dls.w(hey0), 10.0f, 5.0f, 10.0f, 0.0f, 8);
            iau iau2 = dll.b(dho.a, hei.j, goz1, 0);
            int v3 = ejsc.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc6 = hew.c(goz1, crd.c(hfc5, 8.0f, 0xFFDADCE000000000L, eah.b(20.0f)));
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer2 = v3;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            fkx.b(null, 8.0f, 0xFFDADCE000000000L, goz1, 0x1B0, 1);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ejsd(hfc0, v);
        }
    }
}

