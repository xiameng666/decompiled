public final class ejsr {
    public static final void a(hfc hfc0, gra gra0, ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        hfc hfc1;
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0xF49057CD);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(gra0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            ibth1 = ibth0;
            goto label_33;
        }
        String s = isq.c(((ejsv)gra0.a()).f, goz1);
        ejsv ejsv0 = (ejsv)gra0.a();
        if(ibuq.m(ejsv0, ejst.a)) {
            goz1.M(0x11D9B907);
            hfc1 = hfc0;
            ejrs.a(hfc1, null, s, ibth0, goz1, v1 & 14 | v1 << 3 & 0x1C00);
            goz1 = goz1;
            ibth1 = ibth0;
            goz1.x();
            goto label_33;
        }
        hfc1 = hfc0;
        ibth1 = ibth0;
        if(ibuq.m(ejsv0, ejsu.a)) {
            goz1.M(0x11D9C4AB);
            ejrj.a(hfc1, null, null, s, ibth1, goz1, v1 & 14 | v1 << 6 & 0xE000);
            goz1.x();
            goto label_33;
        }
        if(ibuq.m(ejsv0, ejss.a)) {
            goz1.M(0x11D9D0CB);
            ejrn.a(hfc1, null, null, s, ibth1, goz1, v1 & 14 | v1 << 6 & 0xE000);
            goz1.x();
        label_33:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new ejsq(hfc1, gra0, ibth1, v);
            }
            return;
        }
        goz1.M(299479720);
        goz1.x();
        throw new ibnq();
    }
}

