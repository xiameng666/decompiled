public final class zza {
    public static final void a(zoo zoo0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xB46A1A62);
        int v1 = (v & 6) == 0 ? (goz1.Z(zoo0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dla.i(dls.w(dls.A(hfc0, 0.0f, isn.a(0x7F0701A0, goz1), 1)), 16.0f, 0.0f, 2);  // dimen:as_expressive_card_max_width
            iau iau0 = dhw.a(hei.a, false);
            int v2 = zys.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            aaas.a(zoo0.b, zoo0.c, zoo0.a, zoo0.d, zoo0.e, null, false, null, null, goz1, 0x8000, 480);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyw(zoo0, hfc0, v);
        }
    }

    public static final void b(zop zop0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xF0958AA2);
        int v1 = (v & 6) == 0 ? (goz1.Z(zop0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dla.e(dls.w(dls.A(hfc0, 0.0f, isn.a(0x7F0701A0, goz1), 1)), 24.0f, 16.0f);  // dimen:as_expressive_card_max_width
            iau iau0 = dhw.a(hei.a, false);
            int v2 = zys.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            aabc.a.c(zop0.a, null, goz1, 0x180);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyt(zop0, hfc0, v);
        }
    }

    public static final void c(doz doz0, gged_interceptors gged0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(doz0, "state");
        ibuq.f(gged0, "items");
        goz goz1 = goz0.ao(0xE30CEED0);
        int v1 = (v & 6) == 0 ? (goz1.X(doz0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(gged0) ? 0x20 : 16);
        }
        if(((v1 | 0x180) & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            float f = dmk.b(new dkt(dmw.d(goz1), 0x20), goz1).a();
            hfc hfc2 = dls.v(hfc1);
            dhg dhg0 = dho.g(2.0f);
            hej hej0 = hei.n;
            dld dld0 = dla.h(0.0f, 0.0f, 0.0f, f + 16.0f, 7);
            goz1.M(5004770);
            boolean z = goz1.Z(gged0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new zyx(gged0);
                goz1.P(object0);
            }
            goz1.x();
            dnh.a(hfc2, doz0, dld0, false, dhg0, hej0, null, false, null, ((ibts)object0), goz1, (v1 | 0x180) << 3 & 0x70 | 0x36000, 456);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyy(doz0, gged0, hfc1, v);
        }
    }
}

