public final class ejsk {
    public static final void a(hfc hfc0, gra gra0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xF7AA4481);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(gra0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc1 = dls.B(hfc0);
            dhg dhg0 = dho.g;
            iau iau0 = dii.a(dhg0, hei.n, goz1, 54);
            int v2 = ejsi.a(gol.c(goz1));
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
            hfc hfc3 = ibuq.m(gra0.a(), ejst.a) || ibuq.m(gra0.a(), ejss.a) ? cqx.a(hfc0, 0xFFEFEFEF00000000L, eah.b(8.0f)) : hfc0;
            hej hej0 = hei.m;
            iau iau1 = dii.a(dhg0, hej0, goz1, 6);
            int v3 = ejsi.a(gol.c(goz1));
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
            dhf dhf0 = dho.h(12.0f, hej0);
            hey hey0 = hfc.e;
            iau iau2 = dll.b(dhf0, hei.k, goz1, 54);
            int v4 = ejsi.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hey0);
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
            guo.b(goz1, hfc5, ibtw3);
            cth.a(ism.a(0x7F080366, goz1, 0), null, dls.k(hey0, 22.0f), null, null, 0.0f, null, goz1, 440, 120);  // drawable:dark_logo
            String s = isq.c(((ejsv)gra0.a()).d, goz1);
            jdz jdz0 = jea.a(new jdy[]{jeg.b(0x7F09000C)});  // font:google_sans
            gdh.b(s, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, new jbn(0xFF00000000000000L, jlq.e(20), new jeu(500), jdz0, 0L, null, 0, jlq.e(24), 0, 0xFDFFD8), goz1, 0, 0, 0x1FFFE);
            goz1.z();
            String s1 = isq.c(((ejsv)gra0.a()).e, goz1);
            jdz jdz1 = jea.a(new jdy[]{jeg.b(0x7F09001F)});  // font:google_sans_text
            goz2 = goz1;
            gdh.b(s1, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, new jbn(0xA800000000000000L, jlq.e(12), new jeu(400), jdz1, 0L, null, 0, jlq.e(16), 0, 0xFDFFD8), goz2, 0, 0, 0x1FFFE);
            goz2.z();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ejsj(hfc0, gra0, v);
        }
    }
}

