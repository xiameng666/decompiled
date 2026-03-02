public final class fudy {
    public static final void a(hfc hfc0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(1016412860);
        if((((v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc1 = dls.w(hfc0);
            dhg dhg0 = dho.g(8.0f);
            hek hek0 = hei.k;
            iau iau0 = dll.b(dhg0, hek0, goz1, 54);
            int v1 = fudw.a(gol.c(goz1));
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
            long v2 = fpu.a(goz1).c;
            eag eag0 = eah.b(22.0f);
            hfc hfc3 = dla.e(cqx.a(hfc.e, v2, eag0), 8.0f, 2.0f);
            iau iau1 = dll.b(dho.a, hek0, goz1, 0x30);
            int v3 = fudw.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
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
            String s = isq.c(0x7F15355F, goz1);  // string:wallet_ui_component_route_connection "Connection"
            jbn jbn0 = fpu.d(goz1).n;
            goz2 = goz1;
            gdh.b(s, null, fpu.a(goz1).d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz2, 0, 0, 0x1FFFA);
            goz2.z();
            ftwt.a(null, 0.0f, 0.0f, 0L, goz2, 0);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fudx(hfc0, v);
        }
    }
}

