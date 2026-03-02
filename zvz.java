public final class zvz {
    public static final void a(znr znr0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(znr0, "actionChips");
        goz goz1 = goz0.ao(0xE000B472);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(znr0) : goz1.Z(znr0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc0;
            dig.a(hfc1, null, false, gzf.e(0xB5AF09DC, new zvw(znr0), goz1), goz1, v1 >> 3 & 14 | 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zvp(znr0, hfc1, v);
        }
    }

    public static final void b(znq znq0, goz goz0) {
        zvz.c(znq0, null, goz0, 8);
    }

    public static final void c(znq znq0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0xED0B81D2);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(znq0) : goz1.Z(znq0)) ? 4 : 2) | v : v;
        if((v2 & 3) == 2 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            goz1.M(-1633490746);
            if((v2 & 14) != 4 && ((v2 & 8) == 0 || !goz1.Z(znq0))) {
                v1 = 0;
            }
            int v3 = goz1.Z(aacf0) | v1;
            Object object0 = goz1.j();
            if(v3 != 0 || object0 == gop.a) {
                object0 = new zvq(znq0, aacf0);
                goz1.P(object0);
            }
            goz1.x();
            firf.a(((ibth)object0), gzf.e(0xCF716B8F, new zvx(znq0), goz1), null, false, gzf.e(2026850348, new zvy(znq0), goz1), null, null, null, null, goz1, 0x6030, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zvr(znq0, hfc1, v);
        }
    }
}

