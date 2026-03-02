public final class aabk {
    public static final void a(String s, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "displayEmail");
        goz goz1 = goz0.ao(0x841061F8);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).k;
            goz2 = goz1;
            fiuk.b(s, null, fpu.a(goz1).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, jbn0, goz2, v1 & 14, 0x6180, 0x1AFFA);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new aabh(s, v);
        }
    }

    public static final void b(String s, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "displayName");
        goz goz1 = goz0.ao(1390187087);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).v;
            goz2 = goz1;
            fiuk.b(s, null, fpu.a(goz1).q, 0L, jeu.b, 0L, null, 0L, 2, false, 1, 0, null, jbn0, goz2, v1 & 14 | 0x180000, 0x6180, 0x1AFBA);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new aabj(s, v);
        }
    }

    public static final void c(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(1193985005);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = eah.b(12.0f);
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc1 = dla.e(cqx.c(hhi.a(hfc0, ((eag)object0)), fpu.a(goz1).G), 2.0f, 8.0f);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v1 = aabd.a(gol.c(goz1));
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
            fiso.a(ism.a(0x7F080D58, goz1, 0), null, null, fpu.a(goz1).q, goz1, 56, 4);  // drawable:quantum_ic_keyboard_arrow_down_vd_theme_24
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aabi(hfc0, v);
        }
    }

    public static final void d(zpt zpt0, hfc hfc0, goz goz0, int v) {
        ibtw ibtw4;
        String s2;
        hfc hfc1;
        ibuq.f(zpt0, "welcomeScreenIntroListItem");
        goz goz1 = goz0.ao(-1631074492);
        if(((((v & 6) == 0 ? v | (((v & 8) == 0 ? goz1.X(zpt0) : goz1.Z(zpt0)) ? 4 : 2) : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            grwp grwp0 = zhz.b(zpt0.d);
            boolean z = grwp0 != null;
            String s = zpt0.a;
            String s1 = zpt0.b;
            goz1.M(200490621);
            if(s1 == null) {
                s1 = isq.c(0x7F1508E5, goz1);  // string:common_switch_account "Switch account"
            }
            goz1.x();
            aaca aaca0 = (aaca)goz1.h(aadh.g);
            hfc hfc2 = dls.w(hfc1);
            iau iau0 = dhw.a(hei.a, false);
            int v1 = aabd.a(gol.c(goz1));
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
                s2 = s1;
            label_38:
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            else {
                s2 = s1;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                    goto label_38;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            hfc hfc4 = dla.e(dls.A(hfc1, 0.0f, isn.a(0x7F0701A0, goz1), 1), 16.0f, 12.0f);  // dimen:as_expressive_card_max_width
            hfc hfc5 = dls.w(dic.a.a(hfc4, hei.e));
            iau iau1 = dll.b(dho.g, hei.k, goz1, 54);
            hek hek0 = hei.k;
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
            int v2 = aabd.a(gol.c(goz1));
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
            guo.b(goz1, hfc6, ibtw3);
            zhu zhu0 = zpt0.c;
            String s3 = zpt0.e;
            hfc hfc7 = dls.k(hfc1, 80.0f);
            goz1.M(-1633490746);
            int v3 = goz1.Z(aacf0) | goz1.X(grwp0);
            Object object0 = goz1.j();
            if(v3 != 0 || object0 == gop.a) {
                object0 = new aabe(aacf0, grwp0);
                goz1.P(object0);
            }
            goz1.x();
            aaco.a(zhu0, s3, hfc7, z, ((ibth)object0), true, z, goz1, 0x30180, 0);
            hfc hfc8 = hhi.a(hfc1, aacp.a);
            goz1.M(5004770);
            boolean z1 = goz1.Z(aaca0);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                object1 = new aabf(aaca0);
                goz1.P(object1);
            }
            goz1.x();
            hfc hfc9 = dla.f(cru.d(hfc8, false, null, null, null, ((ibth)object1), 15), 12.0f, 12.0f, 16.0f, 12.0f);
            iau iau2 = dll.b(dho.a, hek0, goz1, 0x30);
            int v4 = aabd.a(gol.c(goz1));
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
            if(!goz1.x && ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                ibtw4 = ibtw2;
            }
            else {
                Integer integer2 = v4;
                goz1.P(integer2);
                ibtw4 = ibtw2;
                goz1.p(integer2, ibtw4);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc10, ibtw3);
            hfc hfc11 = dlo.a(dlq.a, hfc1, 1.0f);
            iau iau3 = dii.a(dho.c, hei.m, goz1, 0);
            int v5 = aabd.a(gol.c(goz1));
            gzk gzk3 = goz1.ak();
            hfc hfc12 = hew.c(goz1, hfc11);
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
                goz1.p(integer3, ibtw4);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc12, ibtw3);
            aabk.b(s, goz1, 0);
            aabk.a(s2, goz1, 0);
            goz1.z();
            aabk.c(null, goz1, 0);
            goz1.z();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aabg(zpt0, hfc1, v);
        }
    }
}

